package unicam.filieraAgricola_ids.api.dto;


import unicam.filieraAgricola_ids.api.eventi.EventoAziendale;
import unicam.filieraAgricola_ids.api.eventi.Fiera;
import java.util.ArrayList;

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

}



