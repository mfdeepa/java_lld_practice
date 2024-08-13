package practiceDesignPattern.splitwise.repositories;

import practiceDesignPattern.splitwise.models.UserExpense;

import java.util.ArrayList;
import java.util.List;

public class UserExpenseRepository {

    private List<UserExpense> userExpenses = new ArrayList<>();

    public List<UserExpense> getUserExpense() {
        return userExpenses;
    }

    public void setUserExpense(List<UserExpense> userExpense) {
        this.userExpenses = userExpenses;
    }
    public List<UserExpense> findUserExpenseByExpense(String desc){
        List<UserExpense> userExpenseList = new ArrayList<>();
        for(UserExpense userExpense: userExpenses){
            if(desc.equals(userExpense.getExpense().getDescription())){
                userExpenseList.add(userExpense);
            }

        }
        return userExpenseList;
    }
}
