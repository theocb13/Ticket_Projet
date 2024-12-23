package fr.isen.ticketapp.interfaces;

import fr.isen.ticketapp.interfaces.models.Ticket;
import io.quarkus.hibernate.orm.panache.PanacheRepository;
import jakarta.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class TicketRepository implements PanacheRepository<Ticket> {
    // Les méthodes CRUD sont déjà incluses : findAll(), persist(), delete(), etc.
}