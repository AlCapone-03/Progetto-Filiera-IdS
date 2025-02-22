package unicam.filieraAgricola_ids.api.Dto;

import unicam.filieraAgricola_ids.api.Eventi.Evento;
import unicam.filieraAgricola_ids.api.Eventi.EventoAziendale;
import unicam.filieraAgricola_ids.api.Eventi.Fiera;
import java.util.ArrayList;
import java.util.List;

public class EventoConverter {


    public static EventoAziendale dtoToEventoAziendale(EventoAziendaleDto evento) {
        EventoAziendale eventoAziendale = new EventoAziendale();
        eventoAziendale.setData_inizio(evento.getData_inizio());
        eventoAziendale.setData_fine(evento.getData_fine());
        eventoAziendale.setLuogo(evento.getLuogo());
        eventoAziendale.setNome(evento.getNome());
        eventoAziendale.setListaInvitati(new ArrayList<>());
        return eventoAziendale;
    }

    public static Fiera dtoToFiera(FieraDto evento) {
        Fiera fiera = new Fiera();
        fiera.setData_inizio(evento.getData_inizio());
        fiera.setData_fine(evento.getData_fine());
        fiera.setLuogo(evento.getLuogo());
        fiera.setNome(evento.getNome());
        fiera.setDettagli(evento.getDettagli());
        return fiera;
    }

    public static List<EventoDto> eventiToDto(List<Evento> eventi) {
        List<EventoDto> eventiDto = new ArrayList<>();
        for(Evento e : eventi) {
            if(e instanceof EventoAziendale) {
                EventoAziendaleDto eventoAziendaleDto = new EventoAziendaleDto();
                eventoAziendaleDto.setData_inizio(e.getData_inizio());
                eventoAziendaleDto.setData_fine(e.getData_fine());
                eventoAziendaleDto.setLuogo(e.getLuogo());
                eventoAziendaleDto.setNome(e.getNome());
                eventiDto.add(eventoAziendaleDto);
            }
            else {
                FieraDto fieraDto = new FieraDto();
                fieraDto.setData_inizio(e.getData_inizio());
                fieraDto.setData_fine(e.getData_fine());
                fieraDto.setLuogo(e.getLuogo());
                fieraDto.setNome(e.getNome());
                fieraDto.setDettagli(((Fiera) e).getDettagli());
                eventiDto.add(fieraDto);
            }
        }
        return eventiDto;
    }

}



