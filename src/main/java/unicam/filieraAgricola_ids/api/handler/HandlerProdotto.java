package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

// andrebbe anche cambiato quello che passo ai venditori per passare l'interfaccia
public class HandlerProdotto extends HandlerMarketplace implements IHandlerGestione<Prodotto> {

    public HandlerProdotto() {
        super();
    }
    //modificato anche sul metodo del venditore il nome del metodo
    @Override
    public boolean requestAdd(Prodotto prodotto) {
        if(getGM().addProduct(prodotto))
            return true;
        return false;
    }
    @Override
    public boolean requestRemove(int id) {
       return getGM().removeProduct(id);
    }
}