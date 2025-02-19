package unicam.filieraAgricola_ids.api.handler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unicam.filieraAgricola_ids.api.dto.ProdottoConverter;
import unicam.filieraAgricola_ids.api.dto.ProdottoDto;
import unicam.filieraAgricola_ids.api.repository.ProdottoRepository;

import java.util.List;
import java.util.NoSuchElementException;

@RestController
public class HandlerVisualizzazioneProdotti {

    @Autowired
    private ProdottoRepository prodottoRepository;

    @RequestMapping("/showProducts")
    public ResponseEntity<Object> showList() {
        if(prodottoRepository.findAll().isEmpty()){
            throw new NoSuchElementException("Non ci sono prodotti disponibili");
        }else {
            List<ProdottoDto> prodotti = ProdottoConverter.convertProdottoListToDtoList(prodottoRepository.findAll());
            return new ResponseEntity<>(prodotti, HttpStatus.OK);
        }
    }


//    public List<Prodotto> showList() {
//        if(getGestore().getMarketplace().getListaProdotti().isEmpty()){
//            throw new NoSuchElementException("Non ci sono prodotti disponibili");
//        }else return getGestore().getMarketplace().getListaProdotti();
//    }
//
//    public Prodotto requestDisponibility(String nome){
//        return getGestore().isAvailable(nome);
//    }
}
