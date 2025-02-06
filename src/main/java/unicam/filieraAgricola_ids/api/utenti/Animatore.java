package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.eventi.Evento;
import java.util.List;

public class Animatore extends Utente {

    private List<Evento> listaEventiCaricati;

    public Animatore(String nome, String email, String password, List<Evento> listaEventiCaricati) {
        super(nome, email, password);
        this.listaEventiCaricati = listaEventiCaricati;
    }

    public List<Evento> getListaEventiCaricati() {
        return listaEventiCaricati;
    }

    public void setListaEventiCaricati(List<Evento> listaEventiCaricati) {
        this.listaEventiCaricati = listaEventiCaricati;
    }

    // todo implementare metodo
    public void createEvent() {
    }
}
