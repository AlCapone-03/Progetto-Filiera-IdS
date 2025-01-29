package unicam.filieraAgricola_ids.api;

public class GestoreEventsPlace {
    private EventsPlace eventsPlace;

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
