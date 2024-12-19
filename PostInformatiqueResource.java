

import jakarta.ws.rs.*;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import java.util.*;

@Path("/post_informatique")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
public class PostInformatiqueResource {

    private static Map<Integer, String> posts = new HashMap<>();
    private static int currentId = 1;

    // GET : Récupérer tous les posts
    @GET
    public Response getAllPosts() {
        return Response.ok(posts).build();
    }

    // GET : Récupérer un post par ID
    @GET
    @Path("/{id}")
    public Response getPostById(@PathParam("id") int id) {
        if (!posts.containsKey(id)) {
            return Response.status(Response.Status.NOT_FOUND).entity("Post non trouvé").build();
        }
        return Response.ok(Map.of("id", id, "contenu", posts.get(id))).build();
    }

    // POST : Créer un nouveau post
    @POST
    public Response createPost(Map<String, String> input) {
        String contenu = input.get("contenu");
        posts.put(currentId, contenu);
        return Response.status(Response.Status.CREATED).entity(Map.of("id", currentId++, "contenu", contenu)).build();
    }

    // PUT : Mettre à jour un post
    @PUT
    public Response updatePost(Map<String, String> input) {
        int id = Integer.parseInt(input.get("id"));
        String contenu = input.get("contenu");

        if (!posts.containsKey(id)) {
            return Response.status(Response.Status.NOT_FOUND).entity("Post non trouvé").build();
        }

        posts.put(id, contenu);
        return Response.ok(Map.of("id", id, "contenu", contenu)).build();
    }

    // DELETE : Supprimer un post
    @DELETE
    @Path("/{id}")
    public Response deletePost(@PathParam("id") int id) {
        if (!posts.containsKey(id)) {
            return Response.status(Response.Status.NOT_FOUND).entity("Post non trouvé").build();
        }

        posts.remove(id);
        return Response.noContent().build();
    }
}
