package constructor.copyConstructor;

public class Student5 {
    String name;
    int age = 20;
    double psp;
    String uniname;
    boolean isPlaced;
    Student5(String n, int a, double p){
        name = n;
        age = a;
        psp = p;
    }
    Student5(Student5 s){
        name = s.name;
        age = s.age;
        psp = s.psp;
    }
    void printing(){
        System.out.println(name + " " + age + " " + psp);
    }
}
