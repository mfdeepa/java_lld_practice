package executorAndCallable.mergeSort;

import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static java.util.concurrent.Executors.*;

public class Client {
    public static void main(String[] args) {
        List<Integer> ls = List.of(7,34,1,9,8,2,6);
        ExecutorService ess = Executors.newCachedThreadPool();
        //MergeSorter ms = new MergeSorter(ls, ess);


    }
}
