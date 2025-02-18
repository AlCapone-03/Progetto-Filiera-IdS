package unicam.filieraAgricola_ids.api.factoryUtenti;

import unicam.filieraAgricola_ids.api.handler.*;
import unicam.filieraAgricola_ids.api.utenti.DistributoreTipicita;

import java.util.Arrays;
import java.util.List;

public class FactoryDistributoreTipicita extends FactoryUtente {

    @Override
    public DistributoreTipicita createUser(String nome, String email, String password) {
        return new DistributoreTipicita(nome, email, password);
    }
}
