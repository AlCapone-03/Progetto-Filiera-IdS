package unicam.filieraAgricola_ids.api.gestori;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.prodotti.Marketplace;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;
import unicam.filieraAgricola_ids.api.prodotti.ProdottoSingolo;
import unicam.filieraAgricola_ids.api.repository.ProdottoRepository;

import java.util.NoSuchElementException;

import static org.springframework.data.jpa.domain.AbstractPersistable_.id;

@Service
public class ServiceProdotto {

    private final Marketplace marketplace;

    @Autowired
    public ServiceProdotto(Marketplace marketplace) {
        this.marketplace = marketplace;
    }

    public ResponseEntity<Object> addObject(Prodotto prodotto) {
        if(!marketplace.getListaProdotti().existsById(prodotto.getId())){
            marketplace.getListaProdotti().save(prodotto);
            return new ResponseEntity<>("Prodotto creato",HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Product Already Exists", HttpStatus.BAD_REQUEST);
    }

    public ResponseEntity<Object> removeObject(int id) {
        if(!marketplace.getListaProdotti().existsById(id)){
            return new ResponseEntity<>("Product Not Found", HttpStatus.BAD_REQUEST);
        }
        marketplace.getListaProdotti().deleteById(id);
        return new ResponseEntity<>("Product "+id+" Deleted", HttpStatus.OK);
    }


//    public boolean modifyProduct(int idProdotto, String nome, double prezzo, String descrizione) {
//        if (marketplace.getListaProdotti().isEmpty())
//            throw new NullPointerException("Lista prodotti vuota");
//
//        ProdottoSingolo ps = (ProdottoSingolo) getProductById(idProdotto);
//        if (ps != null) {
//            ps.setNome(nome);
//            ps.setPrezzo(prezzo);
//            ps.setDescrizione(descrizione);
//            return true;
//        } else
//            throw new NoSuchElementException("Prodotto non trovato");
//    }

//    public boolean reloadQuantity(int idProdotto, int quantita) {
//        if (marketplace.getListaProdotti().isEmpty())
//            throw new NullPointerException("Lista prodotti vuota");
//
//        Prodotto p = getProductById(idProdotto);
//        if (p != null) {
//            p.setQuantita(p.getQuantita() + quantita);
//            return true;
//        } else
//            throw new NoSuchElementException("Prodotto non trovato");
//    }
//
//
//    public Prodotto getProductById(int id) {
//        for (Prodotto p : marketplace.getListaProdotti()) {
//            if (p.getId() == id)
//                return p;
//        }
//        throw new NoSuchElementException("Prodotto non trovato");
//    }


}
