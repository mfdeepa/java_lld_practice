package practiceDesignPattern.pen2.ballPen;

import practiceDesignPattern.pen2.Strategy.WritingStrategy;
import practiceDesignPattern.pen2.interfaces.NonRefillPen;
import practiceDesignPattern.pen2.model.*;

public class NonRefillBallPen extends BallPen implements NonRefillPen {
    public NonRefillBallPen(Brand brand, String name, PenType type, double price, int length, WritingStrategy writingStrategy, PenBody penBody) {
        super(brand, name, type, price, length, writingStrategy, penBody);
    }


    @Override
    public Refill changeRefill(Refill refil) {
        Ink ink = new Ink("blue",2, InkType.BALL);
        Nib nib = new Nib(1.3,NibType.GOLD);
        return new Refill(ink,nib);
    }
}
