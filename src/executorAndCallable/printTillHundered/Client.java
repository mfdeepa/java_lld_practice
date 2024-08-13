package executorAndCallable.printTillHundered;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Client {
    public static void main(String[] args) {
        ExecutorService es = Executors.newFixedThreadPool(5);
        ExecutorService es1 = Executors.newCachedThreadPool();
        for(int i=0;i<=100;i++){
            if(i ==5 || i ==11|| i ==20||i==88){
                System.out.println("DEBUG...");
            }
            NumberPrinter  np = new NumberPrinter(i);
            es.execute(np); //this execute method takes the runnable command i.e np and run the thread.
        }

    }
}
