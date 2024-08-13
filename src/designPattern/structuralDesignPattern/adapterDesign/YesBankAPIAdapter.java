package designPattern.structuralDesignPattern.adapterDesign;

import designPattern.structuralDesignPattern.adapterDesign.yesBank.YesBankAPI;

public class YesBankAPIAdapter implements BankAPIAdapter {
    private YesBankAPI yesBankAPI = new YesBankAPI();

    @Override
    public double getBalance(String accountNUmber) {
        return 0.0;
    }

    @Override
    public boolean sendMoney(String fromAccount, String toAccount, double amount) {
        return false;
    }
}
