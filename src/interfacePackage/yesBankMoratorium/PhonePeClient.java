package interfacePackage.yesBankMoratorium;

public class PhonePeClient {
    public static void main(String[] args) {
        openBankingApi openBanking = new IciciBankApi();
        openBanking.checkBalance();
        openBanking.transferMoney("Deepa","deepti",10000);
        //openBankingApi yesbankapi = new yesBankApi();
    }
}
