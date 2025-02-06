package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.handler.HandlerMarketplace;
import unicam.filieraAgricola_ids.api.handler.HandlerProdotto;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

import java.util.ArrayList;
import java.util.List;

public abstract class Venditore extends Utente {

    private int p_IVA;
    private List<Prodotto> prodottiCaricati;

    //todo creare una lista di handler che ha il venditore

    private final List<HandlerMarketplace> handler;

    public Venditore(String nome, String email, String password,
                     List<HandlerMarketplace> handler, int p_IVA) {
        super(nome, email, password);
        this.handler = handler;
        this.p_IVA = p_IVA;
    }

    private List<HandlerMarketplace> getHandler(){
        List<HandlerMarketplace> appoggio = new ArrayList<>();
        appoggio.add(new HandlerProdotto());
        return appoggio;
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

    //TODO rivedere i metodi sotto commentati
    // metodo per il caricamento di un prodotto sul marketplace
//    public void loadProduct (List<String> certificazioni, String specifiche,
//                             String descrizione, float prezzo, int quantita,
//                             String nomeProdotto) {
//
//        Prodotto prodotto = new ProdottoSingolo(nomeProdotto, descrizione, prezzo,
//                certificazioni, this, specifiche, quantita);
//
//        if(handler.get(0).sendRequest(prodotto)){
//            prodottiCaricati.add(prodotto);
//            System.out.println("Prodotto caricato con successo");
//        }
//        else System.out.println("Errore nel caricamento del prodotto");
//    }

//    public void deleteProduct(Prodotto prodotto){
//
//        if(handler.get(1).sendRequest(prodotto)){
//            prodottiCaricati.remove(prodotto);
//            System.out.println("Prodotto eliminato con successo");
//        }
//        else System.out.println("Errore nell'eliminazione del prodotto");}

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Venditore)) return false;
        Venditore venditore = (Venditore) obj;
        return getP_IVA() == venditore.getP_IVA() && getNome().equals(venditore.getNome());
    }
}
