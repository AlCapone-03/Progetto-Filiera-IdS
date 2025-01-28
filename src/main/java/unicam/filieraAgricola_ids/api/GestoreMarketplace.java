package unicam.filieraAgricola_ids.api;

public class GestoreMarketplace {

    private Marketplace marketplace;

    public GestoreMarketplace(Marketplace marketplace) {
        this.marketplace = marketplace;
    }

    public Marketplace getMarketplace() {
        return marketplace;
    }

    public boolean addProduct(Prodotto prodotto) {
        return marketplace.getListaProdotti().add(prodotto);
    }
    public boolean removeProduct(Prodotto prodotto) {
        return marketplace.getListaProdotti().remove(prodotto);
    }

}
