package practiceDesignPattern.pen2.fountainPen;

import practiceDesignPattern.pen2.Strategy.WritingStrategy;
import practiceDesignPattern.pen2.interfaces.RefillPen;
import practiceDesignPattern.pen2.model.*;

public class RefillFountainPen extends FountainPen implements RefillPen {
    private Refill refill;

    public RefillFountainPen(Brand brand, String name, PenType type, double price, int length, WritingStrategy writingStrategy, PenBody penBody) {
        super(brand, name, type, price, length, writingStrategy, penBody);
    }

    @Override
    public Boolean canRefill() {
        return Boolean.TRUE;
    }

    @Override
    public Refill getRefill(Ink ink) {
        if(canRefill() == Boolean.TRUE){
            System.out.println("pen is refillable by ink.");
            Ink inkk = new Ink("blue",2, InkType.BALL);
            return this.refill;
        }
        return null;
    }
}
