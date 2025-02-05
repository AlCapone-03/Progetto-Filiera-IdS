package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.gestori.GestoreEventsPlace;

public abstract class HandlerEventsPlace {
    private GestoreEventsPlace gestoreEventsPlace;

    public HandlerEventsPlace() {
        this.gestoreEventsPlace = GestoreEventsPlace.getInstance();
    }
    public GestoreEventsPlace getGEP() {
        return gestoreEventsPlace;
    }
}
