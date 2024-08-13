package practiceDesignPattern.splitwise.command;

import practiceDesignPattern.splitwise.Services.UserService;
import practiceDesignPattern.splitwise.controller.HeapSettleupStrategy;
import practiceDesignPattern.splitwise.controller.UserController;
import practiceDesignPattern.splitwise.repositories.GroupRepository;
import practiceDesignPattern.splitwise.repositories.UserExpenseRepository;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CommandExecutor ce = new CommandExecutor(
                new SettleUpUserCommand(
                        new UserController(
                                new UserService(
                                        new GroupRepository(),
                                        new UserExpenseRepository(),
                                        new HeapSettleupStrategy()
                                )
                        )
                )
        );

        while(true){
            String input = scanner.next();
            // input -> deepa goa trip settleUser
            ce.execute(input);
        }






    }
}
