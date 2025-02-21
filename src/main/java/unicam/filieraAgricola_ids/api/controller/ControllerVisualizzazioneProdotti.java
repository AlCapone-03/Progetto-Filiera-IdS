package unicam.filieraAgricola_ids.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import unicam.filieraAgricola_ids.api.dto.ProdottoDto;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import unicam.filieraAgricola_ids.api.service.ServiceProdotto;

import java.util.List;

@RestController
public class ControllerVisualizzazioneProdotti {

    private final ServiceProdotto serviceProdotto;

    @Autowired
    public ControllerVisualizzazioneProdotti(ServiceProdotto serviceProdotto) {
        this.serviceProdotto = serviceProdotto;
    }

   @GetMapping("/Prodotti")
    public ResponseEntity<List<ProdottoDto>> showList() {
        return serviceProdotto.showList();
    }

}