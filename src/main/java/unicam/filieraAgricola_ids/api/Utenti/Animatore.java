package unicam.filieraAgricola_ids.api.Utenti;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ANIMATORE")
public class Animatore extends Utente {

    public Animatore(String nome, String email, String password, Ruolo ruolo) {
        super(nome, email, password, ruolo);
    }

    public Animatore() {
    }

}
