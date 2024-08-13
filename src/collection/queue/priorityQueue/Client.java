package collection.queue.priorityQueue;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        PriorityQueue<String> qu = new PriorityQueue<String>();
        qu.add("abcd");
        qu.add("efgh");
        qu.add("ijkl");
        qu.add("mnop");
        System.out.println("head:" + qu.element());
        System.out.println("peek the element : " + qu.peek()); //shows the first element of queue.
        System.out.println("Iterating the queue elements");
        Iterator it = qu.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("removing the element: " + qu.remove());
        System.out.println("poll the element:" + qu.poll()); //remove the head element from the queue
        System.out.println("after removing the element.... print rest of elements in queue: ");
        Iterator it1 = qu.iterator();
        while(it1.hasNext()){
            System.out.println(it1.next());
        }
    }
}
