package accessModifier;

import useOfStaticKeyword.Student;

public class Client {
    public static void main(String[] args) {
        StudentS s = new StudentS();
        //s.name = "deepa"; name is not accessable b'coz of private.
        //if we have to use the private variable then we can use getter and setter method.
        s.bat =  123;
        s.psp = 91.0;
        s.universityName = "Delhi University";
        s.changeBatch(546);
        s.setName("Deepa");
        s.getName();
        System.out.println(s.getName());

        s.giveMockInterview();
    }
}
