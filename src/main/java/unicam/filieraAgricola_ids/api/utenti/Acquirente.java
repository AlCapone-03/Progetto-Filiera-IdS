package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

import java.util.ArrayList;
import java.util.List;

public class Acquirente {

    private String nome;

    private List<Prodotto> prodottiAcquistati;

    private List<Prodotto> prodottiSalvati;

    public Acquirente(String nome) {
        this.nome = nome;
        this.prodottiAcquistati = new ArrayList<>();
        this.prodottiSalvati = new ArrayList<>();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    // todo implementare metodo
    public boolean buyProduct(Prodotto prodotto) {
        return false;
    }
}
