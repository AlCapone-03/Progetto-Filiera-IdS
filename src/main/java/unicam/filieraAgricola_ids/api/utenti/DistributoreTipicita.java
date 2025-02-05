package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.handler.HandlerMarketplace;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

import java.util.List;

public class DistributoreTipicita extends Venditore {

    public DistributoreTipicita(int id, String nome, String email, String password, List<HandlerMarketplace> handler,
                                List<Prodotto> prodottiCaricati, int p_IVA) {
        super(id, nome, email, password, handler, prodottiCaricati, p_IVA);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
