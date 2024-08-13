package designPattern.creationalDesignPattern.singletonDesignPattern.eagerLoading;
//here we create object while creating the class but this is not correct best practice b'coz of it process become slow
// and client can not give the parameter.
public class DatabaseConnection {
    public static DatabaseConnection databaseConnection = new DatabaseConnection();
    private DatabaseConnection(){}; // creating constructor private
    public static DatabaseConnection getInstance(){
        return databaseConnection;
    }

}
