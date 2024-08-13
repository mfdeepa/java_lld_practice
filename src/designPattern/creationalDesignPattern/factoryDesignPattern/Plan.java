package designPattern.creationalDesignPattern.factoryDesignPattern;

abstract public class Plan {
    protected double rate;
    abstract void getRate();
    public void calculatedBill(int units){
        System.out.println(units*rate);
    }
}
