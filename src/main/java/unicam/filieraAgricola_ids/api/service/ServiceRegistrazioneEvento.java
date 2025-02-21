package unicam.filieraAgricola_ids.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.eventi.EventsPlace;

@Service
public class ServiceRegistrazioneEvento {

    private final EventsPlace eventsPlace;

    @Autowired
    public ServiceRegistrazioneEvento(EventsPlace eventsPlace) {
        this.eventsPlace = eventsPlace;
    }

    public ResponseEntity<String> addPartecipant(int idEvento){
        return new ResponseEntity<>("", HttpStatus.OK);
    }

    public ResponseEntity<String> newRegistration(int idEvento, int idVenditore) {


            return new ResponseEntity<>("", HttpStatus.OK);

    }
}
