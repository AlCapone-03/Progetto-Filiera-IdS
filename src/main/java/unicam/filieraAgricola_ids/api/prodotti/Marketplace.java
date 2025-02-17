package unicam.filieraAgricola_ids.api.prodotti;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class Marketplace {

    private static Marketplace marketplace;

    private List<Prodotto> listaProdotti;

    private Marketplace() {
        this.listaProdotti = new ArrayList<>();
    }

    public static Marketplace getInstance() {
        if (marketplace == null) {
            marketplace = new Marketplace();
        }
        return marketplace;
    }

    public List<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

}

