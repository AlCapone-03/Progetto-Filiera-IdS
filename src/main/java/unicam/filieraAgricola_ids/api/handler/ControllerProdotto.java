package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.gestori.GestoreMarketplace;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

// andrebbe anche cambiato quello che passo ai venditori per passare l'interfaccia
public class ControllerProdotto extends ControllerMarketplace implements IControllerGestione<Prodotto> {

    public ControllerProdotto(GestoreMarketplace gestoreMarketplace) {
        super(gestoreMarketplace);
    }
    //modificato anche sul metodo del venditore il nome del metodo
    @Override
    public boolean requestAdd(Prodotto prodotto) {
        if(gestoreMarketplace.addProduct(prodotto))
            return true;
        return false;
    }
}