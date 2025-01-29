package unicam.filieraAgricola_ids.api;

public class Curatore {
    private String nome;

    public Curatore(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }

    public boolean certifyProduct(Prodotto prodotto) {
        return false;
    }
}
