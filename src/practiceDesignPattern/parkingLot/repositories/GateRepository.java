package practiceDesignPattern.parkingLot.repositories;

import practiceDesignPattern.parkingLot.exceptions.GateNotFoundException;
import practiceDesignPattern.parkingLot.model.Gate;

import java.util.HashMap;
import java.util.Map;

public class GateRepository {
    Map<Long, Gate> gates = new HashMap<>();

    public Gate findGateByGateId(Long gateId) throws GateNotFoundException {
        if(gates.containsKey(gateId)){
            return gates.get(gateId);
        }
        throw new GateNotFoundException();
    }
}
