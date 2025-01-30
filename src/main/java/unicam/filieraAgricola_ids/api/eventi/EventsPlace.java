package unicam.filieraAgricola_ids.api.eventi;

import java.util.ArrayList;
import java.util.List;

public class EventsPlace {

    private List<Evento> listaEventi;

    public EventsPlace(List<Evento> listaEventi) {
        this.listaEventi = new ArrayList<>();
    }

    public List<Evento> getListaEventi() {
        return listaEventi;
    }

    public void setListaEventi(List<Evento> listaEventi) {
        this.listaEventi = listaEventi;
    }
}
