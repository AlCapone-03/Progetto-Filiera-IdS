package unicam.filieraAgricola_ids.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.eventi.EventsPlace;
import unicam.filieraAgricola_ids.api.eventi.Fiera;
import unicam.filieraAgricola_ids.api.utenti.Acquirente;
import unicam.filieraAgricola_ids.api.utenti.Venditore;
import java.util.List;

@Service
public class ServiceRegistrazioneEvento {

    private final EventsPlace eventsPlace;
    private final ServiceUtenti serviceUtenti;

    @Autowired
    public ServiceRegistrazioneEvento(EventsPlace eventsPlace, ServiceUtenti serviceUtenti) {
        this.serviceUtenti = serviceUtenti;
        this.eventsPlace = eventsPlace;
    }

    //Registrazione Acquirente all'evento
    public ResponseEntity<String> addPartecipant(int idEvento, int idAcquirente) {
        Evento evento = eventsPlace.getEventRepository().findById(idEvento).orElse(null);
        Acquirente acquirente = (Acquirente) serviceUtenti.getRepository().findById(idAcquirente).orElse(null);
        if (evento != null) {
            if (evento.getListaPartecipanti().contains(acquirente)) {
                return new ResponseEntity<>("Acquirente già iscritto", HttpStatus.BAD_REQUEST);
            }
            evento.getListaPartecipanti().add(acquirente);
            eventsPlace.getEventRepository().save(evento);
            return new ResponseEntity<>("Acquirente inserito", HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Evento inesistente", HttpStatus.BAD_REQUEST);
    }

    //Registrazione Venditore alla fiera
    public ResponseEntity<String> newRegistration(int idEvento, int idVenditore) {
        Fiera evento = eventsPlace.getEventRepository().findFieraById(idEvento);
        Venditore venditore = serviceUtenti.getVenditoriByIds(List.of(idVenditore)).get(0);
        if (evento != null) {
            if (evento.getListaFieristi().contains(venditore)) {
                return new ResponseEntity<>("Venditore già iscritto", HttpStatus.BAD_REQUEST);
            }
            evento.getListaFieristi().add(venditore);
            eventsPlace.getEventRepository().save(evento);
            return new ResponseEntity<>("Venditore inserito", HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Fiera inesistente", HttpStatus.BAD_REQUEST);
    }

}