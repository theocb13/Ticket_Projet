package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.io.IOException;

@Path("/tickets")
public class TicketResource {

    @GET
    public String lireTicket() {
        TicketService ticketService = new TicketService();
        try {
            String jsonContent = ticketService.lireTickets("tickets.json");
            return jsonContent;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
