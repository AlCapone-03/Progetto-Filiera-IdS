package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.eventi.Evento;

public class HandlerEvento extends HandlerEventsPlace implements IHandlerGestione<Evento> {
    public HandlerEvento() {
        super();
    }

    @Override
    public boolean requestAdd(Evento evento) {
        return getGestore().addEvent(evento);
    }
    @Override
    public boolean requestRemove(int id) {
        return getGestore().removeEvent(id);
    }

    public boolean requestModify(int idEvento, String data_inizio, String data_fine, String nome, String luogo) {
        return getGestore().modifyEvent(idEvento, data_inizio, data_fine, nome, luogo);
    }

}
