package fr.isen.ticketapp.interfaces;

import fr.isen.ticketapp.interfaces.models.Utilisateur;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class UtilisateurRepository implements PanacheRepository<Utilisateur> {
    // Les méthodes CRUD sont déjà incluses : findAll(), persist(), delete(), etc.

    // Exemple de méthode personnalisée pour récupérer un utilisateur par son email
    public Utilisateur findByEmail(String email) {
        return find("email", email).firstResult(); // Recherche un utilisateur par son email
    }

    // Exemple de méthode personnalisée pour récupérer un utilisateur par son ID
    public Utilisateur findById(String id) {
        return find("id", id).firstResult(); // Recherche un utilisateur par son ID
    }
}
