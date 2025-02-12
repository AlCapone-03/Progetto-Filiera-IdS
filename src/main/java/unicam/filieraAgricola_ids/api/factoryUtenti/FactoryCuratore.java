package unicam.filieraAgricola_ids.api.factoryUtenti;

import unicam.filieraAgricola_ids.api.handler.HandlerValidazione;
import unicam.filieraAgricola_ids.api.handler.IHandler;
import unicam.filieraAgricola_ids.api.utenti.Curatore;
import unicam.filieraAgricola_ids.api.utenti.Utente;

import java.util.List;

public class FactoryCuratore extends FactoryUtente {

    @Override
    public Utente createUser(String nome, String email, String password) {
        List<IHandler> handlers = List.of(new HandlerValidazione());
        return new Curatore(nome, email, password,handlers);
    }
}
