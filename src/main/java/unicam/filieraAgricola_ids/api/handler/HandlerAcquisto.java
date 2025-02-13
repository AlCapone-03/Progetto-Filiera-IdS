package unicam.filieraAgricola_ids.api.handler;


public class HandlerAcquisto extends HandlerMarketplace {

    public HandlerAcquisto() {
        super();
    }

    public boolean requestBuy(int idProdotto, int quantita) {
       return getGestore().subtractProductQuantity(idProdotto, quantita);
    }

}
