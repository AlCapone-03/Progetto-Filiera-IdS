package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.eventi.Evento;

public class HandlerEvento extends HandlerEventsPlace implements IHandlerGestione<Evento> {
    public HandlerEvento() {
        super();
    }

    @Override
    public boolean requestAdd(Evento evento) {
        return getGEP().addEvent(evento);
    }
    @Override
    public boolean requestRemove(int id) {
        return getGEP().removeEvent(id);
    }

}
