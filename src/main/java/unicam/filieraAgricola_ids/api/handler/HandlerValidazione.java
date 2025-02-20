package unicam.filieraAgricola_ids.api.handler;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unicam.filieraAgricola_ids.api.gestori.ServiceProdotto;
import unicam.filieraAgricola_ids.api.gestori.ServiceValidazione;

@RestController
public class HandlerValidazione{

    private ServiceValidazione serviceValidazione;

    private ServiceProdotto serviceProdotto;

    @Autowired
    public HandlerValidazione(ServiceValidazione serviceValidazione,
                              ServiceProdotto serviceProdotto) {
        this.serviceValidazione = serviceValidazione;
        this.serviceProdotto = serviceProdotto;
    }

    @RequestMapping(value = "/validate", method = RequestMethod.PUT)
    public ResponseEntity<Object> requestValidation(@PathParam("id") int id) {
        return serviceValidazione.validateRequest(id);
    }
    // todo per questo ho aggiunto il serviceProdotto, o si fa così oppure si
    // rifà in serviceValidazione un metodo con la logica simile a RemoveObject in serviceProdotto
    @DeleteMapping(value = "/unvalidate")
    public ResponseEntity<Object> requestRemoval(@PathParam("id") int id) {
        return serviceProdotto.removeObject(id);
    }

}