package practiceDesignPattern.parkingLot.strategies;

public class ParkingSlotAllotmentStrategyFactory {
    public static ParkingPlaceAlotmentStrategy getParkingAllotmentStrategyForType(ParkingPlaceAlotmentStrategy parkingPlaceAlotmentStrategy){
        return new SimpleParkingSlotAllotStrategy();
    }
}
