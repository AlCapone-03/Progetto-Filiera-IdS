package unicam.filieraAgricola_ids.api;

import java.util.List;

//Todo implementare il singleton

public class Marketplace {

    private List<Prodotto> listaProdotti;

    public Marketplace(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    public List<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }
}
