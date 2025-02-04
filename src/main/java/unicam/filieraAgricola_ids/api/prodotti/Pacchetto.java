package unicam.filieraAgricola_ids.api.prodotti;

import java.util.List;

// Todo : questo prezzo somma

public class Pacchetto extends Prodotto{

    private List<Prodotto> prodottiPacchetto;

    private int quantita;

    public Pacchetto(String nome, String descrizione,
                     float prezzo, List<Prodotto> prodottiPacchetto,
                     int quantita) {
        super(nome, descrizione, prezzo);
        this.prodottiPacchetto = prodottiPacchetto;
        this.quantita = quantita;
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public String getDescrizione() {
        return super.getDescrizione();
    }

    @Override
    public void setDescrizione(String descrizione) {
        super.setDescrizione(descrizione);
    }

    @Override
    public float getPrezzo() {
        return super.getPrezzo();
    }

    @Override
    public void setPrezzo(float prezzo) {
        super.setPrezzo(prezzo);
    }

    public List<Prodotto> getProdottiPacchetto() {
        return prodottiPacchetto;
    }

    public void setProdottiPacchetto(List<Prodotto> prodottiPacchetto) {
        this.prodottiPacchetto = prodottiPacchetto;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        if (!super.equals(obj)) return false;
        Pacchetto pacchetto = (Pacchetto) obj;
        return quantita == pacchetto.quantita;
    }

    @Override
    public String toString() {
        return "Pacchetto{ id = " + getId() +
                ", nome = " + getNome() +
                ", quantita=" + quantita +
                '}';
    }
}
