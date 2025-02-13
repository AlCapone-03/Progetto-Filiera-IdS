package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.eventi.Evento;
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


    public boolean loadProduct(List<String> certificazioni, String descrizione,
                               float prezzo, int quantita, String nomeProdotto) {

        Prodotto prodotto = new ProdottoSingolo(nomeProdotto, descrizione, prezzo,
                certificazioni, this, quantita);

        if (getHandlerProdotto().requestAdd(prodotto)) {
            prodottiCaricati.add(prodotto);
            System.out.println("Prodotto caricato con successo");
            return true;
        } else System.out.println("Errore nel caricamento del prodotto");
        return false;
    }

    public boolean deleteProduct(int idProdotto){
        if(getHandlerProdotto().requestRemove(idProdotto)){
            for(Prodotto p : prodottiCaricati){
                if(p.getId() == idProdotto){
                    prodottiCaricati.remove(p);
                    System.out.println("Prodotto eliminato con successo");
                    return true;
                }
            }
        }
        else System.out.println("Errore nell'eliminazione del prodotto");
        return false;
    }

    public boolean registrationFair(int idEvento){
        return getHandlerPrenotazione().requestReg(this, idEvento);
    }

    public boolean modifyDataProduct(int idProdotto,String nome, int prezzo, String descrizione){
        if(getHandlerProdotto().requestModifyProduct(idProdotto, nome, prezzo, descrizione)){
            System.out.println("Prodotto modificato con successo");
            return true;
        }
        else System.out.println("Errore nella modifica del prodotto");
        return false;
    }

    public boolean reloadProduct(int idProdotto, int quantita){
        return getHandlerProdotto().requestReloadProduct(idProdotto, quantita);
    }

    public List<Evento> viewAllEvent(){
        return getHandlerVisualizzazioneEventi().showList();
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Venditore venditore)) return false;
        return getNome().equals(venditore.getNome());
    }

    public HandlerProdotto getHandlerProdotto(){
        return (HandlerProdotto) getHandlers().get(0);
    }

    public HandlerVisualizzazioneEventi getHandlerVisualizzazioneEventi(){
        return (HandlerVisualizzazioneEventi) getHandlers().get(1);
    }

    public HandlerPrenotazione getHandlerPrenotazione(){
        return (HandlerPrenotazione) getHandlers().get(2);
    }

}
