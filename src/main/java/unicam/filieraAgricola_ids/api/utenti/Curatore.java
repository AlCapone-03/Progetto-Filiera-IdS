package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.handler.HandlerValidazione;

import java.util.List;

public class Curatore extends Utente {

    public Curatore(String nome, String email, String password) {
        super(nome, email, password);
    }

//    public boolean certifyProduct(int idProdotto) {
//        return getHandlerValidazione().requestValidation(idProdotto);
//    }
//
//    public boolean rejectProduct(int idProdotto) {
//        return getHandlerValidazione().requestRemoval(idProdotto);
//    }

}
