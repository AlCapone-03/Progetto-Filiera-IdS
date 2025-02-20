package unicam.filieraAgricola_ids.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.utenti.Venditore;

import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {
    @Query("SELECT e.listaInvitati FROM EventoAziendale e WHERE e.id = :eventoId")
    List<Venditore> findVenditoriByEventoAziendale(@Param("eventoId") Long eventoId);

    @Query("SELECT f.listaFieristi FROM Fiera f WHERE f.id = :eventoId")
    List<Venditore> findVenditoriByFiera(@Param("eventoId") Long eventoId);
}
