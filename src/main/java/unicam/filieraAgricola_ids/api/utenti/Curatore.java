package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

// manca qualche cosa
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

    // todo implementare metodo
    public boolean certifyProduct(Prodotto prodotto) {
        return false;
    }
}
