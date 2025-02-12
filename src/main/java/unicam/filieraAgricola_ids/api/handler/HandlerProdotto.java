package unicam.filieraAgricola_ids.api.handler;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

public class HandlerProdotto extends HandlerMarketplace implements IHandlerGestione<Prodotto> {

    public HandlerProdotto() {
        super();
    }

    @Override
    public boolean requestAdd(Prodotto prodotto) {
        return getGestore().addProduct(prodotto);
    }
    @Override
    public boolean requestRemove(int id) {
       return getGestore().removeProduct(id);
    }

    public boolean requestModifyProduct(Prodotto prodotto, String nome, int prezzo, String descrizione) {
        return getGestore().modifyProduct(prodotto, nome, prezzo, descrizione);
    }

    public boolean requestReloadProduct(Prodotto prodotto, int quantita) {
        return getGestore().reloadQuantity(prodotto, quantita);
    }


}