package unicam.filieraAgricola_ids.api.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unicam.filieraAgricola_ids.api.dto.PacchettoDto;
import unicam.filieraAgricola_ids.api.dto.ProdottoConverter;
import unicam.filieraAgricola_ids.api.dto.ProdottoSingoloDto;
import unicam.filieraAgricola_ids.api.service.ServiceProdotto;
import unicam.filieraAgricola_ids.api.prodotti.Pacchetto;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;


@RestController
public class ControllerProdotto {

    private ServiceProdotto serviceProdotto;

    @Autowired
    public ControllerProdotto(ServiceProdotto serviceProdotto) {
        this.serviceProdotto = serviceProdotto;
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Object> requestAdd(@RequestBody ProdottoSingoloDto prodotto) {
        Prodotto p = ProdottoConverter.DtoToProdotto(prodotto);
        return serviceProdotto.addObject(p);
    }

    @DeleteMapping(value = "/deleteProduct")
    public ResponseEntity<Object> requestRemove(@PathParam("id") int id) {
        return serviceProdotto.removeObject(id);
    }

    @PostMapping("/addPackage")
    public ResponseEntity<Object> requestAddPackage(@RequestBody PacchettoDto prodotto) {
        System.out.println(prodotto);
        Pacchetto pacchetto = ProdottoConverter.DtoToPacchetto(prodotto);
        return serviceProdotto.addObject(pacchetto);
    }

    @RequestMapping(value="/update", method=RequestMethod.PUT)
    public ResponseEntity<Object> requestModifyProduct(@PathParam("id") int id, @PathParam("nome") String nome,
                                                       @PathParam("prezzo") double prezzo,
                                                       @PathParam("descrizione") String descrizione) {
        return serviceProdotto.modifyProduct(id, nome, prezzo, descrizione);
    }

    @RequestMapping(value="/reload", method=RequestMethod.PUT)
    public ResponseEntity<Object> requestReloadProduct(@PathParam("id") int id,
                                                       @PathParam("quantita") int quantita) {
        return serviceProdotto.reloadQuantity(id, quantita);
    }

}