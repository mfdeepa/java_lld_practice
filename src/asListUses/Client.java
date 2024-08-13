package asListUses;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        //creating a array when arr is an argument.
        String [] arr = {"ban","che","ora"};
        //convert arr into list
        List<String> lx = Arrays.asList(arr);
        System.out.println(lx);

        //if element as an argument.
        List<String> le = Arrays.asList("abs","def","efg");
        System.out.println(le);

        // class type arguments passed
        List<Car> lc = Arrays.asList(
                new Car("abc", 20),
                new Car("cde", 10),
                new Car("efg", 54)
        );
        System.out.println(lc);


    }
}
