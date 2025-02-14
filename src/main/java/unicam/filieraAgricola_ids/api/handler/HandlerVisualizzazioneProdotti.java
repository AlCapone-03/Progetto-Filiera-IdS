package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

import java.util.List;
import java.util.NoSuchElementException;

public class HandlerVisualizzazioneProdotti extends HandlerMarketplace implements
        IHandlerVisualizzazione<Prodotto> {

    public HandlerVisualizzazioneProdotti() {
        super();
    }

    @Override
    public List<Prodotto> showList() {
        if(getGestore().getMarketplace().getListaProdotti().isEmpty()){
            throw new NoSuchElementException("Non ci sono prodotti disponibili");
        }else return getGestore().getMarketplace().getListaProdotti();
    }

    public Prodotto requestDisponibility(String nome){
        return getGestore().isAvailable(nome);
    }
}
