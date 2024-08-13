package constructor.constructorChaning;

public class D extends C{
    D(){
        super();
        System.out.println("Constructor of D");
    }
    D(String a){
        super(a);
        System.out.println("Constructor of D with param");
    }
}
