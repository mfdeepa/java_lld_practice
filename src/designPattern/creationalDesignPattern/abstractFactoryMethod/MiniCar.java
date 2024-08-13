package designPattern.creationalDesignPattern.abstractFactoryMethod;

public class MiniCar extends Car{
    MiniCar() {}

    public void setBaseCost() {
        baseCost = 40;
    }

    public void setVehicleType() {
        carType = "Mini";
    }

    public void setVehicleChargesPerUnitDistance() {
        chargePerUnitDistance = 8;
    }
}

