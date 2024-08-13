package practiceDesignPattern.parkingLot.strategies;

import practiceDesignPattern.parkingLot.exceptions.ParkingLotFullException;
import practiceDesignPattern.parkingLot.model.ParkingSlot;
import practiceDesignPattern.parkingLot.model.VehicleType;

public interface ParkingPlaceAlotmentStrategy {
    ParkingSlot getParkingSlot(VehicleType vehicleType, Long parkingLotId)
            throws ParkingLotFullException;

}
