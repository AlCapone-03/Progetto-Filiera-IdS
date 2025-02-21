package unicam.filieraAgricola_ids.api.utenti;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("DISTRIBUTORE")
public class DistributoreTipicita extends Venditore {

    public DistributoreTipicita(String nome, String email, String password, Ruolo ruolo) {
        super(nome, email, password, ruolo);
    }

    public DistributoreTipicita() {

    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
