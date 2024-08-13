package designPattern.creationalDesignPattern.singletonDesignPattern.doubleCheckLocking;
/* pros: Resource efficiency and Creating a new object is inefficient.

cons: difficulties in testing a singleton class.
 */
public class DatabaseConnection {
    private static DatabaseConnection databaseConnection = null;
    private DatabaseConnection(){}
    private static DatabaseConnection getInstance(){
        if(databaseConnection == null){
            //t1,t2 check without a lock
            synchronized (DatabaseConnection.class){ //taking a lock here
                if(databaseConnection == null){ //second check after lock
                    databaseConnection = new DatabaseConnection();
                }
            }
        }
        return databaseConnection;
    }
}
