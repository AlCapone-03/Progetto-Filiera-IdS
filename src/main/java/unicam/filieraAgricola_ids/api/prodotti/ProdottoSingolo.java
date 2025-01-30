package unicam.filieraAgricola_ids.api.prodotti;

import unicam.filieraAgricola_ids.api.utenti.Venditore;

import java.util.List;

public class ProdottoSingolo implements Prodotto{

    private int id;

    private List<String> listaCertificazioni;

    private Venditore produttore;

    private String specificheProduzione;

    private String descrizione;

    private float prezzo;

    private int quantita;

    private boolean validato;

    private String nome;

    public ProdottoSingolo(int id, List<String> listaCertificazioni,
                           Venditore produttore, String specificheProduzione,
                           String descrizione, float prezzo, int quantita, String nome) {
        this.id = id;
        this.listaCertificazioni = listaCertificazioni;
        this.produttore = produttore;
        this.specificheProduzione = specificheProduzione;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
        this.quantita = quantita;
        this.validato = false;
        this.nome = nome;
    }

    @Override
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    @Override
    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    @Override
    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
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
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String toString() {
        return "ProdottoSingolo{" +
                "id=" + id +
                ", \n listaCertificazioni=" + listaCertificazioni +
                ", \n produttore=" + produttore.getNome() +
                ", \n specificheProduzione='" + specificheProduzione + '\'' +
                ", \n descrizione='" + descrizione + '\'' +
                ", \n prezzo=" + prezzo +
                ", \nquantita=" + quantita +
                ", \nvalidato=" + validato +
                ", \n nome='" + nome + '\'' +
                '}';
    }
}
