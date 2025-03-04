package unicam.filieraAgricola_ids.api.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.Prodotti.Marketplace;
import unicam.filieraAgricola_ids.api.Prodotti.Pacchetto;
import unicam.filieraAgricola_ids.api.Prodotti.Prodotto;

import java.util.NoSuchElementException;

@Service
public class ServiceValidazione {

    private final Marketplace marketplace;

    @Autowired
    public ServiceValidazione(Marketplace marketplace) {
        this.marketplace = marketplace;
    }

    public ResponseEntity<String> validateRequest(int id) {
        if(!marketplace.getRepository().existsById(id)){
            return new ResponseEntity<>("Product Not Found", HttpStatus.BAD_REQUEST);
        }
        Prodotto prodotto = marketplace.getRepository().findById(id).
                orElseThrow(() -> new NoSuchElementException("Prodotto non trovato"));
        prodotto.setValidato(true);
        if(prodotto instanceof Pacchetto){
            for(Prodotto p: ((Pacchetto) prodotto).getProdottiPacchetto()){
                p.setValidato(true);
            }
        }
        marketplace.getRepository().save(prodotto);
        return new ResponseEntity<>("Prodotto validato", HttpStatus.OK);
    }

}