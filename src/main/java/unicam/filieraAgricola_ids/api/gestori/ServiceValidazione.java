package unicam.filieraAgricola_ids.api.gestori;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.prodotti.Marketplace;


@Service
public class ServiceValidazione {

    private Marketplace marketplace;

    @Autowired
    public ServiceValidazione(Marketplace marketplace) {
        this.marketplace = marketplace;
    }

//    public boolean validateRequest(int idProdotto) {
//        Prodotto p = getProductById(idProdotto);
//        if (p instanceof ProdottoSingolo) {
//            ProdottoSingolo ps = (ProdottoSingolo) p;
//            ps.setValidato(true);
//            return true;
//        }
//        return false;
//    }

//    public Prodotto getProductById(int id){
//        for(Prodotto p: marketplace.getRepository()){
//            if(p.getId() == id)
//                return p;
//        }
//        throw new NoSuchElementException("Prodotto non trovato");
//}


}