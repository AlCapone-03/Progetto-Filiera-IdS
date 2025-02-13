package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.handler.HandlerValidazione;
import unicam.filieraAgricola_ids.api.handler.IHandler;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

import java.util.List;

public class Curatore extends Utente {

    public Curatore(String nome, String email, String password, List<IHandler> handlers) {
        super(nome, email, password, handlers);
    }

    public boolean certifyProduct(int idProdotto) {
        return getHandlerValidazione().requestValidation(idProdotto);
    }

    public boolean rejectProduct(int idProdotto) {
        return getHandlerValidazione().requestRemoval(idProdotto);
    }

    public HandlerValidazione getHandlerValidazione() {
        return (HandlerValidazione) getHandlers().get(0);
    }
}
