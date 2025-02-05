package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.gestori.GestoreEventsPlace;

import java.util.List;

public class HandlerVisualizzazioneEventi extends HandlerEventsPlace implements
        IHandlerVisualizzazione<Evento> {
    public HandlerVisualizzazioneEventi() {
        super();
    }

    @Override
    public List<Evento> showList() {
        return null;
    }

}
