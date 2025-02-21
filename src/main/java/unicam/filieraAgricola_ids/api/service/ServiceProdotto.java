package unicam.filieraAgricola_ids.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.dto.ProdottoConverter;
import unicam.filieraAgricola_ids.api.dto.ProdottoDto;
import unicam.filieraAgricola_ids.api.prodotti.Marketplace;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import unicam.filieraAgricola_ids.api.prodotti.ProdottoSingolo;

import java.util.List;

@Service
public class ServiceProdotto {

    private final Marketplace marketplace;

    @Autowired
    public ServiceProdotto(Marketplace marketplace) {
        this.marketplace = marketplace;
    }

    public ResponseEntity<Object> addProduct(Prodotto prodotto) {
        List<Prodotto> prodotti = marketplace.getRepository().findByNome(prodotto.getNome());
        List<Prodotto> prodotti1 = marketplace.getRepository().findByDescrizione(prodotto.getDescrizione());
        if(prodotti.isEmpty() || prodotti1.isEmpty()){
            marketplace.getRepository().save(prodotto);
            return new ResponseEntity<>("Prodotto creato",HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Product Already Exists", HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Object> removeProduct(int id) {
        if(!marketplace.getRepository().existsById(id)){
            return new ResponseEntity<>("Product Not Found", HttpStatus.BAD_REQUEST);
        }
        marketplace.getRepository().deleteById(id);
        return new ResponseEntity<>("Product "+id+" Deleted", HttpStatus.OK);
    }

    public ResponseEntity<Object> modifyProduct(int id, String nome, double prezzo, String descrizione) {
        if(!marketplace.getRepository().existsById(id)){
            return new ResponseEntity<>("Product Not Found", HttpStatus.BAD_REQUEST);
        }
        Prodotto prodotto = marketplace.getRepository().findById(id).get();
        prodotto.setNome(nome);
        prodotto.setPrezzo(prezzo);
        prodotto.setDescrizione(descrizione);
        marketplace.getRepository().save(prodotto);
        return new ResponseEntity<>("Prodotto modificato", HttpStatus.OK);
    }

    public ResponseEntity<Object> reloadQuantity(int id, int quantita) {
        if(!marketplace.getRepository().existsById(id)){
            return new ResponseEntity<>("Product Not Found", HttpStatus.BAD_REQUEST);
        }
        Prodotto prodotto = marketplace.getRepository().findById(id).get();
        prodotto.setQuantita(quantita);
        marketplace.getRepository().save(prodotto);
        return new ResponseEntity<>("Prodotto ricaricato", HttpStatus.OK);
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