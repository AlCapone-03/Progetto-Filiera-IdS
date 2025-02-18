package unicam.filieraAgricola_ids.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import unicam.filieraAgricola_ids.api.eventi.Evento;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {

}
