package practiceDesignPattern.splitwise.runner;

import practiceDesignPattern.splitwise.Services.UserService;
import practiceDesignPattern.splitwise.controller.HeapSettleupStrategy;
import practiceDesignPattern.splitwise.controller.UserController;
import practiceDesignPattern.splitwise.dtos.Transaction;
import practiceDesignPattern.splitwise.models.*;
import practiceDesignPattern.splitwise.repositories.ExpenseRepository;
import practiceDesignPattern.splitwise.repositories.GroupRepository;
import practiceDesignPattern.splitwise.repositories.UserExpenseRepository;
import practiceDesignPattern.splitwise.repositories.UserRepository;

import java.util.ArrayList;
import java.util.List;

public class App {

    public static void main(String[] args) {
        // 1. create users
        User deepa = new User("deepa", "1234", "4321");
        User deepti = new User("deepti", "1234", "4321");
        User diya = new User("diya", "1234", "4321");
        User daya  = new User("daya", "1234", "4321");

        List<User> goaGuys = new ArrayList<>();
        goaGuys.add(deepa);
        goaGuys.add(deepti);
        goaGuys.add(diya);
        goaGuys.add(daya);

        // 2. create the group and add these users to the group
        Group goaTrip = new Group("GOA-TRIP");
        goaTrip.setUsers(goaGuys);

        //3. they went for goa. go for dinner
        // create expenses
        Expense dinnerExpense = new Expense("deepa", 5000, ExpenseType.REGULAR);

        //4. add the expense share of everyone
        UserExpense deepaShare = new UserExpense(deepa, dinnerExpense, 1000, UserExpenseType.HAD_TO_PAY);
        UserExpense deeptiShare = new UserExpense(deepa, dinnerExpense, 1000, UserExpenseType.HAD_TO_PAY);
        UserExpense diyaShare = new UserExpense(deepa, dinnerExpense, 1000, UserExpenseType.HAD_TO_PAY);
        UserExpense dayaShare = new UserExpense(deepa, dinnerExpense, 2000, UserExpenseType.HAD_TO_PAY);

        //5. capture who actully paid the amount
        UserExpense paidbyDeepa = new UserExpense(deepa,dinnerExpense,5000, UserExpenseType.PAID_BY);

        // manually add all these details to the database
        UserRepository userRepository = new UserRepository();
        GroupRepository groupRepository = new GroupRepository();
        UserExpenseRepository userExpenseRepository = new UserExpenseRepository();
        ExpenseRepository expenseRepository = new ExpenseRepository();

        userRepository.setUsers(goaGuys);
        goaTrip.getExpenses().add(dinnerExpense);
        groupRepository.getGroups().add(goaTrip);
        expenseRepository.getExpense().add(dinnerExpense);

        userExpenseRepository.getUserExpense().add(deepaShare);
        userExpenseRepository.getUserExpense().add(deeptiShare);
        userExpenseRepository.getUserExpense().add(diyaShare);
        userExpenseRepository.getUserExpense().add(dayaShare);
        userExpenseRepository.getUserExpense().add(paidbyDeepa);

        UserController userController = new UserController(new UserService(groupRepository, userExpenseRepository, new HeapSettleupStrategy()));
        List<Transaction> userTransactions = userController.settleUser("deepa", "GOA-TRIP");

        for(Transaction transaction: userTransactions){
            System.out.println(transaction.getFrom() + " -> " + transaction.getTo() +" : " + transaction.getAmount());

        }
        /*
        Expected :
            deepti -> deepa = 1000
            diya -> deepa = 1000
            daya -> deepa = 2000
         */


    }
}
