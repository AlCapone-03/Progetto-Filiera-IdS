package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.handler.HandlerValidazione;
import unicam.filieraAgricola_ids.api.handler.IHandler;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

import java.util.List;

public class Curatore extends Utente {

    public Curatore(String nome, String email, String password, List<IHandler> handlers) {
        super(nome, email, password, handlers);
    }

    public boolean certifyProduct(Prodotto prodotto) {
        HandlerValidazione handlerValidazione = (HandlerValidazione) getHandlers().get(0);
        return handlerValidazione.requestValidation(prodotto);
    }
}
