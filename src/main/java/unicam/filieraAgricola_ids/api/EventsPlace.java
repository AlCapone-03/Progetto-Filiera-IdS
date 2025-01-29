package unicam.filieraAgricola_ids.api;

import java.util.List;

public class EventsPlace {
    private List<Evento> listaEventi;

    public EventsPlace(List<Evento> listaEventi) {
        this.listaEventi = listaEventi;
    }

    public List<Evento> getListaEventi() {
        return listaEventi;
    }

    public void setListaEventi(List<Evento> listaEventi) {
        this.listaEventi = listaEventi;
    }
}
