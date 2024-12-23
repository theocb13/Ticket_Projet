package fr.isen.ticketapp.interfaces;

import fr.isen.ticketapp.interfaces.models.PosteInformatique;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class PosteRepository implements PanacheRepository<PosteInformatique> {
    // Méthode pour insérer un poste
    public PosteInformatique createPoste(PosteInformatique poste) {
        persist(poste);  // Persiste le poste dans la BDD
        return poste;
    }
}
