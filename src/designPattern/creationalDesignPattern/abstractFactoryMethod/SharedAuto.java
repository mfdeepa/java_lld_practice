package designPattern.creationalDesignPattern.abstractFactoryMethod;

public class SharedAuto extends Auto{
    SharedAuto() {
    }

    public void setVehicleType() {
        shareType = "Shared";
    }

    public void setBaseCost() {
        baseCost = 8;
    }

    public void setVehicleChargesPerUnitDistance() {
        chargesPerUnitDistance = 12;
    }
}
