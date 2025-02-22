package unicam.filieraAgricola_ids.api.Prodotti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.Repository.ProdottoRepository;

@Service
public class Marketplace {

    private final ProdottoRepository repository;

    @Autowired
    public Marketplace(ProdottoRepository repository) {
        this.repository = repository;
    }

    public ProdottoRepository getRepository() {
        return repository;
    }

}