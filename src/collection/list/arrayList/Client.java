package collection.list.arrayList;

import java.util.ArrayList;
import java.util.Iterator;

public class Client {
    public static void main(String[] args) {
        ArrayList<String> al = new ArrayList<String>();
        al.add("deepa");
        al.add("diya");
        al.add("deepali");
        Iterator itr = al.iterator();  //here iterator is interface which have hasNext method.
        //run al through iterator.
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
