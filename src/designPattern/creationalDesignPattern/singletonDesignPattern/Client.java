package designPattern.creationalDesignPattern.singletonDesignPattern;

import designPattern.creationalDesignPattern.singletonDesignPattern.eagerLoading.DatabaseConnection;
//we are not importing .getinstance of double check b'coz of private method.

public class Client {
    public static void main(String[] args) {
        DatabaseConnection databaseConnection = DatabaseConnection.getInstance();
    }
}
