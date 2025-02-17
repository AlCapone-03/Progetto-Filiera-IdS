package unicam.filieraAgricola_ids.api.eventi;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class EventsPlace {

    private static EventsPlace eventsPlace;

    private final List<Evento> listaEventi;

    private EventsPlace() {
        this.listaEventi = new ArrayList<>();
    }

    public static EventsPlace getInstance() {
        if (eventsPlace == null) {
            eventsPlace = new EventsPlace();
        }
        return eventsPlace;
    }

    public List<Evento> getListaEventi() {
        return listaEventi;
    }

}
