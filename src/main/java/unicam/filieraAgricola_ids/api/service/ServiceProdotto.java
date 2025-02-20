package unicam.filieraAgricola_ids.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.prodotti.Marketplace;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import java.util.List;

@Service
public class ServiceProdotto {

    private final Marketplace marketplace;

    @Autowired
    public ServiceProdotto(Marketplace marketplace) {
        this.marketplace = marketplace;
    }

    public ResponseEntity<Object> addObject(Prodotto prodotto) {
        List<Prodotto> prodotti = marketplace.getRepository().findByNome(prodotto.getNome());
        List<Prodotto> prodotti1 = marketplace.getRepository().findByDescrizione(prodotto.getDescrizione());
        if(prodotti.isEmpty() || prodotti1.isEmpty()){
            marketplace.getRepository().save(prodotto);
            return new ResponseEntity<>("Prodotto creato",HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Product Already Exists", HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Object> removeObject(int id) {
        if(!marketplace.getRepository().existsById(id)){
            return new ResponseEntity<>("Product Not Found", HttpStatus.BAD_REQUEST);
        }
        marketplace.getRepository().deleteById(id);
        return new ResponseEntity<>("Product "+id+" Deleted", HttpStatus.OK);
    }

//    public ResponseEntity<Object> addPacchetto(Pacchetto pacchetto) {
//        if (marketplace.getRepository().existsById(pacchetto.getId())) {
//            return new ResponseEntity<>("Product Already Exists", HttpStatus.BAD_REQUEST);
//        }else {
//            marketplace.getRepository().save(pacchetto);
//            return new ResponseEntity<>("Product Created", HttpStatus.CREATED);
//        }
//
//    }

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

}