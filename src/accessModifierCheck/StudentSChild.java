package accessModifierCheck;

import accessModifier.StudentS;

public class StudentSChild extends StudentS {
    public double doSomething(){
        if(psp< 50){
            return -1;
        }
        return psp;
    }
}
