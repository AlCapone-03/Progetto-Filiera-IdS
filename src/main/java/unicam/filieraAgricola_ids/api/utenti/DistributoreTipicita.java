package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.handler.ControllerProdotto;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

import java.util.List;

public class DistributoreTipicita extends Venditore {

    public DistributoreTipicita(String nome, int p_IVA, ControllerProdotto controllerProdotto) {
        super(nome, p_IVA, controllerProdotto);
    }

}
