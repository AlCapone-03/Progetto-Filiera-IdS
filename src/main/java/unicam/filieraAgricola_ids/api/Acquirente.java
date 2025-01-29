package unicam.filieraAgricola_ids.api;

import java.util.List;

public class Acquirente {
    private String nomeAcquirente;
    private List<Prodotto> prodottiAcquistati;
    private List<Prodotto> prodottiSalvati;

    public Acquirente(String nomeAcquirente, List<Prodotto> prodottiAcquistati, List<Prodotto> prodottiSalvati) {
        this.nomeAcquirente = nomeAcquirente;
        this.prodottiAcquistati = prodottiAcquistati;
        this.prodottiSalvati = prodottiSalvati;
    }

    public String getNomeAcquirente() {
        return nomeAcquirente;
    }

    public void setNomeAcquirente(String nomeAcquirente) {
        this.nomeAcquirente = nomeAcquirente;
    }

    public List<Prodotto> getProdottiAcquistati() {
        return prodottiAcquistati;
    }

    public void setProdottiAcquistati(List<Prodotto> prodottiAcquistati) {
        this.prodottiAcquistati = prodottiAcquistati;
    }

    public List<Prodotto> getProdottiSalvati() {
        return prodottiSalvati;
    }

    public void setProdottiSalvati(List<Prodotto> prodottiSalvati) {
        this.prodottiSalvati = prodottiSalvati;
    }

    public boolean buyProduct(Prodotto prodotto) {
        return false;
    }
}
