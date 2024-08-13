package collection.setinterface.linkedHashSet;
import java.util.*;

public class Client {
    public static void main(String[] args) {
        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("abcde");
        lhs.add("ghij");
        lhs.add("klmn");
        lhs.add("opqr");
        System.out.println(lhs.size());
        System.out.println(lhs.remove("klmn"));
        System.out.println("after deletion of the item : " + lhs);
    }
}
