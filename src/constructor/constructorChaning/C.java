package constructor.constructorChaning;

public class C extends B{
    C(){
        System.out.println("Constructor of C");
    }
    C(String a){
        super("hello");
        System.out.println("Constructor of C with parameters values as: " + a);
    }
}
