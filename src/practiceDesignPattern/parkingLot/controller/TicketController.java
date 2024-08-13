package practiceDesignPattern.parkingLot.controller;

import practiceDesignPattern.parkingLot.dtos.IssueTicketRequest;
import practiceDesignPattern.parkingLot.dtos.IssueTicketResponse;
import practiceDesignPattern.parkingLot.dtos.ResponseStatus;
import practiceDesignPattern.parkingLot.exceptions.GateNotFoundException;
import practiceDesignPattern.parkingLot.exceptions.ParkingLotFullException;
import practiceDesignPattern.parkingLot.exceptions.ParkingLotNotFoundException;
import practiceDesignPattern.parkingLot.model.Ticket;
import practiceDesignPattern.parkingLot.services.TicketService;

public class TicketController {
    public static String INVALID_GATE ="Gate is not valid";
    public static String INVALID_PARKING_LOT ="Parking lot is not valid";
    public static String PARKING_LOT_FULL ="Parking lot is full, find a place on road";
    public static String TICKET_ISSUED_MESSAGE = "Ticket issued ";
    private TicketService ticketService;

    public TicketController(TicketService ticketService) {
        this.ticketService = ticketService;
    }

    public IssueTicketResponse issueTicket(IssueTicketRequest ticketRequest){
            Ticket ticket = null;
            try {
                ticket = ticketService.issueTicket(ticketRequest);
            } catch (GateNotFoundException e) {
                return new IssueTicketResponse(null,ResponseStatus.FAILURE, INVALID_GATE);
            } catch (ParkingLotNotFoundException e) {
                return new IssueTicketResponse(null,ResponseStatus.FAILURE, INVALID_PARKING_LOT);
            } catch (ParkingLotFullException e) {
                return new IssueTicketResponse(null,ResponseStatus.FAILURE, PARKING_LOT_FULL);
            }
        return  new IssueTicketResponse(ticket, ResponseStatus.SUCCESS, TICKET_ISSUED_MESSAGE);

    }
}
