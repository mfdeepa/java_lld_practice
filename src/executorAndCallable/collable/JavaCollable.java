package executorAndCallable.collable;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

public class JavaCollable implements Callable {
    @Override
    public Object call() throws Exception {
        Random randObj = new Random();
        //Generating a random class btw 0 to 9
        Integer randNo = randObj.nextInt(10);
        Thread.sleep(randNo*1000);
        return randNo;
    }
}
