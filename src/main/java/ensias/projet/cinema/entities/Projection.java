package ensias.projet.cinema.entities;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import javax.persistence.*;
import java.util.Collection;
import java.util.Date;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Projection {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Date dateProjaction;
    private double prix;
    @ManyToOne
    private Salle salle;
    @ManyToOne
    private Film film;
    @OneToMany(mappedBy = "projection")
    private Collection<Tickets> tickets;
    @ManyToOne
    private Seance seance;
}
