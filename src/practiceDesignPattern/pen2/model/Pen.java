package practiceDesignPattern.pen2.model;

import practiceDesignPattern.pen2.Strategy.WritingStrategy;

public abstract class Pen {
    private Brand brand;
    private String name;
    private PenType type;
    private double price;
    private int length;
    private WritingStrategy writingStrategy;
    PenBody penBody;

    public Pen(Brand brand,String name,PenType type,double price,int length,WritingStrategy writingStrategy,PenBody penBody){
        this.penBody = penBody;
        this.name = name;
        this.length = length;
        this.type = type;
        this.brand = brand;
        this.writingStrategy = writingStrategy;
        this.price = price;
    }
    public void write(){
        writingStrategy.write();
    }

    @Override
    public String toString() {
        return "pen body is "+this.penBody+ ","+ "name is "+ this.name;

    }
}
