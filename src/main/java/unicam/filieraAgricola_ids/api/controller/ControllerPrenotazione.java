package unicam.filieraAgricola_ids.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;
import unicam.filieraAgricola_ids.api.service.ServiceValidazione;

@RestController
public class ControllerPrenotazione {

    private ServiceValidazione serviceValidazione;

    @Autowired
    public ControllerPrenotazione(ServiceValidazione serviceValidazione) {
        this.serviceValidazione = serviceValidazione;
    }

//    public boolean requestReg(Venditore venditore, int idEvento){
//        return getGestore().newRegistration(idEvento, venditore);
//    }
//
//    public boolean requestBookEvent(int idEvento, Acquirente acquirente){
//        return getGestore().addPartecipant(idEvento, acquirente);
//    }
}
