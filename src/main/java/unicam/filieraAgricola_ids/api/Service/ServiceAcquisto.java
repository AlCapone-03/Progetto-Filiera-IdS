package unicam.filieraAgricola_ids.api.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.Dto.ProdottoConverter;
import unicam.filieraAgricola_ids.api.Dto.ProdottoDto;
import unicam.filieraAgricola_ids.api.Prodotti.Marketplace;
import unicam.filieraAgricola_ids.api.Prodotti.Prodotto;
import java.util.List;
import java.util.NoSuchElementException;

@Service
public class ServiceAcquisto {

    private final Marketplace marketplace;

    @Autowired
    public ServiceAcquisto(Marketplace marketplace) {
        this.marketplace = marketplace;
    }

    public ResponseEntity<String> subtractProductQuantity(int id, int quantita) {
        ResponseEntity<String> BAD_REQUEST = getObjectResponseEntity(id, quantita);
        if (BAD_REQUEST != null) return BAD_REQUEST;
        Prodotto prodotto = marketplace.getRepository().findById(id).
                orElseThrow(() -> new NoSuchElementException("Prodotto non trovato"));
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

    private ResponseEntity<String> getObjectResponseEntity(int id, int quantita) {
        if(!marketplace.getRepository().existsById(id)){
            return new ResponseEntity<>("Product Not Found", HttpStatus.BAD_REQUEST);
        }
        Prodotto prodotto = marketplace.getRepository().findById(id).
                orElseThrow(() -> new NoSuchElementException("Prodotto non trovato"));
        if(prodotto.getQuantita() < quantita || !prodotto.isValidato()){
            return new ResponseEntity<>("Errore nella richiesta del prodotto", HttpStatus.BAD_REQUEST);
        }
        return findSingleProductsInPackage(id);
    }

    private ResponseEntity<String> findSingleProductsInPackage(int id) {
        List<Prodotto> prodotti = marketplace.getRepository().findProdottiSingoliInPacchetti();
        for (Prodotto p : prodotti) {
            if (p.getId() == id) {
                return new ResponseEntity<>("Prodotto non acquistabile", HttpStatus.BAD_REQUEST);
            }
        }
        return null;
    }
}