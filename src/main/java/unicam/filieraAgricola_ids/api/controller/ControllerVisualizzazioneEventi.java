package unicam.filieraAgricola_ids.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.service.ServiceEvento;

import java.util.List;

@RestController
public class ControllerVisualizzazioneEventi {

    private final ServiceEvento serviceEvento;

    @Autowired
    public ControllerVisualizzazioneEventi(ServiceEvento serviceEvento) {
        this.serviceEvento = serviceEvento;
    }

    @GetMapping("/Eventi")
    public ResponseEntity<List<Evento>> showList() {
        return serviceEvento.showList();
    }

}
