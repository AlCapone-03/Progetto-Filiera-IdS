package unicam.filieraAgricola_ids.api.gestori;


import unicam.filieraAgricola_ids.api.prodotti.Marketplace;
import unicam.filieraAgricola_ids.api.prodotti.Pacchetto;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import unicam.filieraAgricola_ids.api.prodotti.ProdottoSingolo;

import java.util.NoSuchElementException;

//La classe è un Singleton
public class GestoreMarketplace implements IGestore{

    private static GestoreMarketplace gestoreMarketplace;

    private final Marketplace marketplace;

    private GestoreMarketplace() {
        this.marketplace = Marketplace.getInstance();
    }

    public static GestoreMarketplace getInstance() {
        if (gestoreMarketplace == null) {
            gestoreMarketplace = new GestoreMarketplace();
        }
        return gestoreMarketplace;
    }

    public Marketplace getMarketplace() {
        return marketplace;
    }

    public boolean addProduct(Prodotto prodotto) {
        for (Prodotto p : marketplace.getListaProdotti())
            if (p.equals(prodotto))
                throw new IllegalArgumentException("Prodotto già presente");
        return marketplace.getListaProdotti().add(prodotto);
    }

    public boolean removeProduct(int index) {

        if (marketplace.getListaProdotti().isEmpty())
            throw new IllegalArgumentException("Lista prodotti vuota");

        for (Prodotto p : marketplace.getListaProdotti()) {
            if (p.getId() == index) {
                marketplace.getListaProdotti().remove(p);
                return true;
            }
        }
        throw new IllegalArgumentException("Prodotto non trovato");
    }

    public boolean validateRequest(Prodotto prodotto) {
        if(prodotto==null)
            throw new NullPointerException("Prodotto nullo");
        else if (prodotto instanceof ProdottoSingolo) {
            for (Prodotto p : marketplace.getListaProdotti()) {
                if (p.equals(prodotto)) {
                    ProdottoSingolo ps = (ProdottoSingolo) p;
                    ps.setValidato(true);
                    return true;
                }
            }
        }
        return false;
    }

    public boolean subtractProductQuantity(Prodotto prodotto, int quantita) {
        if(prodotto==null)
            throw new NullPointerException("Prodotto nullo");
        else if (prodotto instanceof ProdottoSingolo) {
            for (Prodotto p : marketplace.getListaProdotti()) {
                if (p.equals(prodotto)) {
                    ProdottoSingolo ps = (ProdottoSingolo) p;
                    if(ps.getQuantita()>=quantita) {
                        ps.setQuantita(ps.getQuantita()-quantita);
                        return true;
                    }
                }
            }
        }
        return false;
    }


    public boolean modifyProduct(Prodotto prodotto, String nome, int prezzo, String descrizione) {
        if (marketplace.getListaProdotti().isEmpty())
            throw new NullPointerException("Lista prodotti vuota");

        for (Prodotto p : marketplace.getListaProdotti()) {
            if (p.equals(prodotto)) {
                ProdottoSingolo ps = (ProdottoSingolo) p;
                ps.setNome(nome);
                ps.setPrezzo(prezzo);
                ps.setDescrizione(descrizione);
                return true;
            }
        }
        throw new NoSuchElementException("Prodotto non trovato");
    }


    public boolean reloadQuantity(Prodotto prodotto, int quantita) {
        if (marketplace.getListaProdotti().isEmpty())
            throw new NullPointerException("Lista prodotti vuota");

        for (Prodotto p : marketplace.getListaProdotti()) {
            if (p.equals(prodotto)) {
                p.setQuantita(p.getQuantita() + quantita);
                return true;
            }
        }
        throw new NoSuchElementException("Prodotto non trovato");
    }

    public Prodotto isAvailable(String nome){
        for(Prodotto p: marketplace.getListaProdotti()){
            if(p.getNome().equals(nome))
                return p;
        }
        throw new NoSuchElementException("Prodotto non trovato");
    }
}