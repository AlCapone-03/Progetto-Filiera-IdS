package unicam.filieraAgricola_ids.api.handler;


import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

public class HandlerAcquisto extends HandlerMarketplace {

    public HandlerAcquisto() {
        super();
    }

    public Prodotto requestBuy(int idProdotto, int quantita) {
       return getGestore().subtractProductQuantity(idProdotto, quantita);
    }

}
