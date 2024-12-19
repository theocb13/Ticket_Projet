

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.*;

@Path("/utilisateur")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class UtilisateurResource {

    private static Map<Integer, String> utilisateurs = new HashMap<>();
    private static int currentId = 1;

    // GET : Récupérer tous les utilisateurs
    @GET
    public Response getAllUtilisateurs() {
        return Response.ok(utilisateurs).build();
    }

    // GET : Récupérer un utilisateur par ID
    @GET
    @Path("/{id}")
    public Response getUtilisateurById(@PathParam("id") int id) {
        if (!utilisateurs.containsKey(id)) {
            return Response.status(Response.Status.NOT_FOUND).entity("Utilisateur non trouvé").build();
        }
        return Response.ok(Map.of("id", id, "nom", utilisateurs.get(id))).build();
    }

    // POST : Créer un nouvel utilisateur
    @POST
    public Response createUtilisateur(Map<String, String> input) {
        String nom = input.get("nom");
        utilisateurs.put(currentId, nom);
        return Response.status(Response.Status.CREATED).entity(Map.of("id", currentId++, "nom", nom)).build();
    }

    // PUT : Mettre à jour un utilisateur
    @PUT
    public Response updateUtilisateur(Map<String, String> input) {
        int id = Integer.parseInt(input.get("id"));
        String nom = input.get("nom");

        if (!utilisateurs.containsKey(id)) {
            return Response.status(Response.Status.NOT_FOUND).entity("Utilisateur non trouvé").build();
        }

        utilisateurs.put(id, nom);
        return Response.ok(Map.of("id", id, "nom", nom)).build();
    }

    // DELETE : Supprimer un utilisateur
    @DELETE
    @Path("/{id}")
    public Response deleteUtilisateur(@PathParam("id") int id) {
        if (!utilisateurs.containsKey(id)) {
            return Response.status(Response.Status.NOT_FOUND).entity("Utilisateur non trouvé").build();
        }

        utilisateurs.remove(id);
        return Response.noContent().build();
    }
}
