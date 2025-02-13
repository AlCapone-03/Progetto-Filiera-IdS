package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.utenti.Acquirente;
import unicam.filieraAgricola_ids.api.utenti.Venditore;

public class HandlerPrenotazione extends HandlerEventsPlace {
    public HandlerPrenotazione() {
        super();
    }

    public boolean requestReg(Venditore venditore, int idEvento){
        return getGestore().newRegistration(idEvento, venditore);
    }

    public boolean requestBookEvent(int idEvento, Acquirente acquirente){
        return getGestore().addPartecipant(idEvento, acquirente);
    }
}
