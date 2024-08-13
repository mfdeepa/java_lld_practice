package constructor.copyConstructor;

public class Client {
    public static void main(String[] args) {
        Student5 s5 = new Student5("deepa", 34, 50.0);
        Student5 s55 = new Student5(s5);// here we are copying the parameter of s5 constructor.
        s5.printing();
        s55.printing();
    }
}
