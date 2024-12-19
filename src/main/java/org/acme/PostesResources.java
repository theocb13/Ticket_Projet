package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.io.IOException;

@Path("/postes")
public class PostesResources {

    @GET
    public String lireTicket() {
        TicketService ticketService = new TicketService();
        try {
            String jsonContent = ticketService.lireTickets("postes.json");
            return jsonContent;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
