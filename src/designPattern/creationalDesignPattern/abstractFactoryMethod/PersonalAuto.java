package designPattern.creationalDesignPattern.abstractFactoryMethod;

public class PersonalAuto extends Auto{
    PersonalAuto() {
    }

    public void setVehicleType() {
        shareType = "Personal";
    }

    public void setBaseCost() {
        baseCost = 10;
    }

    public void setVehicleChargesPerUnitDistance() {
        chargesPerUnitDistance = 15;
    }
}
