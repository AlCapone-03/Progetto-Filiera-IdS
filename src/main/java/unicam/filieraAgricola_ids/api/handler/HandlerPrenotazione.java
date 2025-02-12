package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.eventi.Fiera;
import unicam.filieraAgricola_ids.api.utenti.Venditore;

public class HandlerPrenotazione extends HandlerEventsPlace {
    public HandlerPrenotazione() {
        super();
    }

    public boolean registrationFair(Fiera fiera, Venditore venditore){
        return fiera.addFierista(venditore);
    }

}
