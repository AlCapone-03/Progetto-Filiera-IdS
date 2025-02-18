package unicam.filieraAgricola_ids.api.handler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;
import unicam.filieraAgricola_ids.api.gestori.ServiceAcquisto;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import unicam.filieraAgricola_ids.api.utenti.Acquirente;

@RestController
public class HandlerAcquisto{

    private ServiceAcquisto serviceAcquisto;

    @Autowired
    public HandlerAcquisto(ServiceAcquisto serviceAcquisto) {
        this.serviceAcquisto = serviceAcquisto;
    }

//    public Prodotto requestBuy(int idProdotto, int quantita) {
//       return serviceAcquisto.subtractProductQuantity(idProdotto, quantita);
//    }
//
//    public boolean buyProduct(int idProdotto, int quantita, Acquirente acquirente) {
//        serviceAcquisto.subtractProductQuantity(idProdotto, quantita);
//        acquirente.getProdottiAcquistati().add(serviceAcquisto.getProductById(idProdotto));
//        return true;
//    }
}
