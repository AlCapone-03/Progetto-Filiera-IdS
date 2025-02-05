package unicam.filieraAgricola_ids.api.handler;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import unicam.filieraAgricola_ids.api.prodotti.ProdottoSingolo;


public class HandlerValidazione extends HandlerMarketplace {
    public HandlerValidazione() {
        super();
    }

    public boolean requestValidation(Prodotto prodotto) {
        return getGM().validateRequest(prodotto);
    }
    public boolean requestRemoval(Prodotto prodotto) {
        ProdottoSingolo ps = (ProdottoSingolo) prodotto;
        if(!ps.isValidato())
            return getGM().removeProduct(prodotto.getId());
        else return false;
    }
}
