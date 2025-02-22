package unicam.filieraAgricola_ids.api.utenti;

import jakarta.persistence.Entity;

@Entity
public abstract class Venditore extends Utente {

    public Venditore() {
    }

    public Venditore(String nome, String email, String password, Ruolo ruolo) {
        super(nome, email, password, ruolo);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Venditore venditore)) return false;
        return getNome().equals(venditore.getNome());
    }

}
