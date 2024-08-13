package designPattern.structuralDesignPattern.decorator;

public class VanillaScoop implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;
    public VanillaScoop(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost()+ 10;
    }

    @Override
    public String getDesciption() {
        return iceCreamConeConstituents.getDesciption() + " + Vanilla Scoop";
    }
}
