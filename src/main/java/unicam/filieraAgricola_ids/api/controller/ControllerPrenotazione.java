package unicam.filieraAgricola_ids.api.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unicam.filieraAgricola_ids.api.service.ServiceRegistrazioneEvento;
import unicam.filieraAgricola_ids.api.service.ServiceValidazione;

@RestController
public class ControllerPrenotazione {

    private ServiceRegistrazioneEvento serviceRegistrazioneEvento;

    @Autowired
    public ControllerPrenotazione(ServiceRegistrazioneEvento
                                              serviceRegistrazioneEvento) {
        this.serviceRegistrazioneEvento = serviceRegistrazioneEvento;
    }

    @RequestMapping("/RegVenditoreFiera")
    public ResponseEntity<String> requestReg(@PathParam("idEvento") int idEvento,
                                             @PathParam("idVenditore") int idVenditore){
        return serviceRegistrazioneEvento.newRegistration(idEvento,idVenditore);
    }

    @RequestMapping("/RegAcquirenteEvento")
    public ResponseEntity<String> requestBookEvent(int idEvento){
        return serviceRegistrazioneEvento.addPartecipant(idEvento);
    }
}
