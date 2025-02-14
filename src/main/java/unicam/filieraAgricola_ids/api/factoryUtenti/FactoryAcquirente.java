package unicam.filieraAgricola_ids.api.factoryUtenti;

import unicam.filieraAgricola_ids.api.handler.*;
import unicam.filieraAgricola_ids.api.utenti.Acquirente;

import java.util.Arrays;
import java.util.List;

public class FactoryAcquirente extends FactoryUtente {

    @Override
    public Acquirente createUser(String nome, String email, String password) {
        List<IHandler> handlers = Arrays.asList(new HandlerAcquisto(), new HandlerVisualizzazioneProdotti(),
                new HandlerVisualizzazioneEventi(), new HandlerPrenotazione());
        return new Acquirente(nome, email, password, handlers);
    }
}
