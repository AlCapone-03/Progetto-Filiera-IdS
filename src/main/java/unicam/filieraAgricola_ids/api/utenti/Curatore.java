package unicam.filieraAgricola_ids.api.utenti;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("CURATORE")
public class Curatore extends Utente {

    public Curatore(String nome, String email, String password,Ruolo ruolo) {
        super(nome, email, password,ruolo);
    }

    public Curatore() {

    }

}
