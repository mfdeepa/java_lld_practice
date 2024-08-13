package collection.hashMap;

import java.util.LinkedHashMap;
import java.util.Map;

public class BookClient {
    public static void main(String[] args) {
        //creating map of a book
        Map<Integer,Book> mp = new LinkedHashMap<Integer,Book>();
        //creating books
        Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);
        Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);
        Book b3=new Book(103,"Operating System","Galvin","Wiley",6);
        //adding books into mp
        mp.put(2,b2);
        mp.put(1,b1);
        mp.put(3,b3);
        //treversing map
        for(Map.Entry<Integer,Book> item: mp.entrySet()){
            int ky = item.getKey();
            System.out.println(ky + " Details");

            Book b = item.getValue();
            System.out.println("values of key: " + b); // here b will show the reference of the data
            //to fetch all the values of b, we should write like below:
            System.out.println("Seperate values of b: " + b.id +" "+ b.name+ " "+
                    b.author+" " + b.publisher+ " " +b.quantity);

        }

    }
}
