package unicam.filieraAgricola_ids.api.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unicam.filieraAgricola_ids.api.Utenti.Ruolo;
import unicam.filieraAgricola_ids.api.Utenti.Utente;

import java.util.List;

public interface UtenteRepository extends JpaRepository<Utente, Integer> {

    List<Utente> findByRuoloIn(List<Ruolo> ruoli);

    List<Utente> findByNomeAndEmail(String nome, String email);
}
