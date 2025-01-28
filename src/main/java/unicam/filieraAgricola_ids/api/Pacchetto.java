package unicam.filieraAgricola_ids.api;

import java.util.List;

// Todo : questo prezzo somma

public class Pacchetto implements Prodotto{

    private int id;

    private String nome;

    private List<Prodotto> prodottiPacchetto;

    private float prezzo;

    private String descrizione;

    private int quantita;

    public Pacchetto(int id, List<Prodotto> prodottiPacchetto, float prezzo, String descrizione,
                     int quantita, String nome) {
        this.id = id;
        this.nome = nome;
        this.prodottiPacchetto = prodottiPacchetto;
        this.prezzo = prezzo;
        this.descrizione = descrizione;
        this.quantita = quantita;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Prodotto> getProdottiPacchetto() {
        return prodottiPacchetto;
    }

    public void setProdottiPacchetto(List<Prodotto> prodottiPacchetto) {
        this.prodottiPacchetto = prodottiPacchetto;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }
}
