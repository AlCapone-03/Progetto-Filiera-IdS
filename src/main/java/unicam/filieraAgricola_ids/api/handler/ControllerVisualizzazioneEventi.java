package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.gestori.GestoreEventsPlace;

import java.util.List;

public class ControllerVisualizzazioneEventi extends ControllerEventsPlace implements
                                             IControllerVisualizzazione<Evento> {
    public ControllerVisualizzazioneEventi(GestoreEventsPlace gestoreEventsPlace) {
        super(gestoreEventsPlace);
    }

    @Override
    public List<Evento> showList() {
        return null;
    }

}
