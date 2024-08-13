package practiceDesignPattern.parkingLot.repositories;

import practiceDesignPattern.parkingLot.exceptions.ParkingLotNotFoundException;
import practiceDesignPattern.parkingLot.model.ParkingLot;

import java.util.HashMap;
import java.util.Map;

public class ParkingLotRepository {
    Map<Long, ParkingLot> parkingLotMap = new HashMap<>();
    public ParkingLot getParkingLotById(Long parkingLotId) throws ParkingLotNotFoundException {

        if (parkingLotMap.containsKey(parkingLotId)) {
            parkingLotMap.get(parkingLotId);
        }

        throw new ParkingLotNotFoundException();
    }
}
