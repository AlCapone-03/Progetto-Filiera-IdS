package unicam.filieraAgricola_ids.api.gestori;


import unicam.filieraAgricola_ids.api.prodotti.Marketplace;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

//La classe è un Singleton
public class GestoreMarketplace {

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
        for(Prodotto p : marketplace.getListaProdotti())
            if(p.equals(prodotto))
                throw new IllegalArgumentException("Prodotto già presente");
        return marketplace.getListaProdotti().add(prodotto);
    }

    public boolean removeProduct(Prodotto prodotto) {

        int index = prodotto.getId();

        if(marketplace.getListaProdotti().isEmpty())
            throw new IllegalArgumentException("Lista prodotti vuota");

        for (Prodotto p : marketplace.getListaProdotti()) {
            if (p.getId() == index) {
                marketplace.getListaProdotti().remove(p);
                return true;
            }
        }
        throw new IllegalArgumentException("Prodotto non trovato");
    }

}
