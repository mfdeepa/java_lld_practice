package designPattern.structuralDesignPattern.decorator;

public class OrangeCone implements IceCreamConeConstituents{
    private IceCreamConeConstituents iceCreamConeConstituents;
    public OrangeCone(){}
    public OrangeCone(IceCreamConeConstituents iceCreamConeConstituents){
        this.iceCreamConeConstituents = iceCreamConeConstituents;
    }
    @Override
    public int getCost() {
        if(iceCreamConeConstituents != null){
            return iceCreamConeConstituents.getCost() + 20;
        }
        return 20;
    }

    @Override
    public String getDesciption() {
        if(iceCreamConeConstituents != null){
            return iceCreamConeConstituents.getDesciption() + "Orange Cone";
        }
        return "Orange Cone";
    }
    public void setVitaminCLevel(int newLevel){

    }
}
