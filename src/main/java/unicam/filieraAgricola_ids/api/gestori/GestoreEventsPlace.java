package unicam.filieraAgricola_ids.api.gestori;

import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.eventi.EventsPlace;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

//La classe è un Singleton
public class GestoreEventsPlace {

    private static GestoreEventsPlace gestoreEventsPlace;

    private final EventsPlace eventsPlace;

    private GestoreEventsPlace() {
        this.eventsPlace = EventsPlace.getInstance();
    }

    public static GestoreEventsPlace getInstance() {
        if (gestoreEventsPlace == null) {
            gestoreEventsPlace = new GestoreEventsPlace();
        }
        return gestoreEventsPlace;
    }

    public EventsPlace getEventsPlace() {
        return eventsPlace;
    }

    //TODO implementare l'equals sulla classe evento aziendale e fiera
    public boolean addEvent(Evento event) {
        for(Evento e : eventsPlace.getListaEventi())
            if(e.equals(event))
                throw new IllegalArgumentException("Evento già presente");
        return eventsPlace.getListaEventi().add(event);
    }


    public boolean removeEvent(int index) {
        if(eventsPlace.getListaEventi().isEmpty())
            throw new IllegalArgumentException("Lista Eventi vuota");

        for (Evento e : eventsPlace.getListaEventi()) {
            if (e.getId() == index) {
             return eventsPlace.getListaEventi().remove(e);
            }
        }
        throw new IllegalArgumentException("Evento non trovato");
    }

}
