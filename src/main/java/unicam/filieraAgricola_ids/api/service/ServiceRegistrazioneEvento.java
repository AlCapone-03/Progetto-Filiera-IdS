package unicam.filieraAgricola_ids.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.eventi.EventsPlace;

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



        return new ResponseEntity<>("", HttpStatus.OK);
    }

    //Registrazione Venditore alla fiera
    public ResponseEntity<String> newRegistration(int idEvento, int idVenditore) {


            return new ResponseEntity<>("", HttpStatus.OK);

    }
}
