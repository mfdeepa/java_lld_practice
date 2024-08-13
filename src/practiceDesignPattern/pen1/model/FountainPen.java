package practiceDesignPattern.pen1.model;

import practiceDesignPattern.pen1.interfaces.RefillPen;
import practiceDesignPattern.pen1.strategy.SmoothWritingStrategy;
import practiceDesignPattern.pen1.strategy.WritingStrategy;

public class FountainPen extends Pen implements RefillPen {
    public FountainPen(String name, String brand, Double price, PenType type, WritingStrategy writingStrategy) {
        super(name, brand, price, PenType.FOUNTAIN, new SmoothWritingStrategy());
    }

    @Override
    public void changeRefill() {

    }

    @Override
    public Refill getRefill() {
        return null;
    }

    @Override
    public boolean canRefill() {
        return false;
    }
}
