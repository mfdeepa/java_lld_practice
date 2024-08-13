package collection.hashMap;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        LinkedHashMap<Integer,String> lhm = new LinkedHashMap<Integer,String>();
        lhm.put(100,"Deepa");
        lhm.put(101,"diya");
        lhm.put(102,"deepti");
        lhm.put(103,"deepali");
        //fetching only keys
        System.out.println("keys"+ lhm.keySet());
        //fetching value
        System.out.println("values"+ lhm.values());
        //fetching key and value
        System.out.println("key-values pair" + lhm.entrySet());
        //remove the key
        System.out.println("removing the key 102" + lhm.remove(102));

    }
}
