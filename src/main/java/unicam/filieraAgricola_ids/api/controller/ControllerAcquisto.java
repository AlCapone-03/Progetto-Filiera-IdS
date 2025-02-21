package unicam.filieraAgricola_ids.api.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unicam.filieraAgricola_ids.api.dto.ProdottoDto;
import unicam.filieraAgricola_ids.api.service.ServiceAcquisto;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import java.util.List;

@RestController
public class ControllerAcquisto {

    private final ServiceAcquisto serviceAcquisto;

    @Autowired
    public ControllerAcquisto(ServiceAcquisto serviceAcquisto) {
        this.serviceAcquisto = serviceAcquisto;
    }

    @RequestMapping("/buyProduct")
    public ResponseEntity<Object> requestBuy(@PathParam("id") int id,
                                             @PathParam("quantita") int quantita) {
        return serviceAcquisto.subtractProductQuantity(id, quantita);
    }

    @GetMapping("/isAvailable")
    public ResponseEntity<List<ProdottoDto>> requestDisponibility
            (@PathParam("nome") String nome) {
        return serviceAcquisto.isAvailable(nome);
    }

}