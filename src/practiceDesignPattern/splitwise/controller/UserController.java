package practiceDesignPattern.splitwise.controller;

import practiceDesignPattern.splitwise.Services.UserService;
import practiceDesignPattern.splitwise.dtos.Transaction;

import java.util.List;

public class UserController {
    private UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public List<Transaction> settleUser(String userName, String groupName){
        return userService.settleUser(userName, groupName);
    }



}
