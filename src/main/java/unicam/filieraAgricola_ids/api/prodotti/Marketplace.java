package unicam.filieraAgricola_ids.api.prodotti;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.repository.ProdottoRepository;

import java.util.ArrayList;
import java.util.List;

@Service
public class Marketplace {

    private final ProdottoRepository listaProdotti;

    @Autowired
    public Marketplace(ProdottoRepository listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    public ProdottoRepository getListaProdotti() {
        return listaProdotti;
    }
}

