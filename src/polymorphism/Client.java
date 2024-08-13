package polymorphism;
import java.util.Random;
public class Client {
    public static A getObject(){
     B b = new B();
     C c = new C();
     Random random = new Random();
     if(random.nextInt()% 2 == 0){
         return b;
     }
     return c;
    }

    public static void main(String[] args) {
        A a = getObject();
        C c = new C();
        c.companyName = "Google";
        //a.companyName = "Google"; //b'coz a can not inherit its child class variable
        //System.out.println(((C) a).companyName);
    }

}
