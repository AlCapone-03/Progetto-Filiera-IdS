package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.eventi.GestoreEventsPlace;

public class ControllerEvento implements IControllerGestione<Evento> {

    private GestoreEventsPlace gestoreEventi;

    public ControllerEvento(GestoreEventsPlace gestoreEventi) {
        this.gestoreEventi = gestoreEventi;
    }

    @Override
    public boolean requestAdd(Evento evento) {
        // todo implementare il metodo
        return false;
    }
}
