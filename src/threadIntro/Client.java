package threadIntro;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

public class Client {
    static void doSomething(){
        System.out.println("Doing Something this is printed by: " + Thread.currentThread().getName()+
                "thread");
    }

    public static void main(String[] args) {
        System.out.println();
        System.out.println("Hello World. This is Printed by: " + Thread.currentThread().getName()+
                "thread");
        doSomething();

    }
}
