package unicam.filieraAgricola_ids.api.utenti;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("PRODUTTORE")
public class Produttore extends Venditore {
    public Produttore(String nome, String email, String password, Ruolo ruolo) {
        super(nome, email, password, ruolo);
    }

    public Produttore() {

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
