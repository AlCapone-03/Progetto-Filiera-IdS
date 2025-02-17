package unicam.filieraAgricola_ids.api.gestori;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.prodotti.Marketplace;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import unicam.filieraAgricola_ids.api.prodotti.ProdottoSingolo;

import java.util.NoSuchElementException;

@Service
public class ServiceProdotto {


    private Marketplace marketplace;

    @Autowired
    public ServiceProdotto(Marketplace marketplace) {
        this.marketplace = marketplace;
    }



    public boolean addObject(Prodotto prodotto) {
        for (Prodotto p : marketplace.getListaProdotti())
            if (p.equals(prodotto))
                throw new IllegalArgumentException("Prodotto già presente");
        return marketplace.getListaProdotti().add(prodotto);
    }


    public boolean removeObject(int index) {
        if (marketplace.getListaProdotti().isEmpty())
            throw new IllegalArgumentException("Lista prodotti vuota");

        Prodotto p = getProductById(index);
        if (p != null) {
            marketplace.getListaProdotti().remove(p);
            return true;
        } else
            throw new IllegalArgumentException("Prodotto non trovato");

    }


    public boolean modifyProduct(int idProdotto, String nome, double prezzo, String descrizione) {
        if (marketplace.getListaProdotti().isEmpty())
            throw new NullPointerException("Lista prodotti vuota");

        ProdottoSingolo ps = (ProdottoSingolo) getProductById(idProdotto);
        if (ps != null) {
            ps.setNome(nome);
            ps.setPrezzo(prezzo);
            ps.setDescrizione(descrizione);
            return true;
        } else
            throw new NoSuchElementException("Prodotto non trovato");
    }

    public boolean reloadQuantity(int idProdotto, int quantita) {
        if (marketplace.getListaProdotti().isEmpty())
            throw new NullPointerException("Lista prodotti vuota");

        Prodotto p = getProductById(idProdotto);
        if (p != null) {
            p.setQuantita(p.getQuantita() + quantita);
            return true;
        } else
            throw new NoSuchElementException("Prodotto non trovato");
    }


    public Prodotto getProductById(int id) {
        for (Prodotto p : marketplace.getListaProdotti()) {
            if (p.getId() == id)
                return p;
        }
        throw new NoSuchElementException("Prodotto non trovato");
    }


}
