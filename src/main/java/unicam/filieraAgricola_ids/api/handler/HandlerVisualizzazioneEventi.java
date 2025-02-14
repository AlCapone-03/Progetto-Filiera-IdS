package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.eventi.Evento;

import java.util.List;
import java.util.NoSuchElementException;

public class HandlerVisualizzazioneEventi extends HandlerEventsPlace implements
        IHandlerVisualizzazione<Evento> {

    public HandlerVisualizzazioneEventi() {
        super();
    }

    @Override
    public List<Evento> showList() {
        if(getGestore().getEventsPlace().getListaEventi().isEmpty()){
            throw new NoSuchElementException("Non ci sono eventi disponibili");
        }else return  getGestore().getEventsPlace().getListaEventi();
    }

}
