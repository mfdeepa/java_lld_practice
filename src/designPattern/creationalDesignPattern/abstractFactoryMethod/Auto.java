package designPattern.creationalDesignPattern.abstractFactoryMethod;

public abstract class Auto implements Vehicle {
    String shareType;
    int baseCost;
    int chargesPerUnitDistance;

    public void book(int distance){
        setVehicleType();
        setBaseCost();
        setVehicleChargesPerUnitDistance();
        int cost = calculateCostOfBooking(distance);
        System.out.println("You have booked a " + shareType + " Autorickshaw for a distance of " +
                distance + " kms at a total cost of " + cost + ". ");

    }

    public int calculateCostOfBooking(int distance) {
        int serviceCharge = 1;
        return baseCost + chargesPerUnitDistance * distance + serviceCharge;
    }
}
