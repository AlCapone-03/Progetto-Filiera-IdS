package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

// manca qualche cosa
public class Curatore extends Utente {

    public Curatore(String nome, String email, String password) {
        super(nome, email, password);
    }

    // todo implementare metodo
    public boolean certifyProduct(Prodotto prodotto) {
        return false;
    }
}
