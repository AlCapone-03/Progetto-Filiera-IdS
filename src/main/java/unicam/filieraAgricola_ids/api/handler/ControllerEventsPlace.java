package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.gestori.GestoreEventsPlace;

public abstract class ControllerEventsPlace {
    private GestoreEventsPlace gestoreEventsPlace;

    public ControllerEventsPlace(GestoreEventsPlace gestoreEventsPlace) {
        this.gestoreEventsPlace = gestoreEventsPlace;
    }
}
