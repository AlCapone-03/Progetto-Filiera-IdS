package unicam.filieraAgricola_ids.api.prodotti;

import unicam.filieraAgricola_ids.api.utenti.Venditore;

import java.util.List;

public class ProdottoSingolo extends Prodotto{


    private List<String> listaCertificazioni;

    private Venditore produttore;

    private String specificheProduzione;

    private int quantita;

    private boolean validato;

    public ProdottoSingolo(String nome, String descrizione,
                           float prezzo, List<String> listaCertificazioni,
                           Venditore produttore, String specificheProduzione,
                           int quantita) {
        super(nome, descrizione, prezzo);
        this.listaCertificazioni = listaCertificazioni;
        this.produttore = produttore;
        this.specificheProduzione = specificheProduzione;
        this.quantita = quantita;
        this.validato = false;
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

    public List<String> getListaCertificazioni() {
        return listaCertificazioni;
    }

    public void setListaCertificazioni(List<String> listaCertificazioni) {
        this.listaCertificazioni = listaCertificazioni;
    }

    public Venditore getProduttore() {
        return produttore;
    }

    public void setProduttore(Venditore produttore) {
        this.produttore = produttore;
    }

    public String getSpecificheProduzione() {
        return specificheProduzione;
    }

    public void setSpecificheProduzione(String specificheProduzione) {
        this.specificheProduzione = specificheProduzione;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public boolean isValidato() {
        return validato;
    }

    public void setValidato(boolean validato) {
        this.validato = validato;
    }

    @Override
    public String toString() {
        return "ProdottoSingolo{" +
                "id=" + getId() +
                ", \n listaCertificazioni=" + listaCertificazioni +
                ", \n produttore=" + produttore.getNome() +
                ", \n specificheProduzione='" + specificheProduzione + '\'' +
                ", \n descrizione='" + getDescrizione() + '\'' +
                ", \n prezzo=" + getPrezzo() +
                ", \nquantita=" + quantita +
                ", \nvalidato=" + validato +
                ", \n nome='" + getNome() + '\'' +
                '}';
    }
}
