package unicam.filieraAgricola_ids.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unicam.filieraAgricola_ids.api.utenti.Ruolo;
import unicam.filieraAgricola_ids.api.utenti.Utente;

import java.util.List;

public interface UtenteRepository extends JpaRepository<Utente, Integer> {

    List<Utente> findByRuoloIn(List<Ruolo> ruoli);

    List<Utente> findByNomeAndEmail(String nome, String email);
}
