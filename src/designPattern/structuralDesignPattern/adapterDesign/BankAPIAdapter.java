package designPattern.structuralDesignPattern.adapterDesign;

public interface BankAPIAdapter {
    double getBalance(String accountNUmber);
    boolean sendMoney(String fromAccount,
                      String toAccount,
                      double amount);
}
