

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.*;

@Path("/ticket")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class TicketResource {

    private static Map<Integer, String> tickets = new HashMap<>();
    private static int currentId = 1;

    // GET : Récupérer tous les tickets
    @GET
    public Response getAllTickets() {
        return Response.ok(tickets).build();
    }

    // GET : Récupérer un ticket par ID
    @GET
    @Path("/{id}")
    public Response getTicketById(@PathParam("id") int id) {
        if (!tickets.containsKey(id)) {
            return Response.status(Response.Status.NOT_FOUND).entity("Ticket not found").build();
        }
        return Response.ok(Map.of("id", id, "value", tickets.get(id))).build();
    }

    // POST : Créer un nouveau ticket
    @POST
    public Response createTicket(Map<String, String> input) {
        String value = input.get("value");
        tickets.put(currentId, value);
        return Response.status(Response.Status.CREATED).entity(Map.of("id", currentId++, "value", value)).build();
    }

    // PUT : Mettre à jour un ticket
    @PUT
    public Response updateTicket(Map<String, String> input) {
        int id = Integer.parseInt(input.get("id"));
        String value = input.get("value");

        if (!tickets.containsKey(id)) {
            return Response.status(Response.Status.NOT_FOUND).entity("Ticket not found").build();
        }

        tickets.put(id, value);
        return Response.ok(Map.of("id", id, "value", value)).build();
    }

    // DELETE : Supprimer un ticket
    @DELETE
    @Path("/{id}")
    public Response deleteTicket(@PathParam("id") int id) {
        if (!tickets.containsKey(id)) {
            return Response.status(Response.Status.NOT_FOUND).entity("Ticket not found").build();
        }

        tickets.remove(id);
        return Response.noContent().build();
    }
}
