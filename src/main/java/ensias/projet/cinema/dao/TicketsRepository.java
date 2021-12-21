package ensias.projet.cinema.dao;

import ensias.projet.cinema.entities.Tickets;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource
public interface TicketsRepository extends JpaRepository<Tickets, Long> {
}
