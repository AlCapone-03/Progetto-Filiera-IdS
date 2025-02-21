package unicam.filieraAgricola_ids.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.dto.ProdottoConverter;
import unicam.filieraAgricola_ids.api.dto.ProdottoDto;
import unicam.filieraAgricola_ids.api.prodotti.Marketplace;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import java.util.List;

@Service
public class ServiceAcquisto {

    private final Marketplace marketplace;

    @Autowired
    public ServiceAcquisto(Marketplace marketplace) {
        this.marketplace = marketplace;
    }

    public ResponseEntity<Object> subtractProductQuantity(int id, int quantita) {
        if(!marketplace.getRepository().existsById(id)){
            return new ResponseEntity<>("Product Not Found", HttpStatus.BAD_REQUEST);
        }
        Prodotto prodotto = marketplace.getRepository().findById(id).get();
        if(prodotto.getQuantita() < quantita){
            return new ResponseEntity<>("Quantita non disponibile", HttpStatus.BAD_REQUEST);
        }
        prodotto.setQuantita(prodotto.getQuantita()-quantita);
        marketplace.getRepository().save(prodotto);
        return new ResponseEntity<>("Prodotto acquistato", HttpStatus.OK);
    }

    public ResponseEntity<List<ProdottoDto>> isAvailable(String nome){
        List<Prodotto> prodotti = marketplace.getRepository().findByNome(nome);
        prodotti.removeIf(p -> !p.isValidato());
        List<ProdottoDto> prod = ProdottoConverter.ProdottiToDtoList(prodotti);
        return new ResponseEntity<>(prod, HttpStatus.OK);
    }

}