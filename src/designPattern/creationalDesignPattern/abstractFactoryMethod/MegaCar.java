package designPattern.creationalDesignPattern.abstractFactoryMethod;

public class MegaCar extends Car{
    MegaCar() {}

    public void setBaseCost() {
        baseCost = 60;
    }

    public void setVehicleType() {
        carType = "Mega";
    }

    public void setVehicleChargesPerUnitDistance() {
        chargePerUnitDistance = 12;
    }
}
