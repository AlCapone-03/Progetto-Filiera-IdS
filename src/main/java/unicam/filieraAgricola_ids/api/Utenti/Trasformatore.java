package unicam.filieraAgricola_ids.api.Utenti;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("TRASFORMATORE")
public class Trasformatore extends Venditore {

    public Trasformatore(String nome, String email, String password, Ruolo ruolo) {
        super(nome, email, password,ruolo);
    }

    public Trasformatore() {

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
