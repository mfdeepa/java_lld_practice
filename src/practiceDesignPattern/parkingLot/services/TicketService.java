package practiceDesignPattern.parkingLot.services;

import practiceDesignPattern.parkingLot.dtos.IssueTicketRequest;
import practiceDesignPattern.parkingLot.exceptions.GateNotFoundException;
import practiceDesignPattern.parkingLot.exceptions.ParkingLotFullException;
import practiceDesignPattern.parkingLot.exceptions.ParkingLotNotFoundException;
import practiceDesignPattern.parkingLot.model.*;
import practiceDesignPattern.parkingLot.repositories.GateRepository;
import practiceDesignPattern.parkingLot.repositories.TicketRepository;
import practiceDesignPattern.parkingLot.repositories.VehicleRepository;
import practiceDesignPattern.parkingLot.repositories.ParkingLotRepository;
import practiceDesignPattern.parkingLot.strategies.ParkingPlaceAlotmentStrategy;
import practiceDesignPattern.parkingLot.strategies.ParkingSlotAllotmentStrategyFactory;

import java.util.Date;
import java.util.UUID;

public class TicketService {
    private ParkingLotRepository parkingLotRepository;
    private TicketRepository ticketRepository;
    private GateRepository getRepository;
    private VehicleRepository vehicleRepository;

    public TicketService(GateRepository gateRepository, VehicleRepository vehicleRepository, ParkingLotRepository parkingLotRepository, TicketRepository ticketRepository) {
        this.parkingLotRepository = parkingLotRepository;
        this.ticketRepository = ticketRepository;
        this.getRepository = getRepository;
        this.vehicleRepository = vehicleRepository;
    }

    public Ticket issueTicket(IssueTicketRequest ticketRequest) throws GateNotFoundException, ParkingLotNotFoundException, ParkingLotFullException {

        // 1. set time
        Ticket ticket = new Ticket();
        ticket.setEntryTime(new Date());

        //2. get gate details

        Gate gate =getRepository.findGateByGateId(ticketRequest.getGateId());
        ticket.setEntryGate(gate);

        //3. vehicle
        ticket.setVehicle(getVehicleForNumber(ticketRequest));

        //4. parking slot
        ticket.setParkingSlot(getParkingSlot(ticketRequest));


        //4. Ticket number
        ticket.setNumber(ticketRequest.getOwnerName()+ UUID.randomUUID());
        return ticketRepository.save(ticket);

    }
    private ParkingSlot getParkingSlot(IssueTicketRequest ticketRequest) throws GateNotFoundException, ParkingLotNotFoundException, ParkingLotFullException {
        ParkingLot parkingLot = parkingLotRepository.getParkingLotById(ticketRequest.getParkingLotId());
        ParkingPlaceAlotmentStrategy allotmentStrategy = parkingLot.getAllotmentStrategy();

        ParkingPlaceAlotmentStrategy parkingAllotmentRule =
                ParkingSlotAllotmentStrategyFactory.getParkingAllotmentStrategyForType(allotmentStrategy);

        ParkingSlot parkingSlot = parkingAllotmentRule.getParkingSlot(ticketRequest.getVehicleType(), ticketRequest.getParkingLotId());
        return parkingSlot;
    }

    private Vehicle getVehicleForNumber(IssueTicketRequest ticketRequest) {
        Vehicle vehicle = vehicleRepository.getVehicleByNumber(ticketRequest.getVehicleNumber());
        if (vehicle == null) {
            vehicle = new Vehicle(ticketRequest.getVehicleType(), ticketRequest.getVehicleNumber(),
                    ticketRequest.getOwnerName());
            vehicleRepository.save(vehicle);
        }
        return vehicle;
    }
}
