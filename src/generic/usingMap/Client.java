package generic.usingMap;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Client {
    public static void main(String[] args) {
        Map<Integer,String> map1 = new HashMap<Integer,String>();
        map1.put(1, "Deepa");
        map1.put(2,"deepti");
        map1.put(4,"diya");

    //now we use Map.Entry for Set and Iterator.
        Set<Map.Entry<Integer,String>> set1 = map1.entrySet();
        Iterator<Map.Entry<Integer,String>> itr = set1.iterator();
        while (itr.hasNext()){
            Map.Entry e = itr.next();
            System.out.println(e.getKey()+"....."+ e.getValue());
        }
    }
}
