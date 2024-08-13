package designPattern.structuralDesignPattern.decorator;

public class ChocoChips implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;
    public ChocoChips(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }
    @Override
    public int getCost() {
        return iceCreamConeConstituents.getCost();
    }

    @Override
    public String getDesciption() {
        return iceCreamConeConstituents.getDesciption();
    }
}
