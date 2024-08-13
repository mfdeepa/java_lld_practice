package practiceDesignPattern.pen1.model;

import practiceDesignPattern.pen1.interfaces.RefillPen;
import practiceDesignPattern.pen1.strategy.SmoothWritingStrategy;
import practiceDesignPattern.pen1.strategy.WritingStrategy;

public class Marker extends Pen implements RefillPen {

    public Marker(String name, String brand, Double price, PenType type, WritingStrategy writingStrategy) {
        super(name, brand, price, PenType.MARKER, new SmoothWritingStrategy());
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
