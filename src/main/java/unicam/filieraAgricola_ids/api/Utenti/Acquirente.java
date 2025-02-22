package unicam.filieraAgricola_ids.api.Utenti;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ACQUIRENTE")
public class Acquirente extends Utente {

    public Acquirente(String nome, String email, String password, Ruolo ruolo) {
        super(nome, email, password, ruolo);
    }

    public Acquirente() {
    }

}
