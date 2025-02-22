package unicam.filieraAgricola_ids.api.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unicam.filieraAgricola_ids.api.service.ServiceRegistrazioneEvento;

@RestController
public class ControllerPrenotazione {

    private ServiceRegistrazioneEvento serviceRegistrazioneEvento;

    @Autowired
    public ControllerPrenotazione(ServiceRegistrazioneEvento serviceRegistrazioneEvento) {
        this.serviceRegistrazioneEvento = serviceRegistrazioneEvento;
    }

    @RequestMapping("/RegAcquirenteEvento")
    public ResponseEntity<String> requestBookEvent(@PathParam("idEvento") int idEvento,
                                                   @PathParam("idAcquirente") int idAcquirente){
        return serviceRegistrazioneEvento.addPartecipant(idEvento,idAcquirente);
    }

    @RequestMapping("/RegVenditoreFiera")
    public ResponseEntity<String> requestReg(@PathParam("idEvento") int idEvento,
                                             @PathParam("idVenditore") int idVenditore){
        return serviceRegistrazioneEvento.newRegistration(idEvento,idVenditore);
    }

}