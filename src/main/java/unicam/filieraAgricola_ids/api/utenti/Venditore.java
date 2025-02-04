package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.handler.HandlerCaricaProdotto;
import unicam.filieraAgricola_ids.api.handler.HandlerEliminaProdotto;
import unicam.filieraAgricola_ids.api.handler.IHandler;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import unicam.filieraAgricola_ids.api.prodotti.ProdottoSingolo;

import java.util.ArrayList;
import java.util.List;

public abstract class Venditore {

    private String nome;

    private int p_IVA;

    private List<Prodotto> prodottiCaricati;

    //todo creare una lista di handler che ha il venditore

    private final List<IHandler> handler;

    public Venditore(String nome, int p_IVA) {
        this.nome = nome;
        this.p_IVA = p_IVA;
        this.prodottiCaricati = new ArrayList<>();
        this.handler = getHandler();
    }

    private List<IHandler> getHandler(){
        List<IHandler> appoggio = new ArrayList<>();
        appoggio.add(new HandlerCaricaProdotto());
        appoggio.add(new HandlerEliminaProdotto());
        return appoggio;
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

    // metodo per il caricamento di un prodotto sul marketplace
    public void loadProduct (List<String> certificazioni, String specifiche,
                             String descrizione, float prezzo, int quantita,
                             String nomeProdotto) {

        Prodotto prodotto = new ProdottoSingolo(nomeProdotto, descrizione, prezzo,
                certificazioni, this, specifiche, quantita);

        if(handler.get(0).sendRequest(prodotto)){
            prodottiCaricati.add(prodotto);
            System.out.println("Prodotto caricato con successo");
        }
        else System.out.println("Errore nel caricamento del prodotto");
    }

    public void deleteProduct(Prodotto prodotto){

        if(handler.get(1).sendRequest(prodotto)){
            prodottiCaricati.remove(prodotto);
            System.out.println("Prodotto eliminato con successo");
        }
        else System.out.println("Errore nell'eliminazione del prodotto");
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Venditore)) return false;
        Venditore venditore = (Venditore) obj;
        return getP_IVA() == venditore.getP_IVA() && getNome().equals(venditore.getNome());
    }
}
