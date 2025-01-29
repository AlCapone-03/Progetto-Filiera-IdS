package unicam.filieraAgricola_ids.api;

import java.util.List;

public class Marketplace {

    private List<Prodotto> listaProdotti;
    private static Marketplace instance;

    private Marketplace(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    public List<Prodotto> getListaProdotti() {
        return listaProdotti;
    }

    public void setListaProdotti(List<Prodotto> listaProdotti) {
        this.listaProdotti = listaProdotti;
    }

    public static Marketplace getInstance(List<Prodotto> listaProdotti) {
        if (instance == null) {
            instance = new Marketplace(listaProdotti);
        }
        return instance;
    }

}

