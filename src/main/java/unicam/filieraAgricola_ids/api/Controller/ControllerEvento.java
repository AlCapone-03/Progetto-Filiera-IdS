package unicam.filieraAgricola_ids.api.Controller;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unicam.filieraAgricola_ids.api.Dto.EventoAziendaleDto;
import unicam.filieraAgricola_ids.api.Dto.EventoConverter;
import unicam.filieraAgricola_ids.api.Dto.FieraDto;
import unicam.filieraAgricola_ids.api.Eventi.Fiera;
import unicam.filieraAgricola_ids.api.Service.ServiceEvento;

@RestController
public class ControllerEvento {

    private final ServiceEvento serviceEvento;


    @Autowired
    public ControllerEvento(ServiceEvento serviceEvento) {
        this.serviceEvento = serviceEvento;
    }

    @PostMapping("/addFiera")
    public ResponseEntity<String> requestAdd(@RequestBody FieraDto evento) {
        Fiera fiera = EventoConverter.dtoToFiera(evento);
        return serviceEvento.addEvent(fiera);
    }

    @PostMapping("/addEventoAziendale")
    public ResponseEntity<String> requestAdd(@RequestBody EventoAziendaleDto evento) {

        return serviceEvento.addEventoAziendale(evento);
    }


    @DeleteMapping("/removeEvento")
    public ResponseEntity<String> requestRemove(@PathParam("id") int id) {
        return serviceEvento.removeEvent(id);
    }

    @RequestMapping("/modifyEvento")
    public ResponseEntity<String> requestModifyEvent(@PathParam("id") int id,
                                      @PathParam("data_inizio") String data_inizio,
                                      @PathParam("data_fine") String data_fine,
                                      @PathParam("nome") String nome,
                                      @PathParam("luogo") String luogo) {
        return serviceEvento.modifyEvent(id, data_inizio, data_fine, nome, luogo);
    }

}
