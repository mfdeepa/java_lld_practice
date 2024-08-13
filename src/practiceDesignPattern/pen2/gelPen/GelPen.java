package practiceDesignPattern.pen2.gelPen;

import practiceDesignPattern.pen2.Strategy.WritingStrategy;
import practiceDesignPattern.pen2.model.Brand;
import practiceDesignPattern.pen2.model.Pen;
import practiceDesignPattern.pen2.model.PenBody;
import practiceDesignPattern.pen2.model.PenType;

public class GelPen extends Pen {

    public GelPen(Brand brand, String name, PenType type, double price, int length, WritingStrategy writingStrategy, PenBody penBody) {
        super(brand, name, type, price, length, writingStrategy, penBody);
    }
}
