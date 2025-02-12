package unicam.filieraAgricola_ids.api.factoryUtenti;
import unicam.filieraAgricola_ids.api.handler.HandlerProdotto;
import unicam.filieraAgricola_ids.api.handler.HandlerVisualizzazioneEventi;
import unicam.filieraAgricola_ids.api.handler.IHandler;
import unicam.filieraAgricola_ids.api.utenti.Produttore;
import unicam.filieraAgricola_ids.api.utenti.Utente;
import java.util.Arrays;
import java.util.List;

public class FactoryProduttore extends FactoryUtente {

    @Override
    public Utente createUser(String nome, String email, String password) {
        List<IHandler> handlers = Arrays.asList(new HandlerProdotto(), new HandlerVisualizzazioneEventi());
        return new Produttore(nome, email, password, handlers);
    }
}
