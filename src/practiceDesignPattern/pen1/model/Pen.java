package practiceDesignPattern.pen1.model;

import practiceDesignPattern.pen1.strategy.WritingStrategy;

public class Pen {
    private String name;
    private String brand;
    private Double price;
    private PenType type;
    private WritingStrategy writingStrategy;

    public Pen(String name, String brand, Double price, PenType type, WritingStrategy writingStrategy) {
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.type = type;
        this.writingStrategy = writingStrategy;
    }


    public void write(){

        writingStrategy.write();
    }
}
