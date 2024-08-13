package firstClassCreate;

import firstClassCreate.Person;
import useOfStaticKeyword.Student;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Person obj1 = new Person(1,"parsoon", 25,"delhi", "male");
//        String name = "Deepa";
//        int age = 35;
//        String city = "Delhi";
        System.out.println(obj1.age);
        obj1.display(); //print the value in display method in person class
        System.out.println(Student.universityName);
    }

}