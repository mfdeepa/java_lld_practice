package interfacePackage.yesBankMoratorium;

public class IciciBankApi implements openBankingApi{

    @Override
    public void checkBalance() {

    }

    @Override
    public void transferMoney(String from, String to, double amount) {
        System.out.println(from +" "+ to +" "+ amount);
    }

    @Override
    public float rateOfReturn() {
        return 0;
    }
}
