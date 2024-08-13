package practiceDesignPattern.splitwise.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Expense {
    private String description;
    private int amount; //TOTAL AMOUNT OF THE expense -> bill amount
    private ExpenseType expenseType;

    public Expense(String description, int amount, ExpenseType expenseType) {
        this.description = description;
        this.amount = amount;
        this.expenseType = expenseType;
    }
}
