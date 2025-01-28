package unicam.filieraAgricola_ids.api;

import java.util.List;

public abstract class Venditore {

    private String nome;

    private int p_IVA;

    private List<Prodotto> prodottiCaricati;

    public Venditore(String nome, int p_IVA, List<Prodotto> prodottiCaricati) {
        this.nome = nome;
        this.p_IVA = p_IVA;
        this.prodottiCaricati = prodottiCaricati;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getP_IVA() {
        return p_IVA;
    }

    public void setP_IVA(int p_IVA) {
        this.p_IVA = p_IVA;
    }

    public List<Prodotto> getProdottiCaricati() {
        return prodottiCaricati;
    }

    public void setProdottiCaricati(List<Prodotto> prodottiCaricati) {
        this.prodottiCaricati = prodottiCaricati;
    }

    public void loadProduct (){
        //TODO implementare
    }
}
