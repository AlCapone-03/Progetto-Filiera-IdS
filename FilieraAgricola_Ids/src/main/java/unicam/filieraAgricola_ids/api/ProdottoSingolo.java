package unicam.filieraAgricola_ids.api;

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
                           String descrizione, float prezzo, int quantita,
                           boolean validato, String nome) {
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

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

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

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
