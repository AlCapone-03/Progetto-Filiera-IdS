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

    public List<Prodotto> getProdottiCaricati() {
        return prodottiCaricati;
    }


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

    public boolean registrationFair(Fiera fiera){
        HandlerPrenotazione handlerPrenotazione = (HandlerPrenotazione) getHandlers().get(2);
        return handlerPrenotazione.registrationFair(fiera, this);
    }

    public boolean modifyDataProduct(Prodotto prodotto,String nome, int prezzo, String descrizione){
        HandlerProdotto handlerProdotto = (HandlerProdotto) getHandlers().get(0);
        if(handlerProdotto.requestModifyProduct(prodotto, nome, prezzo, descrizione)){
            System.out.println("Prodotto modificato con successo");
            return true;
        }
        else System.out.println("Errore nella modifica del prodotto");
        return false;
    }

    public boolean reloadProduct(Prodotto prodotto, int quantita){
        HandlerProdotto handlerProdotto = (HandlerProdotto) getHandlers().get(0);
        return handlerProdotto.requestReloadProduct(prodotto, quantita);
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
