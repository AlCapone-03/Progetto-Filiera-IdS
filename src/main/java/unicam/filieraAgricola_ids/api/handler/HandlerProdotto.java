package unicam.filieraAgricola_ids.api.handler;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import unicam.filieraAgricola_ids.api.dto.PacchettoDto;
import unicam.filieraAgricola_ids.api.dto.ProdottoConverter;
import unicam.filieraAgricola_ids.api.dto.ProdottoSingoloDto;
import unicam.filieraAgricola_ids.api.gestori.ServiceProdotto;
import unicam.filieraAgricola_ids.api.prodotti.Pacchetto;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;


@RestController
public class HandlerProdotto {

    private ServiceProdotto serviceProdotto;

    @Autowired
    public HandlerProdotto(ServiceProdotto serviceProdotto) {
        this.serviceProdotto = serviceProdotto;
    }

    @PostMapping("/addProduct")
    public ResponseEntity<Object> requestAdd(@RequestBody ProdottoSingoloDto prodotto) {
        Prodotto p = ProdottoConverter.DtoToProdotto(prodotto);
        return serviceProdotto.addObject(p);
    }

    @DeleteMapping("/deleteProduct/{id}")
    public ResponseEntity<Object> requestRemove(@PathVariable("id") String id) {
        Integer idProdotto = Integer.parseInt(id);
        return serviceProdotto.removeObject(idProdotto);
    }

    @PostMapping("/addPackage")
    public ResponseEntity<Object> requestAddPackage(@RequestBody PacchettoDto prodotto) {
        System.out.println(prodotto);
        Pacchetto pacchetto = ProdottoConverter.DtoToPacchetto(prodotto);
        return serviceProdotto.addObject(pacchetto);
    }


    //todo va modificato come farlo
//    @RequestMapping(value="/update", method=RequestMethod.PUT)
//    public boolean requestModifyProduct(@PathParam("id") String id, @RequestBody ProdottoDto product) {
//        return serviceProdotto.modifyProduct(idProdotto, nome, prezzo, descrizione);
//    }

//    public boolean requestReloadProduct(int idProdotto, int quantita) {
//        return serviceProdotto.reloadQuantity(idProdotto, quantita);
//}

}