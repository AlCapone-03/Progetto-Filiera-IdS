package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.handler.*;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

import java.util.ArrayList;
import java.util.List;

public class Acquirente extends Utente {

    private List<Prodotto> prodottiAcquistati;

    private List<Prodotto> prodottiSalvati;

    public Acquirente(String nome, String email, String password, List<IHandler> handlers) {
        super(nome, email, password, handlers);
        prodottiAcquistati = new ArrayList<>();
        prodottiSalvati = new ArrayList<>();
    }

    public List<Prodotto> getProdottiAcquistati() {
        return prodottiAcquistati;
    }

    public List<Prodotto> getProdottiSalvati() {
        return prodottiSalvati;
    }

    public boolean buyProduct(int idProdotto, int quantita) {
      return getHandlerAcquisto().requestBuy(idProdotto, quantita);
    }

    public Prodotto searchProduct(String nome) {
        return getHandlerVisualizzazioneProdotti().requestDisponibility(nome);
    }

    public boolean bookEvent(int idEvento) {
        return getHandlerPrenotazione().requestBookEvent(idEvento,this);
    }

    public List<Prodotto> viewAllProducts() {
        return getHandlerVisualizzazioneProdotti().showList();
    }

    public List<Evento> viewAllEvents() {
        return getHandlerVisualizzazioneEventi().showList();
    }

    public HandlerAcquisto getHandlerAcquisto() {
        return (HandlerAcquisto) getHandlers().get(0);
    }

    public HandlerVisualizzazioneProdotti getHandlerVisualizzazioneProdotti() {
        return (HandlerVisualizzazioneProdotti) getHandlers().get(1);
    }

    public HandlerVisualizzazioneEventi getHandlerVisualizzazioneEventi() {
        return (HandlerVisualizzazioneEventi) getHandlers().get(2);
    }

    public HandlerPrenotazione getHandlerPrenotazione() {
        return (HandlerPrenotazione) getHandlers().get(3);
    }

}
