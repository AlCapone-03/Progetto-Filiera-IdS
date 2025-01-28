package unicam.filieraAgricola_ids.api;

public class ControllerProdotto {
    private GestoreMarketplace gestoreMarketplace;

    public ControllerProdotto(GestoreMarketplace gestoreMarketplace) {
        this.gestoreMarketplace = gestoreMarketplace;
    }

    public boolean requestAddProduct(Prodotto prodotto) {
        return gestoreMarketplace.addProduct(prodotto);
    }
}
