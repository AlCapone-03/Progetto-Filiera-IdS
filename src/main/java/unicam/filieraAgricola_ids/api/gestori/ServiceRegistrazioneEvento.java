package unicam.filieraAgricola_ids.api.gestori;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.eventi.EventsPlace;
import unicam.filieraAgricola_ids.api.eventi.Fiera;
import unicam.filieraAgricola_ids.api.utenti.Acquirente;
import unicam.filieraAgricola_ids.api.utenti.Venditore;

@Service
public class ServiceRegistrazioneEvento {

    private EventsPlace eventsPlace;

    @Autowired
    public ServiceRegistrazioneEvento(EventsPlace eventsPlace) {
        this.eventsPlace = eventsPlace;
    }



    public boolean addPartecipant(int idEvento, Acquirente acquirente){
        if(eventsPlace.getListaEventi().isEmpty())
            throw new IllegalArgumentException("Lista Eventi vuota");

        for (Evento e : eventsPlace.getListaEventi()) {
            if (e.getId() == idEvento) {
                return e.getListaPartecipanti().add(acquirente);
            }
        }
        throw new IllegalArgumentException("Evento non trovato");
    }

    public boolean newRegistration(int idEvento, Venditore venditore) {
        if (eventsPlace.getListaEventi().isEmpty())
            throw new IllegalArgumentException("Lista Eventi vuota");

        for (Evento e : eventsPlace.getListaEventi()) {
            if (e.getId() == idEvento && e instanceof Fiera) {
                return ((Fiera) e).addFierista(venditore);
            }
        }
        throw new IllegalArgumentException("Evento non trovato");
    }


}
