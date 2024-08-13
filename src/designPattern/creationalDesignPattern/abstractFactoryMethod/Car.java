package designPattern.creationalDesignPattern.abstractFactoryMethod;

public abstract class Car implements Vehicle {
    String carType;
    int baseCost;
    int chargePerUnitDistance;
    public void book(int distance){
        setVehicleType();
        setBaseCost();
        setVehicleChargesPerUnitDistance();
        int cost = calculateCostOfBooking(distance); // this calculated method define at the last.
        System.out.println("You have booked a " + carType + " car for a distance of " +
                distance + " kms at a total cost of " + cost + ". ");
    }
    public void setVehicleTyp() {}
    public void setBaseCost(){}
    public void setVehicleChargesPerUnitDistance(){

    }
    public int calculateCostOfBooking(int distance){
        int serviceCharge =3;
        return baseCost + chargePerUnitDistance*distance + serviceCharge;
    }
}
