package unicam.filieraAgricola_ids.api.gestori;

import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.eventi.EventsPlace;

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

    public void addEvent(Evento event) {
        eventsPlace.getListaEventi().add(event);
    }

    /*
    public void removeEvent(Evento event) {
        eventsPlace.getListaEventi().remove(event);
    }
    */

}
