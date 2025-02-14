package unicam.filieraAgricola_ids.api.handler;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

public class HandlerProdotto extends HandlerMarketplace implements IHandlerGestione<Prodotto> {

    public HandlerProdotto() {
        super();
    }

    @Override
    public boolean requestAdd(Prodotto prodotto) {
        return getGestore().addObject(prodotto);
    }

    @Override
    public boolean requestRemove(int id) {
       return getGestore().removeObject(id);
    }

    public boolean requestModifyProduct(int idProdotto, String nome, double prezzo, String descrizione) {
        return getGestore().modifyProduct(idProdotto, nome, prezzo, descrizione);
    }

    public boolean requestReloadProduct(int idProdotto, int quantita) {
        return getGestore().reloadQuantity(idProdotto, quantita);
    }

}