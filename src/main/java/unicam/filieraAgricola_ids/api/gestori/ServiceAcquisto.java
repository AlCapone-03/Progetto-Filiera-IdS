package unicam.filieraAgricola_ids.api.gestori;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.prodotti.Marketplace;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

import java.util.NoSuchElementException;

@Service
public class ServiceAcquisto {

    private Marketplace marketplace;

    @Autowired
    public ServiceAcquisto(Marketplace marketplace) {
        this.marketplace = marketplace;
    }

    public Prodotto subtractProductQuantity(int idProdotto, int quantita) {
        Prodotto p = getProductById(idProdotto);
        if (p.getQuantita() >= quantita) {
            p.setQuantita(p.getQuantita() - quantita);
            return p;
        } else throw new IllegalArgumentException("Quantità non disponibile");
    }


    public Prodotto isAvailable(String nome){
        for(Prodotto p: marketplace.getListaProdotti()){
            if(p.getNome().equals(nome))
                return p;
        }
        throw new NoSuchElementException("Prodotto non trovato");
    }

    public Prodotto getProductById(int id){
        for(Prodotto p: marketplace.getListaProdotti()){
            if(p.getId() == id)
                return p;
        }
        throw new NoSuchElementException("Prodotto non trovato");
    }


}
