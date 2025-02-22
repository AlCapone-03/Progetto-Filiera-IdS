package unicam.filieraAgricola_ids.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import unicam.filieraAgricola_ids.api.Dto.EventoDto;
import unicam.filieraAgricola_ids.api.Service.ServiceEvento;

import java.util.List;

@RestController
public class ControllerVisualizzazioneEventi {

    private final ServiceEvento serviceEvento;

    @Autowired
    public ControllerVisualizzazioneEventi(ServiceEvento serviceEvento) {
        this.serviceEvento = serviceEvento;
    }

    @GetMapping("/Eventi")
    public ResponseEntity<List<EventoDto>> showList() {
        return serviceEvento.showList();
    }

}
