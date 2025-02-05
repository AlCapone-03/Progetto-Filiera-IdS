package unicam.filieraAgricola_ids.api.handler;


import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

public class HandlerAcquisto extends HandlerMarketplace {

    public HandlerAcquisto() {
        super();
    }

    public boolean requestBuy(Prodotto prodotto, int quantita) {
       return getGM().subtractProductQuantity(prodotto, quantita);
    }

}
