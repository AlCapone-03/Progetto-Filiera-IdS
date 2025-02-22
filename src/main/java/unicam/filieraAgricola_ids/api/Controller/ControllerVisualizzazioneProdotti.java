package unicam.filieraAgricola_ids.api.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import unicam.filieraAgricola_ids.api.Dto.ProdottoDto;
import unicam.filieraAgricola_ids.api.Service.ServiceProdotto;

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