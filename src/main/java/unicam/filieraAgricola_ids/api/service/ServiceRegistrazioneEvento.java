package unicam.filieraAgricola_ids.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.eventi.EventsPlace;

@Service
public class ServiceRegistrazioneEvento {

    private final EventsPlace eventsPlace;

    @Autowired
    public ServiceRegistrazioneEvento(EventsPlace eventsPlace) {
        this.eventsPlace = eventsPlace;
    }

//    public boolean addPartecipant(int idEvento, Acquirente acquirente){
//        if(eventsPlace.getListaEventi().isEmpty())
//            throw new IllegalArgumentException("Lista Eventi vuota");
//
//        for (Evento e : eventsPlace.getListaEventi()) {
//            if (e.getId() == idEvento) {
//                return e.getListaPartecipanti().add(acquirente);
//            }
//        }
//        throw new IllegalArgumentException("Evento non trovato");
//    }
//
//    public boolean newRegistration(int idEvento, Venditore venditore) {
//        if (eventsPlace.getListaEventi().isEmpty())
//            throw new IllegalArgumentException("Lista Eventi vuota");
//
//        for (Evento e : eventsPlace.getListaEventi()) {
//            if (e.getId() == idEvento && e instanceof Fiera) {
//                return ((Fiera) e).addFierista(venditore);
//            }
//        }
//        throw new IllegalArgumentException("Evento non trovato");
//    }

}
