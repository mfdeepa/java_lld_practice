package practiceDesignPattern.parkingLot.strategies;

import practiceDesignPattern.parkingLot.model.ParkingSlot;
import practiceDesignPattern.parkingLot.model.VehicleType;

public class SimpleParkingSlotAllotStrategy implements ParkingPlaceAlotmentStrategy{
    //get all the floors for this parking lot which are free.
    //go through the free floors and return any spot for this vehicle type.

    @Override
    public ParkingSlot getParkingSlot(VehicleType vehicleType, Long parkingLotId) {
        return null;
    }
}
