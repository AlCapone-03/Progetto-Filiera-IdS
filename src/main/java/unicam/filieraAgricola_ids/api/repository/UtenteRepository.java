package unicam.filieraAgricola_ids.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import unicam.filieraAgricola_ids.api.utenti.Ruolo;
import unicam.filieraAgricola_ids.api.utenti.Utente;

public interface UtenteRepository extends JpaRepository<Utente, Integer> {
    Utente findByRuolo(Ruolo ruolo);
}
