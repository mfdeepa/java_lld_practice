package practiceDesignPattern.parkingLot.dtos;

import practiceDesignPattern.parkingLot.model.Ticket;

public class IssueTicketResponse {
    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    private ResponseStatus responseStatus;
    private Ticket  ticket;
    private String message;

    public IssueTicketResponse(Ticket ticket,ResponseStatus responseStatus, String message) {
        this.responseStatus = responseStatus;
        this.ticket = ticket;
        this.message = message;
    }
}
