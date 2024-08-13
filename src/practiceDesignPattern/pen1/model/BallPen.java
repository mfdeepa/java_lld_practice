package practiceDesignPattern.pen1.model;

import practiceDesignPattern.pen1.interfaces.RefillPen;
import practiceDesignPattern.pen1.strategy.SmoothWritingStrategy;

public class BallPen extends Pen implements RefillPen {
    public BallPen(String name, String brand, Double price){
        super(name, brand, price, PenType.GELL, new SmoothWritingStrategy());

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
