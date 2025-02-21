package unicam.filieraAgricola_ids.api.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.service.ServiceEvento;

@RestController
public class ControllerEvento {

    private final ServiceEvento serviceEvento;

    @Autowired
    public ControllerEvento(ServiceEvento serviceEvento) {
        this.serviceEvento = serviceEvento;
    }

    @PostMapping("/addEvento")
    public ResponseEntity<String> requestAdd(@RequestBody Evento evento) {
        return serviceEvento.addObject(evento);
    }

    @DeleteMapping("/removeEvento")
    public ResponseEntity<String> requestRemove(@PathParam("id") int id) {
        return serviceEvento.removeObject(id);
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
