package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

import java.util.ArrayList;
import java.util.List;

public abstract class Venditore extends Utente {

    private final List<Prodotto> prodottiCaricati;

    public Venditore(String nome, String email, String password) {
        super(nome, email, password);
        this.prodottiCaricati = new ArrayList<>();
    }

    public List<Prodotto> getProdottiCaricati() {
        return prodottiCaricati;
    }


//    public boolean loadProduct(List<String> certificazioni, String descrizione,
//                               double prezzo, int quantita, String nomeProdotto) {
//
//        Prodotto prodotto = new ProdottoSingolo(nomeProdotto, descrizione, prezzo,
//                certificazioni, this, quantita);
//
//        if (getHandlerProdotto().requestAdd(prodotto)) {
//            prodottiCaricati.add(prodotto);
//            System.out.println("Prodotto caricato con successo");
//            return true;
//        } else System.out.println("Errore nel caricamento del prodotto");
//        return false;
//    }

//    public boolean deleteProduct(int idProdotto){
//        if(getHandlerProdotto().requestRemove(idProdotto)){
//            for(Prodotto p : prodottiCaricati){
//                if(p.getId() == idProdotto){
//                    prodottiCaricati.remove(p);
//                    System.out.println("Prodotto eliminato con successo");
//                    return true;
//                }
//            }
//        }
//        else System.out.println("Errore nell'eliminazione del prodotto");
//        return false;
//    }

//    public boolean registrationFair(int idEvento){
//        return getHandlerPrenotazione().requestReg(this, idEvento);
//    }
//
//    public boolean modifyDataProduct(int idProdotto,String nome, int prezzo, String descrizione){
//        if(getHandlerProdotto().requestModifyProduct(idProdotto, nome, prezzo, descrizione)){
//            System.out.println("Prodotto modificato con successo");
//            return true;
//        }
//        else System.out.println("Errore nella modifica del prodotto");
//        return false;
//    }
//
//    public boolean reloadProduct(int idProdotto, int quantita){
//        return getHandlerProdotto().requestReloadProduct(idProdotto, quantita);
//    }
//
//    public List<Evento> viewAllEvents(){
//        return getHandlerVisualizzazioneEventi().showList();
//    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Venditore venditore)) return false;
        return getNome().equals(venditore.getNome());
    }

}
