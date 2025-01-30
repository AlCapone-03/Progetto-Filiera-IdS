package unicam.filieraAgricola_ids.api.eventi;

public class GestoreEventsPlace {

    private final EventsPlace eventsPlace;

    public GestoreEventsPlace(EventsPlace eventsPlace) {
        this.eventsPlace = eventsPlace;
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
