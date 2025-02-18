package unicam.filieraAgricola_ids.api.factoryUtenti;
import unicam.filieraAgricola_ids.api.utenti.Produttore;
import java.util.Arrays;
import java.util.List;

public class FactoryProduttore extends FactoryUtente {

    @Override
    public Produttore createUser(String nome, String email, String password) {
        return new Produttore(nome, email, password);
    }
}
