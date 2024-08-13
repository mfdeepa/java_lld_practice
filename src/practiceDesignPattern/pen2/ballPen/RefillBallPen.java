package practiceDesignPattern.pen2.ballPen;

import practiceDesignPattern.pen2.Strategy.WritingStrategy;
import practiceDesignPattern.pen2.interfaces.RefillPen;
import practiceDesignPattern.pen2.model.*;

public class RefillBallPen extends BallPen implements RefillPen {
    private Refill refill;
    public RefillBallPen(Brand brand, String name, PenType type, double price, int length, WritingStrategy writingStrategy, PenBody penBody, Refill refill) {
        super(brand, name, type, price, length, writingStrategy, penBody);
        this.refill = refill;
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
