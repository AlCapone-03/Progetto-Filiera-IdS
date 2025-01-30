package unicam.filieraAgricola_ids.api.prodotti;

public class GestoreMarketplace {

    private final Marketplace marketplace;

    public GestoreMarketplace(Marketplace marketplace) {
        this.marketplace = marketplace;
    }

    public Marketplace getMarketplace() {
        return marketplace;
    }

    public boolean addProduct(Prodotto prodotto) {
        if(marketplace.getListaProdotti().add(prodotto))
            return true;
        return false;
    }

    public boolean removeProduct(Prodotto prodotto) {
        return marketplace.getListaProdotti().remove(prodotto);
    }

}
