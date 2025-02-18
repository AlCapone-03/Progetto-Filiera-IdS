package unicam.filieraAgricola_ids.api.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.RestController;
import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.gestori.ServiceEvento;

@RestController
public class HandlerEvento{

    private ServiceEvento serviceEvento;

    @Autowired
    public HandlerEvento(ServiceEvento serviceEvento) {
        this.serviceEvento = serviceEvento;
    }

//    public boolean requestAdd(Evento evento) {
//        return serviceEvento.addObject(evento);
//    }
//
//    public boolean requestRemove(int id) {
//        return serviceEvento.removeObject(id);
//    }
//
//    public boolean requestModifyEvent(int idEvento, String data_inizio, String data_fine, String nome, String luogo) {
//        return serviceEvento.modifyEvent(idEvento, data_inizio, data_fine, nome, luogo);
//    }

}
