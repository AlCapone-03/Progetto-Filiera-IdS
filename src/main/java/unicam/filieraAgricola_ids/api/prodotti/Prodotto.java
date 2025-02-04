package unicam.filieraAgricola_ids.api.prodotti;


public abstract class Prodotto {


    private static int index = 0;

    private final int id;

    private String nome;

    private String descrizione;

    private float prezzo;

    public Prodotto(String nome, String descrizione, float prezzo) {
        this.id = ++index;
        this.nome = nome;
        this.descrizione = descrizione;
        this.prezzo = prezzo;
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

    public float getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(float prezzo) {
        this.prezzo = prezzo;
    }

}
