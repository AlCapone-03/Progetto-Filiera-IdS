package unicam.filieraAgricola_ids.api.factoryUtenti;

import unicam.filieraAgricola_ids.api.utenti.Curatore;

import java.util.List;

public class FactoryCuratore extends FactoryUtente {

    @Override
    public Curatore createUser(String nome, String email, String password) {
        return new Curatore(nome, email, password);
    }
}
