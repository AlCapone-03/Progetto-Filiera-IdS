package unicam.filieraAgricola_ids.api.factoryUtenti;

import unicam.filieraAgricola_ids.api.handler.*;
import unicam.filieraAgricola_ids.api.utenti.Animatore;

import java.util.List;

public class FactoryAnimatore extends FactoryUtente {

    @Override
    public Animatore createUser(String nome, String email, String password) {
        return new Animatore(nome, email, password);
    }
}
