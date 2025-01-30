package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.eventi.Evento;

import java.util.ArrayList;
import java.util.List;

public class Animatore {

    private String nome;

    private List<Evento> listaEventiCaricati;

    public Animatore(String nome) {
        this.nome = nome;
        this.listaEventiCaricati = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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
