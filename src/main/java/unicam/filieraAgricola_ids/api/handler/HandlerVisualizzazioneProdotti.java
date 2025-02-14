package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

import java.util.List;

public class HandlerVisualizzazioneProdotti extends HandlerMarketplace implements
        IHandlerVisualizzazione<Prodotto> {

    public HandlerVisualizzazioneProdotti() {
        super();
    }

    @Override
    public List<Prodotto> showList() {
        return getGestore().getMarketplace().getListaProdotti();
    }

    public Prodotto requestDisponibility(String nome){
        return getGestore().isAvailable(nome);
    }
}
