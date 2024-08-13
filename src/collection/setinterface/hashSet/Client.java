package collection.setinterface.hashSet;

import java.util.*;

public class Client {
    public static void main(String[] args) {
        HashSet<String> hs = new HashSet<String>();
        hs.add("abcd");
        hs.add("efgh");
        hs.add("ijkl");
        hs.add("mnop");
        //Treversing element
        Iterator it = hs.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
        System.out.println("removing the element from the set: ijkl");
        hs.remove("ijkl");
        System.out.println(hs);
    }
}
