package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import java.util.List;

public class Acquirente extends Utente {


    private List<Prodotto> prodottiAcquistati;
    private List<Prodotto> prodottiSalvati;

    public Acquirente(String nome, String email, String password,
                      List<Prodotto> prodottiAcquistati, List<Prodotto> prodottiSalvati) {
        super(nome, email, password);
        this.prodottiAcquistati = prodottiAcquistati;
        this.prodottiSalvati = prodottiSalvati;
    }

    public List<Prodotto> getProdottiAcquistati() {
        return prodottiAcquistati;
    }

    public void setProdottiAcquistati(List<Prodotto> prodottiAcquistati) {
        this.prodottiAcquistati = prodottiAcquistati;
    }

    public List<Prodotto> getProdottiSalvati() {
        return prodottiSalvati;
    }

    public void setProdottiSalvati(List<Prodotto> prodottiSalvati) {
        this.prodottiSalvati = prodottiSalvati;
    }

    // todo implementare metodo
    public boolean buyProduct(Prodotto prodotto) {
        return false;
    }
}
