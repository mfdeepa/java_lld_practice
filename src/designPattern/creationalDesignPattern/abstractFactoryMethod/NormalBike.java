package designPattern.creationalDesignPattern.abstractFactoryMethod;
public class NormalBike extends Bike{
    NormalBike(){}

    public void setVehicleType() {
        bikeType = "Normal";
    }

    public void setBaseCost() {
        baseCost = 30;
    }

    public void setVehicleChargesPerUnitDistance() {
        chargesPerUnitDistance = 10;
    }
}
