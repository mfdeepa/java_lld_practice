package practiceDesignPattern.pen2.gelPen;

import practiceDesignPattern.pen2.Strategy.WritingStrategy;
import practiceDesignPattern.pen2.interfaces.RefillPen;
import practiceDesignPattern.pen2.model.*;

public class RefillGelPen extends GelPen implements RefillPen {

    public RefillGelPen(Brand brand, String name, PenType type, double price, int length, WritingStrategy writingStrategy, PenBody penBody) {
        super(brand, name, type, price, length, writingStrategy, penBody);
    }

    @Override
    public Boolean canRefill() {
        return null;
    }

    @Override
    public Refill getRefill(Ink ink) {
        return null;
    }
}
