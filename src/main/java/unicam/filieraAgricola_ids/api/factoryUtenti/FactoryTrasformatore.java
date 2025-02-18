package unicam.filieraAgricola_ids.api.factoryUtenti;

import unicam.filieraAgricola_ids.api.utenti.Trasformatore;

import java.util.Arrays;
import java.util.List;

public class FactoryTrasformatore extends FactoryUtente{

    @Override
    public Trasformatore createUser(String nome, String email, String password) {
         return new Trasformatore(nome, email, password);
     }
}
