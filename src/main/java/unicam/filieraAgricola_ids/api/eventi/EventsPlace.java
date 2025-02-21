package unicam.filieraAgricola_ids.api.eventi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.repository.EventoRepository;

@Service
public class EventsPlace {

    private final EventoRepository eventoRepository;

    @Autowired
    public EventsPlace(EventoRepository eventoRepository) {
        this.eventoRepository = eventoRepository;
    }

    public EventoRepository getEventRepository() {
        return eventoRepository;
    }

}
