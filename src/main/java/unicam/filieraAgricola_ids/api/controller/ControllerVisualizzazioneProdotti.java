package unicam.filieraAgricola_ids.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import unicam.filieraAgricola_ids.api.repository.ProdottoRepository;

@RestController
public class ControllerVisualizzazioneProdotti {

    @Autowired
    private ProdottoRepository prodottoRepository;

    @RequestMapping("/showProducts")
    public ResponseEntity<Object> showList() {
//        if(prodottoRepository.findAll().isEmpty()){
//            throw new NoSuchElementException("Non ci sono prodotti disponibili");
//        }else {
//          //  List<ProdottoDto> prodotti = ProdottoConverter.convertProdottoListToDtoList(prodottoRepository.findAll());
//            return new ResponseEntity<>(prodotti, HttpStatus.OK);
//        }
        return null;
    }


//    public List<Prodotto> showList() {
//        if(getGestore().getMarketplace().getRepository().isEmpty()){
//            throw new NoSuchElementException("Non ci sono prodotti disponibili");
//        }else return getGestore().getMarketplace().getRepository();
//    }
//
//    public Prodotto requestDisponibility(String nome){
//        return getGestore().isAvailable(nome);

}