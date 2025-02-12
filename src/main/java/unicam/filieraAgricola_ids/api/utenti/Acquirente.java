package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.handler.IHandler;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import java.util.List;

public class Acquirente extends Utente {


    private List<Prodotto> prodottiAcquistati;
    private List<Prodotto> prodottiSalvati;

    public Acquirente(String nome, String email, String password, List<IHandler> handlers) {
        super(nome, email, password, handlers);
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

    public boolean buyProduct(Prodotto prodotto, int quantita) {
        if (prodotto.getQuantita() < quantita) {
            throw new IllegalArgumentException("Quantità non disponibile");
        }
        prodotto.setQuantita(prodotto.getQuantita() - quantita);
        prodottiAcquistati.add(prodotto);
        return true;

    }
    //TODO come fare per passare il prodotto per parametro? si puo fare? perchè così non serve l'handler

}
