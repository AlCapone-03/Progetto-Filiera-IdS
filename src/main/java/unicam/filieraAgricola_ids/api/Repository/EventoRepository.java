package unicam.filieraAgricola_ids.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import unicam.filieraAgricola_ids.api.Eventi.Evento;
import unicam.filieraAgricola_ids.api.Eventi.Fiera;
import unicam.filieraAgricola_ids.api.Utenti.Venditore;
import java.util.List;

@Repository
public interface EventoRepository extends JpaRepository<Evento, Integer> {
    //todo togliere i metodi non utilizzati?
    @Query("SELECT e.listaInvitati FROM EventoAziendale e WHERE e.id = :eventoId")
    List<Venditore> findVenditoriByEventoAziendale(@Param("eventoId") Integer eventoId);

    @Query("SELECT f.listaFieristi FROM Fiera f WHERE f.id = :eventoId")
    List<Venditore> findVenditoriByFiera(@Param("eventoId") Integer eventoId);

    List<Evento> findByNome(String nome);

    List<Evento> findByNomeAndLuogo(String nome, String luogo);

    @Query("SELECT f FROM Fiera f WHERE f.id = :eventoId")
    Fiera findFieraById(@Param("eventoId") Integer eventoId);

}