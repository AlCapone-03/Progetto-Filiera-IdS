package unicam.filieraAgricola_ids.api.prodotti;


import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public abstract class Prodotto {

    private static int index = 0;
    @Id
    private int id;

    private int idProduttore;

    private String nome;

    private String descrizione;

    private int quantita;

    public Prodotto(String nome, int idProduttore, String descrizione,int quantita) {
        this.id = ++index;
        this.idProduttore = idProduttore;
        this.nome = nome;
        this.descrizione = descrizione;
        this.quantita = quantita;
    }

    public Prodotto() {
        id = index++;
    }

    public int getIdProduttore() {
        return idProduttore;
    }

    public void setIdProduttore(int idProduttore) {
        this.idProduttore = idProduttore;
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

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
