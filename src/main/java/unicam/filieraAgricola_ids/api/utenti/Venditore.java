package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.eventi.Fiera;
import unicam.filieraAgricola_ids.api.handler.HandlerPrenotazione;
import unicam.filieraAgricola_ids.api.handler.HandlerProdotto;
import unicam.filieraAgricola_ids.api.handler.HandlerVisualizzazioneEventi;
import unicam.filieraAgricola_ids.api.handler.IHandler;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import unicam.filieraAgricola_ids.api.prodotti.ProdottoSingolo;

import java.util.List;

public abstract class Venditore extends Utente {

    private List<Prodotto> prodottiCaricati;

    public Venditore(String nome, String email, String password,
                     List<IHandler> handlers) {
        super(nome, email, password, handlers);
    }

//    private List<HandlerMarketplace> getHandler(){
//        List<HandlerMarketplace> appoggio = new ArrayList<>();
//        appoggio.add(new HandlerProdotto());
//        return appoggio;
//    }

    public List<Prodotto> getProdottiCaricati() {
        return prodottiCaricati;
    }

    public void setProdottiCaricati(List<Prodotto> prodottiCaricati) {
        this.prodottiCaricati = prodottiCaricati;
    }

    //TODO rivedere i metodi sotto commentati
    // metodo per il caricamento di un prodotto sul marketplace
    public boolean loadProduct (List<String> certificazioni, String descrizione,
                                float prezzo, int quantita, String nomeProdotto) {

        Prodotto prodotto = new ProdottoSingolo(nomeProdotto, descrizione, prezzo,
                certificazioni, this, quantita);

        HandlerProdotto handlerProdotto = (HandlerProdotto) getHandlers().get(0);
        if(handlerProdotto.requestAdd(prodotto)){
            prodottiCaricati.add(prodotto);
            System.out.println("Prodotto caricato con successo");
            return true;
        }
        else System.out.println("Errore nel caricamento del prodotto");
        return false;
    }

    public boolean deleteProduct(Prodotto prodotto){
        HandlerProdotto handlerProdotto = (HandlerProdotto) getHandlers().get(0);

        if(handlerProdotto.requestRemove(prodotto.getId())){
            prodottiCaricati.remove(prodotto);
            System.out.println("Prodotto eliminato con successo");
            return true;
        }
        else System.out.println("Errore nell'eliminazione del prodotto");
        return false;
    }


    //TODO implementare modifyDataProduct, reloadProduct

    public boolean registrationFair(Fiera fiera){
        HandlerPrenotazione handlerPrenotazione = (HandlerPrenotazione) getHandlers().get(2);
        return handlerPrenotazione.registrationFair(fiera, this);
    }

    public boolean modifyDataProduct(){
        return false;
    }

    public boolean reloadProduct(){
        return false;
    }

    public List<Evento> viewAllEvent(){
        HandlerVisualizzazioneEventi handlerVisualizzazione=(HandlerVisualizzazioneEventi) getHandlers().get(1);
        return handlerVisualizzazione.showList();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Venditore venditore)) return false;
        return getNome().equals(venditore.getNome());
    }
}
