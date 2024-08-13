package designPattern.creationalDesignPattern.prototype;

public class Client {
    public static void fillRegistry(StudentRegistry streg){
 //     List<String> batches = getStudentBatches();
        Student aprBeginnerBatchPrototype = new Student();
        aprBeginnerBatchPrototype.setBatchName("Apr 23 Beginner Batch");
        aprBeginnerBatchPrototype.setAverageBatchPsp(90);
        streg.register("Apr23BeginnerBatch", aprBeginnerBatchPrototype);

        IntelligentStudent itst = new IntelligentStudent();
        itst.setAverageBatchPsp(99);
        itst.setBatchName("aprBatchIntelligentStudent");
        itst.setIq(150);

        streg.register("aprBatchIntelligentStudent", itst);

    }

    public static void main(String[] args) {
        StudentRegistry stregis = new StudentRegistry();
        fillRegistry(stregis);

        Student deepa = stregis.get("AprBeginnerBatch").clone();
        deepa.setName("Deepa");
        deepa.setAge(34);
        deepa.setPsp(87);

        Student diya = stregis.get("AprBeginnerBatch").clone();
        diya.setPsp(90);
        diya.setAge(35);
        diya.setName("Diya");

        System.out.println("Debug");
    }
}
