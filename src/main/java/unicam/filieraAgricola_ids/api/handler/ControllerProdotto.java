package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.prodotti.GestoreMarketplace;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

public class ControllerProdotto {

    private GestoreMarketplace gestoreMarketplace;

    public ControllerProdotto(GestoreMarketplace gestoreMarketplace) {
        this.gestoreMarketplace = gestoreMarketplace;
    }

    public boolean requestAddProduct(Prodotto prodotto) {
        if(gestoreMarketplace.addProduct(prodotto))
            return true;
        return false;
    }
}

