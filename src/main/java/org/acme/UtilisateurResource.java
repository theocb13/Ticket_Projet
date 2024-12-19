package org.acme;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import java.io.IOException;

@Path("/utilisateurs")
public class UtilisateurResource {

    @GET
    public String lireTicket() {
        TicketService ticketService = new TicketService();
        try {
            String jsonContent = ticketService.lireTickets("utilisateurs.json");
            return jsonContent;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return "";
    }
}
