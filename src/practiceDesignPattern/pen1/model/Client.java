package practiceDesignPattern.pen1.model;

import practiceDesignPattern.pen1.strategy.SmoothWritingStrategy;

public class Client {
    public static void main(String[] args) {
        Pen pen = new GelPen("Deepa", "Airtel",4.25, PenType.GEL,new SmoothWritingStrategy());
        pen.write();


    }
}
