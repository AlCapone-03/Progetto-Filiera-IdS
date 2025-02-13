package unicam.filieraAgricola_ids.api.prodotti;

import unicam.filieraAgricola_ids.api.utenti.Venditore;

import java.util.List;

public class ProdottoSingolo extends Prodotto {

    private List<String> listaCertificazioni;

    private Venditore produttore;

    private boolean validato;

    private float prezzo;

    public ProdottoSingolo(String nome, String descrizione,
                           float prezzo, List<String> listaCertificazioni,
                           Venditore produttore,int quantita) {
        super(nome, descrizione,quantita);
        this.listaCertificazioni = listaCertificazioni;
        this.produttore = produttore;
        this.validato = false;
        this.prezzo = prezzo;
    }

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

    public List<String> getListaCertificazioni() {
        return listaCertificazioni;
    }

    public void setListaCertificazioni(List<String> listaCertificazioni) {
        this.listaCertificazioni = listaCertificazioni;
    }

    public Venditore getProduttore() {
        return produttore;
    }

    public boolean isValidato() {
        return validato;
    }

    public void setValidato(boolean validato) {
        this.validato = validato;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        ProdottoSingolo that = (ProdottoSingolo) obj;
        return getNome().equals(that.getNome()) && getDescrizione().equals(that.getDescrizione()) &&
                getPrezzo() == that.getPrezzo() && listaCertificazioni.equals(that.listaCertificazioni) &&
                produttore.equals(that.produttore) && validato == that.validato;
    }

    @Override
    public String toString() {
        return "ProdottoSingolo{" +
                "id=" + getId() +
                ", \n listaCertificazioni=" + listaCertificazioni +
                ", \n produttore=" + produttore.getNome() +
                ", \n descrizione='" + getDescrizione() + '\'' +
                ", \n prezzo=" + getPrezzo() +
                ", \nvalidato=" + validato +
                ", \n nome='" + getNome() + '\'' +
                '}';
    }
    //TODO scrivere l'equals per entrambi nella classe prodotto
}
