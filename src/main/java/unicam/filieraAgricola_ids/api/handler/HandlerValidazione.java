package unicam.filieraAgricola_ids.api.handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RestController;
import unicam.filieraAgricola_ids.api.gestori.ServiceValidazione;
import unicam.filieraAgricola_ids.api.prodotti.ProdottoSingolo;

@RestController
public class HandlerValidazione{

    private ServiceValidazione serviceValidazione;

    @Autowired
    public HandlerValidazione(ServiceValidazione serviceValidazione) {
        this.serviceValidazione = serviceValidazione;
    }


//    public boolean requestValidation(int idProdotto) {
//        return getGestore().validateRequest(idProdotto);
//    }
//
//    public boolean requestRemoval(int idProdotto) {
//        ProdottoSingolo prodotto = (ProdottoSingolo) getGestore().getProductById(idProdotto);
//        if(!prodotto.isValidato())
//            return getGestore().removeObject(prodotto.getId());
//        else return false;
//    }
}
