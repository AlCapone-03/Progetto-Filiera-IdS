package unicam.filieraAgricola_ids.api.gestori;

import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.eventi.EventsPlace;
import unicam.filieraAgricola_ids.api.utenti.Acquirente;

//La classe è un Singleton
public class GestoreEventsPlace implements IGestore {

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

    public boolean addEvent(Evento event) {
        for(Evento e : eventsPlace.getListaEventi())
            if(e.equals(event))
                throw new IllegalArgumentException("Evento già presente");
        return eventsPlace.getListaEventi().add(event);
    }


    public boolean removeEvent(int index) {
        if(eventsPlace.getListaEventi().isEmpty())
            throw new IllegalArgumentException("Lista Eventi vuota");

        for (Evento e : eventsPlace.getListaEventi()) {
            if (e.getId() == index) {
             return eventsPlace.getListaEventi().remove(e);
            }
        }
        throw new IllegalArgumentException("Evento non trovato");
    }

    public boolean modifyEvent(Evento evento,String data_inizio, String data_fine, String nome, String luogo) {
        if(eventsPlace.getListaEventi().isEmpty())
            throw new IllegalArgumentException("Lista Eventi vuota");

        for (Evento e : eventsPlace.getListaEventi()) {
            if (e.equals(evento)) {
                e.setData_inizio(data_inizio);
                e.setData_fine(data_fine);
                e.setLuogo(luogo);
                e.setNome(nome);
                return true;
            }
        }
        throw new IllegalArgumentException("Evento non trovato");
    }

public boolean addPartecipant(Evento evento, Acquirente acquirente){
    if(eventsPlace.getListaEventi().isEmpty())
        throw new IllegalArgumentException("Lista Eventi vuota");

    for (Evento e : eventsPlace.getListaEventi()) {
        if (e.equals(evento)) {
            return e.getListaPartecipanti().add(acquirente);
        }
    }
    throw new IllegalArgumentException("Evento non trovato");
}

   //TODO newRegistration non funziona a meno che non si passi un id anziche la fiera stessa


}
