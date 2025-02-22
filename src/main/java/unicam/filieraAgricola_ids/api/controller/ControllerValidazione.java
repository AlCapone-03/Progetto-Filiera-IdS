package unicam.filieraAgricola_ids.api.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unicam.filieraAgricola_ids.api.service.ServiceProdotto;
import unicam.filieraAgricola_ids.api.service.ServiceValidazione;

@RestController
public class ControllerValidazione {

    private final ServiceValidazione serviceValidazione;

    private final ServiceProdotto serviceProdotto;

    @Autowired
    public ControllerValidazione(ServiceValidazione serviceValidazione,
                                 ServiceProdotto serviceProdotto) {
        this.serviceValidazione = serviceValidazione;
        this.serviceProdotto = serviceProdotto;
    }

    @RequestMapping(value = "/validate", method = RequestMethod.PUT)
    public ResponseEntity<String> requestValidation(@PathParam("id") int id) {
        return serviceValidazione.validateRequest(id);
    }

    @DeleteMapping(value = "/unvalidate")
    public ResponseEntity<String> requestRemoval(@PathParam("id") int id) {
        return serviceProdotto.removeProduct(id);
    }

}