package unicam.filieraAgricola_ids.api.Controller;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unicam.filieraAgricola_ids.api.Dto.PacchettoDto;
import unicam.filieraAgricola_ids.api.Dto.ProdottoConverter;
import unicam.filieraAgricola_ids.api.Dto.ProdottoSingoloDto;
import unicam.filieraAgricola_ids.api.Service.ServiceProdotto;
import unicam.filieraAgricola_ids.api.Prodotti.Pacchetto;
import unicam.filieraAgricola_ids.api.Prodotti.Prodotto;

@RestController
public class ControllerProdotto {

    private final ServiceProdotto serviceProdotto;

    @Autowired
    public ControllerProdotto(ServiceProdotto serviceProdotto) {
        this.serviceProdotto = serviceProdotto;
    }

    @PostMapping("/addProduct")
    public ResponseEntity<String> requestAdd(@RequestBody ProdottoSingoloDto prodotto) {
        Prodotto p = ProdottoConverter.DtoToProdotto(prodotto);
        return serviceProdotto.addProduct(p);
    }

    @DeleteMapping(value = "/deleteProduct")
    public ResponseEntity<String> requestRemove(@PathParam("id") int id) {
        return serviceProdotto.removeProduct(id);
    }

    @PostMapping("/addPackage")
    public ResponseEntity<String> requestAddPackage(@RequestBody PacchettoDto prodotto) {
        System.out.println(prodotto);
        Pacchetto pacchetto = ProdottoConverter.DtoToPacchetto(prodotto);
        return serviceProdotto.addProduct(pacchetto);
    }

    @RequestMapping(value="/update", method=RequestMethod.PUT)
    public ResponseEntity<String> requestModifyProduct(@PathParam("id") int id, @PathParam("nome") String nome,
                                                       @PathParam("prezzo") double prezzo,
                                                       @PathParam("descrizione") String descrizione) {
        return serviceProdotto.modifyProduct(id, nome, prezzo, descrizione);
    }

    @RequestMapping(value="/reload", method=RequestMethod.PUT)
    public ResponseEntity<String> requestReloadProduct(@PathParam("id") int id,
                                                       @PathParam("quantita") int quantita) {
        return serviceProdotto.reloadQuantity(id, quantita);
    }

}