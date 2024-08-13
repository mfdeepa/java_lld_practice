package designPattern.creationalDesignPattern.abstractFactoryMethod;

public class SportsBike extends Bike{
    SportsBike(){}

    public void setVehicleType() {
        bikeType = "Sports";
    }

    public void setBaseCost() {
        baseCost = 40;
    }

    public void setVehicleChargesPerUnitDistance() {
        chargesPerUnitDistance = 15;
    }
}
