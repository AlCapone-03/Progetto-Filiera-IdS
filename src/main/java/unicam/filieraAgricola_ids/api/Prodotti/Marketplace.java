package unicam.filieraAgricola_ids.api.Prodotti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.Repository.ProdottoRepository;

@Service
public class Marketplace {

    private final ProdottoRepository prodottoRepository;

    @Autowired
    public Marketplace(ProdottoRepository repository) {
        this.prodottoRepository = repository;
    }

    public ProdottoRepository getRepository() {
        return prodottoRepository;
    }

}