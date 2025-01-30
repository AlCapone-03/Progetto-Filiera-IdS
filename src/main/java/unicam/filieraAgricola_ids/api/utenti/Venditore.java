package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.handler.ControllerProdotto;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import unicam.filieraAgricola_ids.api.prodotti.ProdottoSingolo;

import java.util.ArrayList;
import java.util.List;

public abstract class Venditore {

    private String nome;

    private int p_IVA;

    private List<Prodotto> prodottiCaricati;

    private ControllerProdotto controllerProdotto;

    public Venditore(String nome, int p_IVA, ControllerProdotto controllerProdotto) {
        this.nome = nome;
        this.p_IVA = p_IVA;
        this.prodottiCaricati = new ArrayList<>();
        this.controllerProdotto = controllerProdotto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getP_IVA() {
        return p_IVA;
    }

    public void setP_IVA(int p_IVA) {
        this.p_IVA = p_IVA;
    }

    public List<Prodotto> getProdottiCaricati() {
        return prodottiCaricati;
    }

    public void setProdottiCaricati(List<Prodotto> prodottiCaricati) {
        this.prodottiCaricati = prodottiCaricati;
    }

    public ControllerProdotto getControllerProdotto() {
        return controllerProdotto;
    }

    public void setControllerProdotto(ControllerProdotto controllerProdotto) {
        this.controllerProdotto = controllerProdotto;
    }

    // metodo per il caricamento di un prodotto sul marketplace
    public void loadProduct (int id, List<String> certificazioni,
                             Venditore venditore, String specifiche,
                             String descrizione, float prezzo, int quantita,
                             String nomeProdotto) {

        Prodotto prodotto = new ProdottoSingolo(id, certificazioni,
                venditore, specifiche,
                descrizione, prezzo, quantita, nomeProdotto);

        if(controllerProdotto.requestAddProduct(prodotto)){
            prodottiCaricati.add(prodotto);
            System.out.println("Prodotto caricato con successo");
        }
        else System.out.println("Errore nel caricamento del prodotto");
    }
}
