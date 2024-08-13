package useOfFinalKeyword;
import java.util.List;
import java.util.Scanner;
public class Client {
    public static void main(String[] args) {
        Honda h = new Honda();
        h.cube(10);
        System.out.println( h.cube(10));

        Scanner s = new Scanner(System.in);
        String a = s.next();
        System.out.println(a);
    }
}
