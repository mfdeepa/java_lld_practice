package executorAndCallable.collable;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

public class Client {
    public static void main(String[] args) throws Exception{
        FutureTask[] randomNoTasks = new FutureTask[10];
        //loop on threading 10
        for(int j = 0;j<10;j++){
            //creating new object of callable class
            Callable cbl = new JavaCollable();
            //create future task with callable
            randomNoTasks[j] = new FutureTask(cbl);
            //create a Thread for future class object
            Thread th = new Thread(randomNoTasks[j]);
            th.start();
        }
        //using get method
        for(int j =0;j<10;j++){
            //invoking the get method
            Object o = randomNoTasks[j].get();
            //here get method throws ExecutionException, InterruptedException
            //b'coz of this reason we add Exception

            System.out.println("this random number is: " + o);

        }
    }
}
