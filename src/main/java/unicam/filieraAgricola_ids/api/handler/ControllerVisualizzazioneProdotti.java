package unicam.filieraAgricola_ids.api.handler;

import unicam.filieraAgricola_ids.api.gestori.GestoreMarketplace;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

import java.util.List;

public class ControllerVisualizzazioneProdotti extends ControllerMarketplace implements
                                                IControllerVisualizzazione<Prodotto> {
    public ControllerVisualizzazioneProdotti(GestoreMarketplace gestoreMarketplace) {
        super(gestoreMarketplace);
    }

    @Override
    public List<Prodotto> showList() {
        return null;
    }
}
