package unicam.filieraAgricola_ids.api.factoryUtenti;

import unicam.filieraAgricola_ids.api.handler.*;
import unicam.filieraAgricola_ids.api.utenti.Animatore;
import unicam.filieraAgricola_ids.api.utenti.Utente;

import java.util.List;

public class FactoryAnimatore extends FactoryUtente {

    @Override
    public Animatore createUser(String nome, String email, String password) {
        List<IHandler> handlers = List.of(new HandlerEvento());
        return new Animatore(nome, email, password, handlers);
    }
}
