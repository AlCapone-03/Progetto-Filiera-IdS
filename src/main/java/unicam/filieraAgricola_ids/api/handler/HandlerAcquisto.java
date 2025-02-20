package unicam.filieraAgricola_ids.api.handler;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unicam.filieraAgricola_ids.api.gestori.ServiceAcquisto;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import java.util.List;

@RestController
public class HandlerAcquisto{

    private ServiceAcquisto serviceAcquisto;

    @Autowired
    public HandlerAcquisto(ServiceAcquisto serviceAcquisto) {
        this.serviceAcquisto = serviceAcquisto;
    }

    @RequestMapping("/buyProduct")
    public ResponseEntity<Object> requestBuy(@PathParam("id") int id,
                                             @PathParam("quantita") int quantita) {
        return serviceAcquisto.subtractProductQuantity(id, quantita);
    }

//    public boolean buyProduct(int idProdotto, int quantita, Acquirente acquirente) {
//        serviceAcquisto.subtractProductQuantity(idProdotto, quantita);
//        acquirente.getProdottiAcquistati().add(serviceAcquisto.getProductById(idProdotto));
//        return true;
//    }

    @GetMapping("/isAvailable")
    public ResponseEntity<List<Prodotto>> requestDisponibility
            (@PathParam("nome") String nome) {
        return serviceAcquisto.isAvailable(nome);
    }
}