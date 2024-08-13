package useOfStaticKeyword;

import static useOfStaticKeyword.Student.batchName;
import static useOfStaticKeyword.Student.universityName;

public class Client {
    public static void main(String[] args) {
        Student s = new Student();
        s.name = "deepa";
        s.age = 35;
        s.rollno = 123;
        System.out.println(s.data);
        s.display();
        //s.noOfStudent = 25; here we can not change the value of this, b'coz of the use
        //of final keyword in the class Student.but can change their in their constructor tor function.
        System.out.println(universityName);
        System.out.println(s.noOfStudent);
        System.out.println(s.xx);
        Student.universityName = "Scaler University";
        System.out.println(universityName);
        System.out.println(batchName());

    }
}
