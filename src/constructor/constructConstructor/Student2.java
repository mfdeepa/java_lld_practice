package constructor.constructConstructor;

public class Student2 {
    String name;
    int age = 20;
    double psp;
    String uniname;
    boolean isPlaced;
    Student2(String n, int a, double p){
        name = n;
        age = a;
        psp = p;
    }
    void printing(){
        System.out.println(name + " " + age + " " + psp);
    }

}
