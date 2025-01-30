package unicam.filieraAgricola_ids.api.prodotti;

import java.util.ArrayList;
import java.util.List;

//todo era un singleton vedere se rimetterlo

public class Marketplace {

    private List<Prodotto> listaProdotti;

    public Marketplace() {
        this.listaProdotti = new ArrayList<>();
    }

    public List<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    //todo aggiungere metodo per mostrare tutti i prodotti e un contains per sapere se
    // un prodotto è presente nella lista

}

