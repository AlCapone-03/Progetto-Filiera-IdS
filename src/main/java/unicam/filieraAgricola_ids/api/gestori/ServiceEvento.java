package unicam.filieraAgricola_ids.api.gestori;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.eventi.EventsPlace;

@Service
public class ServiceEvento {

    private EventsPlace eventsPlace;

    @Autowired
    public ServiceEvento(EventsPlace eventsPlace) {
        this.eventsPlace = eventsPlace;
    }


    public boolean addObject(Evento event) {
        for(Evento e : eventsPlace.getListaEventi())
            if(e.equals(event))
                throw new IllegalArgumentException("Evento già presente");
        return eventsPlace.getListaEventi().add(event);
    }


    public boolean removeObject(int index) {
        if(eventsPlace.getListaEventi().isEmpty())
            throw new IllegalArgumentException("Lista Eventi vuota");

        for (Evento e : eventsPlace.getListaEventi()) {
            if (e.getId() == index) {
                return eventsPlace.getListaEventi().remove(e);
            }
        }
        throw new IllegalArgumentException("Evento non trovato");
    }

    public boolean modifyEvent(int idEvento,String data_inizio, String data_fine, String nome, String luogo) {
        if(eventsPlace.getListaEventi().isEmpty())
            throw new IllegalArgumentException("Lista Eventi vuota");

        for (Evento e : eventsPlace.getListaEventi()) {
            if (e.getId() == idEvento) {
                e.setData_inizio(data_inizio);
                e.setData_fine(data_fine);
                e.setNome(nome);
                e.setLuogo(luogo);
                return true;
            }
        }
        throw new IllegalArgumentException("Evento non trovato");
    }
}
