package practiceDesignPattern.pen2.fountainPen;

import practiceDesignPattern.pen2.Strategy.WritingStrategy;
import practiceDesignPattern.pen2.interfaces.NonRefillPen;
import practiceDesignPattern.pen2.model.*;

public class NonRefillFountainPen extends FountainPen implements NonRefillPen {

    public NonRefillFountainPen(Brand brand, String name, PenType type, double price, int length, WritingStrategy writingStrategy, PenBody penBody) {
        super(brand, name, type, price, length, writingStrategy, penBody);
    }

    @Override
    public Refill changeRefill(Refill refil) {
        Ink ink = new Ink("red",2, InkType.BALL);
        Nib nib = new Nib(1.3,NibType.GOLD);
        return new Refill(ink,nib);
    }
}
