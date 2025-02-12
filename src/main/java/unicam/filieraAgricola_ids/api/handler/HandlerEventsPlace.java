package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.gestori.GestoreEventsPlace;

public abstract class HandlerEventsPlace implements IHandler {
    private GestoreEventsPlace gestoreEventsPlace;

    public HandlerEventsPlace() {
        this.gestoreEventsPlace = GestoreEventsPlace.getInstance();
    }
    public GestoreEventsPlace getGestore() {
        return gestoreEventsPlace;
    }
}
