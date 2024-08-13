package constructor.constuctorOverloading;

public class Client {
    public static void main(String[] args) {
        Student4 s4 = new Student4("deepa",34);
        Student4 s44 = new Student4("Deppe",34,50.0);
        s4.printing();
        s44.printing();
 //  compiler will automatically check that which constructor is calling by the object
 // with the help of the parameter.
    }
}
