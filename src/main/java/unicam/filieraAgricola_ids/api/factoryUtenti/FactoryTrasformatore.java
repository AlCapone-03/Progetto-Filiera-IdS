package unicam.filieraAgricola_ids.api.factoryUtenti;

import unicam.filieraAgricola_ids.api.handler.HandlerPrenotazione;
import unicam.filieraAgricola_ids.api.handler.HandlerProdotto;
import unicam.filieraAgricola_ids.api.handler.HandlerVisualizzazioneEventi;
import unicam.filieraAgricola_ids.api.handler.IHandler;
import unicam.filieraAgricola_ids.api.utenti.Trasformatore;
import unicam.filieraAgricola_ids.api.utenti.Utente;

import java.util.Arrays;
import java.util.List;

public class FactoryTrasformatore extends FactoryUtente{
     @Override
    public Trasformatore createUser(String nome, String email, String password) {
         List<IHandler> handlers = Arrays.asList(new HandlerProdotto(), new HandlerVisualizzazioneEventi(),
                 new HandlerPrenotazione());
         return new Trasformatore(nome, email, password, handlers);
     }
}
