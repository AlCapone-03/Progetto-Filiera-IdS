package unicam.filieraAgricola_ids.api.gestori;

import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.eventi.EventsPlace;
import unicam.filieraAgricola_ids.api.eventi.Fiera;
import unicam.filieraAgricola_ids.api.utenti.Acquirente;
import unicam.filieraAgricola_ids.api.utenti.Venditore;

@Service
public class GestoreEventsPlace implements IGestore<Evento> {

    private static GestoreEventsPlace gestoreEventsPlace;

    private final EventsPlace eventsPlace;

    private GestoreEventsPlace() {
        this.eventsPlace = EventsPlace.getInstance();
    }

    public static GestoreEventsPlace getInstance() {
        if (gestoreEventsPlace == null) {
            gestoreEventsPlace = new GestoreEventsPlace();
        }
        return gestoreEventsPlace;
    }

    public EventsPlace getEventsPlace() {
        return eventsPlace;
    }

    @Override
    public boolean addObject(Evento event) {
        for(Evento e : eventsPlace.getListaEventi())
            if(e.equals(event))
                throw new IllegalArgumentException("Evento già presente");
        return eventsPlace.getListaEventi().add(event);
    }

    @Override
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

public boolean addPartecipant(int idEvento, Acquirente acquirente){
    if(eventsPlace.getListaEventi().isEmpty())
        throw new IllegalArgumentException("Lista Eventi vuota");

    for (Evento e : eventsPlace.getListaEventi()) {
        if (e.getId() == idEvento) {
            return e.getListaPartecipanti().add(acquirente);
        }
    }
    throw new IllegalArgumentException("Evento non trovato");
}

public boolean newRegistration(int idEvento, Venditore venditore) {
    if (eventsPlace.getListaEventi().isEmpty())
        throw new IllegalArgumentException("Lista Eventi vuota");

    for (Evento e : eventsPlace.getListaEventi()) {
        if (e.getId() == idEvento && e instanceof Fiera) {
            return ((Fiera) e).addFierista(venditore);
        }
    }
    throw new IllegalArgumentException("Evento non trovato");
    }
}
