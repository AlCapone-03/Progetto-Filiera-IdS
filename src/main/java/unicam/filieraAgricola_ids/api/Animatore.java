package unicam.filieraAgricola_ids.api;

import java.util.List;

public class Animatore {
    private String nome;
    private List<Evento> listaEventiCaricati;

    public Animatore(String nome, List<Evento> listaEventiCaricati) {
        this.nome = nome;
        this.listaEventiCaricati = listaEventiCaricati;
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

    public void createEvent() {
    }
}
