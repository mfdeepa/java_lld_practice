package collection.list.stack;

import java.util.Iterator;
import java.util.Stack;

public class Client {
    public static void main(String[] args) {
        Stack<String> st = new Stack<String>();
        st.push("adds");
        st.push("bhc");
        st.push("idsu");
        System.out.println("Printing last pop element: " + st.pop());
        Iterator it = st.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}
