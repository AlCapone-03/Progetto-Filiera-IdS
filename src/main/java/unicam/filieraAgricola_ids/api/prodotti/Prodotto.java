package unicam.filieraAgricola_ids.api.prodotti;


import unicam.filieraAgricola_ids.api.utenti.Venditore;

public abstract class Prodotto {

    private static int index = 0;

    private final int id;

    private final Venditore produttore;

    private String nome;

    private String descrizione;

    private int quantita;

    public Prodotto(String nome,Venditore creatore, String descrizione,int quantita) {
        this.id = ++index;
        this.produttore = creatore;
        this.nome = nome;
        this.descrizione = descrizione;
        this.quantita = quantita;
    }

    public Venditore getProduttore() {
        return produttore;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
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

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Prodotto that = (Prodotto) obj;
        return getNome().equals(that.getNome()) && getDescrizione().equals(that.getDescrizione()) &&
                getQuantita() == that.getQuantita() && getId() == that.getId();
    }
}
