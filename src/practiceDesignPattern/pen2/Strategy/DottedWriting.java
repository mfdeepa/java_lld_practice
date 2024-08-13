package practiceDesignPattern.pen2.Strategy;

public class DottedWriting implements WritingStrategy{
    @Override
    public void write() {
        System.out.println("Pen is writing in dotted style.");
    }
}
