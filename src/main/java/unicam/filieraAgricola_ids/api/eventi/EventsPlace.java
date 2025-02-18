package unicam.filieraAgricola_ids.api.eventi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.repository.EventoRepository;


import java.util.ArrayList;
import java.util.List;

@Service
public class EventsPlace {

    private final EventoRepository listaEventi;

    @Autowired
    public EventsPlace(EventoRepository listaEventi) {
        this.listaEventi = listaEventi;
    }

    public EventoRepository getListaEventi() {
        return listaEventi;
    }
}
