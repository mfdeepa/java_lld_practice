package designPattern.structuralDesignPattern.decorator;

public class StrawberryScoop implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;
    public StrawberryScoop(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }

    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost() + 15;
    }

    @Override
    public String getDesciption() {
        return iceCreamConeConstituents.getDesciption()+ " + Strawberry Scoop";
    }
}
