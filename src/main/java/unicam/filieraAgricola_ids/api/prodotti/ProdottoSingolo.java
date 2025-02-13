package unicam.filieraAgricola_ids.api.prodotti;

import unicam.filieraAgricola_ids.api.utenti.Venditore;

import java.util.List;

public class ProdottoSingolo extends Prodotto {

    private List<String> listaCertificazioni;

    private final Venditore produttore;

    private boolean validato;

    private double prezzo;

    public ProdottoSingolo(String nome, String descrizione,
                           double prezzo, List<String> listaCertificazioni,
                           Venditore produttore,int quantita) {
        super(nome, descrizione,quantita);
        this.listaCertificazioni = listaCertificazioni;
        this.produttore = produttore;
        this.validato = false;
        this.prezzo = prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
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
    public String toString() {
        return "\n ProdottoSingolo{" +
                "id=" + getId() +
                ", \n listaCertificazioni=" + listaCertificazioni +
                ", \n produttore=" + produttore.getNome() +
                ", \n descrizione='" + getDescrizione() + '\'' +
                ", \n prezzo=" + getPrezzo() +
                ", \nvalidato=" + validato +
                ", \n nome='" + getNome() + '\'' +
                ", \n quantita= " + getQuantita() +
                '}';
    }
    //TODO scrivere l'equals per entrambi nella classe prodotto
}
