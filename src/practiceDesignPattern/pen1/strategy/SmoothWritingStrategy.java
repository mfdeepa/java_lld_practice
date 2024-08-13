package practiceDesignPattern.pen1.strategy;

public class SmoothWritingStrategy implements WritingStrategy{
    @Override
    public void write() {
        System.out.println("writting in a smooth way.");
    }
}
