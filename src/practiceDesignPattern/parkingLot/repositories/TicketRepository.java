package practiceDesignPattern.parkingLot.repositories;

import practiceDesignPattern.parkingLot.model.Ticket;

import java.util.Map;
import java.util.HashMap;
public class TicketRepository {
    Map<Long, Ticket> tickets = new HashMap<>();
    Long previousId = 01L;
    public Ticket save(Ticket ticket) {
        previousId ++;
        ticket.setId(previousId);
        tickets.putIfAbsent(previousId, ticket);
        return ticket;
    }
}
