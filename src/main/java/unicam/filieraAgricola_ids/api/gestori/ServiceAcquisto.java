package unicam.filieraAgricola_ids.api.gestori;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.prodotti.Marketplace;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import java.util.List;


@Service
public class ServiceAcquisto {

    private Marketplace marketplace;

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

    // todo fa vedere tutti i prodotti validati e disponibili
    public ResponseEntity<List<Prodotto>> isAvailable(String nome){
        List<Prodotto> prodotti = marketplace.getRepository().findByNome(nome);
        prodotti.removeIf(p -> !p.isValidato());
        return new ResponseEntity<>(prodotti, HttpStatus.OK);
    }

//    public Prodotto getProductById(int id){
//        for(Prodotto p: marketplace.getRepository()){
//            if(p.getId() == id)
//                return p;
//        }
//        throw new NoSuchElementException("Prodotto non trovato");
//}

}