package unicam.filieraAgricola_ids.api.handler;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import unicam.filieraAgricola_ids.api.prodotti.ProdottoSingolo;


public class HandlerValidazione extends HandlerMarketplace {
    public HandlerValidazione() {
        super();
    }

    public boolean requestValidation(int idProdotto) {
        return getGestore().validateRequest(idProdotto);
    }

    public boolean requestRemoval(int idProdotto) {
        ProdottoSingolo prodotto = (ProdottoSingolo) getGestore().getProductById(idProdotto);
        if(!prodotto.isValidato())
            return getGestore().removeProduct(prodotto.getId());
        else return false;
    }
}
