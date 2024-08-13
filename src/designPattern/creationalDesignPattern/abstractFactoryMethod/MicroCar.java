package designPattern.creationalDesignPattern.abstractFactoryMethod;

public class  MicroCar extends Car{
    MicroCar() {}

    public void setBaseCost() {
        baseCost = 50;
    }

    public void setVehicleType() {
        carType = "Micro";
    }

    public void setVehicleChargesPerUnitDistance() {
        chargePerUnitDistance = 10;
    }
}
