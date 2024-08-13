package practiceDesignPattern.pen2.Strategy;

public class SmoothWriting implements WritingStrategy{
    @Override
    public void write() {
        System.out.println("Pen is writing in smooth way.");
    }
}
