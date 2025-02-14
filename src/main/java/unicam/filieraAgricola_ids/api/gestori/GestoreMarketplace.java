package unicam.filieraAgricola_ids.api.gestori;

import unicam.filieraAgricola_ids.api.prodotti.Marketplace;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import unicam.filieraAgricola_ids.api.prodotti.ProdottoSingolo;
import java.util.NoSuchElementException;

//La classe è un Singleton
public class GestoreMarketplace implements IGestore<Prodotto>{

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

    @Override
    public boolean addObject(Prodotto prodotto) {
        for (Prodotto p : marketplace.getListaProdotti())
            if (p.equals(prodotto))
                throw new IllegalArgumentException("Prodotto già presente");
        return marketplace.getListaProdotti().add(prodotto);
    }

    @Override
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

    public boolean validateRequest(int idProdotto) {
        Prodotto p = getProductById(idProdotto);
        if (p instanceof ProdottoSingolo) {
            ProdottoSingolo ps = (ProdottoSingolo) p;
            ps.setValidato(true);
            return true;
        }
        return false;
    }

    public boolean subtractProductQuantity(int idProdotto, int quantita) {
        Prodotto p = getProductById(idProdotto);
        if (p.getQuantita() >= quantita) {
            p.setQuantita(p.getQuantita() - quantita);
            return true;

        } else throw new IllegalArgumentException("Quantità non disponibile");
    }

    public boolean modifyProduct(int idProdotto, String nome, int prezzo, String descrizione) {
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