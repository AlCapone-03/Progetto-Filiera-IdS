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
public class ServiceProdotto {

    private final Marketplace marketplace;
    private final ServiceUtenti serviceUtenti;

    @Autowired
    public ServiceProdotto(Marketplace marketplace, ServiceUtenti serviceUtenti) {
        this.marketplace = marketplace;
        this.serviceUtenti = serviceUtenti;
    }

    public ResponseEntity<String> addProduct(Prodotto prodotto) {
        if (serviceUtenti.getRepository().existsById(prodotto.getIdProduttore())) {
            List<Prodotto> prodotti = marketplace.getRepository().findByNomeAndDescrizioneAndPrezzo(prodotto.getNome(),
                    prodotto.getDescrizione(),prodotto.getPrezzo());
            if (prodotti.isEmpty()) {
                marketplace.getRepository().save(prodotto);
                return new ResponseEntity<>("Prodotto creato", HttpStatus.CREATED);
            }
            return new ResponseEntity<>("Il Prodotto esiste già", HttpStatus.BAD_REQUEST);
        } else {
            return new ResponseEntity<>("Il Produttore non esiste", HttpStatus.BAD_REQUEST);
        }
    }

    public ResponseEntity<String> removeProduct(int id) {
        ResponseEntity<String> BAD_REQUEST = getStringResponseEntity(id);
        if (BAD_REQUEST != null) return BAD_REQUEST;
        marketplace.getRepository().deleteById(id);
        return new ResponseEntity<>("Product "+id+" Deleted", HttpStatus.OK);
    }

    public ResponseEntity<String> modifyProduct(int id, String nome, double prezzo, String descrizione) {
        ResponseEntity<String> BAD_REQUEST = getStringResponseEntity(id);
        if (BAD_REQUEST != null) return BAD_REQUEST;
        Prodotto prodotto = marketplace.getRepository().findById(id).
                orElseThrow(() -> new NoSuchElementException("Product Not Found"));
        prodotto.setNome(nome);
        prodotto.setPrezzo(prezzo);
        prodotto.setDescrizione(descrizione);
        marketplace.getRepository().save(prodotto);
        return new ResponseEntity<>("Prodotto modificato", HttpStatus.OK);
    }

    public ResponseEntity<String> reloadQuantity(int id, int quantita) {
        ResponseEntity<String> BAD_REQUEST = getStringResponseEntity(id);
        if (BAD_REQUEST != null) return BAD_REQUEST;
        Prodotto prodotto = marketplace.getRepository().findById(id).
                orElseThrow(() -> new NoSuchElementException("Product Not Found"));
        prodotto.setQuantita(prodotto.getQuantita()+quantita);
        marketplace.getRepository().save(prodotto);
        return new ResponseEntity<>("Prodotto ricaricato", HttpStatus.OK);
    }

    private ResponseEntity<String> getStringResponseEntity(int id) {
        if(!marketplace.getRepository().existsById(id)){
            return new ResponseEntity<>("Product Not Found", HttpStatus.BAD_REQUEST);
        }
        return null;
    }

    public ResponseEntity<List<ProdottoDto>> showList(){
        List<Prodotto> prodotti = marketplace.getRepository().findAll();
        if(prodotti.isEmpty())
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        prodotti.removeIf(p -> !p.isValidato());
        List<Prodotto> elimina = marketplace.getRepository().findProdottiSingoliInPacchetti();
        prodotti.removeAll(elimina);
        List<ProdottoDto> prodottiDtos = ProdottoConverter.ProdottiToDtoList(prodotti);
        return new ResponseEntity<>(prodottiDtos, HttpStatus.OK);
    }

}