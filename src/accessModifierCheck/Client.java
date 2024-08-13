package accessModifierCheck;

import accessModifier.StudentS;

public class Client {
    public static void main(String[] args) {
        StudentS ss = new StudentS();
        //ss.name = "deepa"; //private not access outside the class
        //ss.bat = 5346; //default not accessiable outside the package.
      //  ss.psp = 98; //this is protected but not a child class.
        ss.universityName = "ABCD";
        StudentSChild sc = new StudentSChild();
        sc.doSomething();
        System.out.println(sc.doSomething());
    }

}
