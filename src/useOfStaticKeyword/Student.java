package useOfStaticKeyword;

public class Student {
    public Object bat;
    int age;
    int rollno;
    String name;
    final int noOfStudent = 20;
    final int xx;
    static final int data;
    static {data = 50;};

    // in the final keyword, if we will not assign any value to this then we can assign.
    // it in the constructor function by name of variable as shown below.
    // but if we declare the final variable value then we can not change it.
    public Student(){
       int noOfStudent = 25;
       xx = 15;

    }
    public static String universityName = "Delhi University";
    // we can access the static variable name without creating the object
    //of the class. and it's necessary to create public to static keyword,
    //if i want ot access it in different package.
    void display(){
        System.out.println(age + " " + rollno +" " + name + " "+ universityName);
    }

    static int batchName(){
        int noOfBatch = 10;
        int age = 23;
       // System.out.println(noOfBatch);
        return 10;
    }
}
