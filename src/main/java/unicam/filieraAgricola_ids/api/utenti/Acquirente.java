package unicam.filieraAgricola_ids.api.utenti;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("ACQUIRENTE")
public class Acquirente extends Utente {


    public Acquirente(String nome, String email, String password, Ruolo ruolo) {
        super(nome, email, password, ruolo);
    }

    public Acquirente() {
    }
//    public Prodotto searchProduct(String nome) {
//        return getHandlerVisualizzazioneProdotti().requestDisponibility(nome);
//    }
//
//    public boolean bookEvent(int idEvento) {
//        return getHandlerPrenotazione().requestBookEvent(idEvento,this);
//    }
//
//    public List<Prodotto> viewAllProducts() {
//        return getHandlerVisualizzazioneProdotti().showList();
//    }
//
//    public List<Evento> viewAllEvents() {
//        return getHandlerVisualizzazioneEventi().showList();
//    }
//
//    public HandlerAcquisto getHandlerAcquisto() {
//        return (HandlerAcquisto) getHandlers().get(0);
//    }
//
//    public HandlerVisualizzazioneProdotti getHandlerVisualizzazioneProdotti() {
//        return (HandlerVisualizzazioneProdotti) getHandlers().get(1);
//    }
//
//    public HandlerVisualizzazioneEventi getHandlerVisualizzazioneEventi() {
//        return (HandlerVisualizzazioneEventi) getHandlers().get(2);
//    }
//
//    public HandlerPrenotazione getHandlerPrenotazione() {
//        return (HandlerPrenotazione) getHandlers().get(3);
//    }

}
