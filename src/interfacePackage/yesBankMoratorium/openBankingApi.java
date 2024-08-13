package interfacePackage.yesBankMoratorium;

public interface openBankingApi {
    void checkBalance();

    void transferMoney(String from, String to, double amount);
    float rateOfReturn();
}