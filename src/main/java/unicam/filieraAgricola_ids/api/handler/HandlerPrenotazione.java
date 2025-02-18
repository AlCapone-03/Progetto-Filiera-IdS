package unicam.filieraAgricola_ids.api.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import unicam.filieraAgricola_ids.api.gestori.ServiceValidazione;
import unicam.filieraAgricola_ids.api.utenti.Acquirente;
import unicam.filieraAgricola_ids.api.utenti.Venditore;

@RestController
public class HandlerPrenotazione {

    private ServiceValidazione serviceValidazione;

    @Autowired
    public HandlerPrenotazione(ServiceValidazione serviceValidazione) {
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
