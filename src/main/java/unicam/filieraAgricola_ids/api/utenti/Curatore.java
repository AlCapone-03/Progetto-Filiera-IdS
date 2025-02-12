package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.handler.IHandler;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

import java.util.List;

// manca qualche cosa
public class Curatore extends Utente {

    public Curatore(String nome, String email, String password, List<IHandler> handlers) {
        super(nome, email, password, handlers);
    }

    // todo implementare metodo
    public boolean certifyProduct(Prodotto prodotto) {
        return false;
    }
}
