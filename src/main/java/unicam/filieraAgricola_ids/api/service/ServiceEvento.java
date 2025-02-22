package unicam.filieraAgricola_ids.api.service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.dto.EventoAziendaleDto;
import unicam.filieraAgricola_ids.api.dto.EventoConverter;
import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.eventi.EventoAziendale;
import unicam.filieraAgricola_ids.api.eventi.EventsPlace;
import unicam.filieraAgricola_ids.api.repository.UtenteRepository;
import unicam.filieraAgricola_ids.api.utenti.Venditore;

import java.util.List;

@Service
public class ServiceEvento {

    private final EventsPlace eventsPlace;
    private final ServiceUtenti SvU;


    @Autowired
    public ServiceEvento(EventsPlace eventsPlace, ServiceUtenti SvU) {
        this.eventsPlace = eventsPlace;
        this.SvU = SvU;
    }

    public ResponseEntity<String> addEvent(Evento evento) {
        List<Evento> eventi = eventsPlace.getEventRepository().
                findByNomeAndLuogo(evento.getNome(), evento.getLuogo());
        if(eventi.isEmpty()) {
            eventsPlace.getEventRepository().save(evento);
            return new ResponseEntity<>("Evento creato", HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Evento esistente", HttpStatus.BAD_REQUEST);
    }

    @Transactional
    public ResponseEntity<String> addEventoAziendale(EventoAziendaleDto evento) {
        EventoAziendale eventoAziendale = EventoConverter.dtoToEventoAziendale(evento);
        List<Venditore> vend = SvU.getVenditoriByIds(evento.getListaInvitati());
        eventoAziendale.setListaInvitati(vend);
        return addEvent(eventoAziendale);
    }

    public ResponseEntity<String> removeEvent(int id) {
        if(!eventsPlace.getEventRepository().existsById(id))
            return new ResponseEntity<>("Evento non trovato", HttpStatus.BAD_REQUEST);
        eventsPlace.getEventRepository().deleteById(id);
        return new ResponseEntity<>("Evento rimosso", HttpStatus.OK);
    }

    public ResponseEntity<String> modifyEvent(int id, String data_inizio,
                                              String data_fine, String nome,
                                              String luogo) {
        if(!eventsPlace.getEventRepository().existsById(id))
            return new ResponseEntity<>("Evento non trovato", HttpStatus.BAD_REQUEST);

        Evento evento = eventsPlace.getEventRepository().findById(id).get();
        evento.setData_inizio(data_inizio);
        evento.setData_fine(data_fine);
        evento.setNome(nome);
        evento.setLuogo(luogo);
        eventsPlace.getEventRepository().save(evento);
        return new ResponseEntity<>("Evento modificato", HttpStatus.OK);
    }

    public ResponseEntity<List<Evento>> showList() {
        List<Evento> eventi = eventsPlace.getEventRepository().findAll();
        if(eventi.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);

        return new ResponseEntity<>(eventsPlace.getEventRepository().findAll(), HttpStatus.OK);
    }

}
