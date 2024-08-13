package practiceDesignPattern.pen2.Strategy;

public class RoughWriting implements WritingStrategy {
    @Override
    public void write() {
        System.out.println("Pen is writing in rough way");
    }
}
