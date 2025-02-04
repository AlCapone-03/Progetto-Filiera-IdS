package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.gestori.GestoreEventsPlace;

public class ControllerEvento implements IControllerGestione<Evento> {

    private GestoreEventsPlace gestoreEventi;

    public ControllerEvento() {
        this.gestoreEventi = GestoreEventsPlace.getInstance();
    }

    @Override
    public boolean requestAdd(Evento evento) {
        // todo implementare il metodo
        return false;
    }
}
