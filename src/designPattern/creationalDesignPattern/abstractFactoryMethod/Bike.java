package designPattern.creationalDesignPattern.abstractFactoryMethod;

public abstract class Bike implements Vehicle{
    String bikeType;
    int baseCost;
    int chargesPerUnitDistance;

    public void book(int distance){
        setVehicleType();
        setBaseCost();
        setVehicleChargesPerUnitDistance();
        int cost = calculateCostOfBooking(distance);
        System.out.println("You have booked a " + bikeType + " Bike for a distance of " +
                distance + " kms at a total cost of " + cost + ". ");
    }

    public int calculateCostOfBooking(int distance) {
        return baseCost + chargesPerUnitDistance * distance;
    }
}
