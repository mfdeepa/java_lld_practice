package accessModifier;

public class StudentS {
    private String name;
    private String surname;
    int bat; //default
    protected double psp;
    public String universityName;
    void changeBatch(int newBatchId){
        this.bat = newBatchId;
    }
    void giveMockInterview(){
        System.out.println("Giving Mock Interview");

    }
    void setName(String n){
        this.name = n;
    }

    String getName(){
        return this.name;
    }
}
