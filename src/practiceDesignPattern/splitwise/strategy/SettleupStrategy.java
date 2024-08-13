package practiceDesignPattern.splitwise.strategy;

import practiceDesignPattern.splitwise.dtos.Transaction;
import practiceDesignPattern.splitwise.models.User;

import java.util.List;
import java.util.Map;

public interface SettleupStrategy {
    public List<Transaction> settleupUser(Map<User, Integer > map);
}
