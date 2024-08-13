package practiceDesignPattern.pen1.model;

import practiceDesignPattern.pen1.interfaces.RefillPen;
import practiceDesignPattern.pen1.strategy.SmoothWritingStrategy;
import practiceDesignPattern.pen1.strategy.WritingStrategy;

public class GelPen extends Pen implements RefillPen {
    public GelPen(String brand,String name ,Double price, PenType type, WritingStrategy writingStrategy) {
        super(brand, name, price, PenType.GELL, new SmoothWritingStrategy());
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
