package constructor.constuctorOverloading;

public class Student4 {
    String name;
    int age = 20;
    double psp;
    String uniname;
    boolean isPlaced;
    Student4(String n,int a){
        name = n;
        age = a;
    }
    Student4(String n, int a, double p){
        name = n;
        age = a;
        psp = p;
    }
    void printing(){
        System.out.println(name + " " + age + " " + psp);
    }
}
