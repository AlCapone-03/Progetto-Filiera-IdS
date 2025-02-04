package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.gestori.GestoreEventsPlace;

public class ControllerEvento extends ControllerEventsPlace implements IControllerGestione<Evento> {
    public ControllerEvento(GestoreEventsPlace gestoreEventsPlace) {
        super(gestoreEventsPlace);
    }

    @Override
    public boolean requestAdd(Evento evento) {
        // todo implementare il metodo
        return false;
    }

}
