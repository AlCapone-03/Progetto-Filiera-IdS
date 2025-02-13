package unicam.filieraAgricola_ids.api.prodotti;

import java.util.ArrayList;
import java.util.List;

//La classe è un Singleton
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

