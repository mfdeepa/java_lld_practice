package practiceDesignPattern.pen2.gelPen;

import practiceDesignPattern.pen2.Strategy.WritingStrategy;
import practiceDesignPattern.pen2.interfaces.NonRefillPen;
import practiceDesignPattern.pen2.model.*;

public class NonRefillGelPen extends GelPen implements NonRefillPen {
    String color;
    double radius;
    NibType nib;
    public NonRefillGelPen(Brand brand, String name, PenType type, double price, int length, WritingStrategy writingStrategy, PenBody penBody) {
        super(brand, name, type, price, length, writingStrategy, penBody);
        this.color = color;
        this.radius = radius;
        this.nib = nib;
    }

    @Override
    public Refill changeRefill(Refill refil) {
        Ink ink = new Ink("black",2, InkType.BALL);
        Nib nib = new Nib(1.3,NibType.GOLD);
        return new Refill(ink,nib);
    }
}
