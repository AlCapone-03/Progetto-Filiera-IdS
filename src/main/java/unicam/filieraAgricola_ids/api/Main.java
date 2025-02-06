package unicam.filieraAgricola_ids.api;

import unicam.filieraAgricola_ids.api.handler.HandlerMarketplace;
import unicam.filieraAgricola_ids.api.handler.HandlerProdotto;
import unicam.filieraAgricola_ids.api.handler.HandlerVisualizzazioneProdotti;
import unicam.filieraAgricola_ids.api.prodotti.*;
import unicam.filieraAgricola_ids.api.utenti.Produttore;
import unicam.filieraAgricola_ids.api.utenti.Venditore;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //produttore
//        Venditore produttore = new Produttore("Marco", 12345);
        //prodotto
        List<String> certificazioni = new ArrayList<>();
        certificazioni.add("Biologico");
        certificazioni.add("DOP");


   /*     marketplace.getListaProdotti().clear();

        produttore.loadProduct(1,certificazioni,"Specifiche",
                "Descrizione", 10, 1,"Pomodori");

        System.out.println(marketplace.getListaProdotti().size());
        System.out.println(marketplace.getListaProdotti().get(0).toString());

        //controllo che sia anche nel venditore
        System.out.println(produttore.getProdottiCaricati().get(0).toString()); */


        /*
        System.out.println(prodotto.toString());

        Prodotto prodotto2 = new ProdottoSingolo("Pomo", "Descrizione", 11,
                certificazioni, produttore, "Specifiche", 2);

        System.out.println();
        System.out.println(prodotto2.toString());

        List<Prodotto> prodotti = new ArrayList<>();
        prodotti.add(prodotto);
        prodotti.add(prodotto2);

        Prodotto pacchetto = new Pacchetto("Pacchetto", "Descrizione", 20,
                prodotti, 2);

        System.out.println();
        System.out.println(pacchetto.toString());

        */

        /*
        Prodotto pomodori = new ProdottoSingolo("Pomodoro", "Descrizione", 10,
                certificazioni, produttore, "Specifiche", 1);
        Prodotto cipolle = new ProdottoSingolo("Cipolla", "Descrizione", 12,
                certificazioni, produttore, "Specifiche", 3);

        System.out.println(pomodori.toString());
        System.out.println(cipolle.toString());

        Prodotto mele = new ProdottoSingolo("Mela", "Descrizione", 13,
                certificazioni, produttore, "Specifiche", 4);


        System.out.println(mele.toString());

         */
       /*
        Marketplace marketplace = Marketplace.getInstance();


        produttore.loadProduct(certificazioni,"Specifiche",
                "Descrizione", 10, 1,"Pomodori");


        produttore.deleteProduct(Marketplace.getInstance().getListaProdotti().get(0));

        for(Prodotto p: marketplace.getListaProdotti()){
            System.out.println(p.toString());
        }

        */


        HandlerVisualizzazioneProdotti handlerVisualizzazioneProdotti = new HandlerVisualizzazioneProdotti();
        HandlerProdotto handlerProdotto = new HandlerProdotto();

        List<HandlerMarketplace> handlerMarketplaces = new ArrayList<>();
        handlerMarketplaces.add(new HandlerProdotto());
        handlerMarketplaces.add(new HandlerVisualizzazioneProdotti());

        Venditore produttore = new Produttore( "Marco", "Marco@culo.org",
                "12345",handlerMarketplaces,12345);
        Prodotto pomodori = new ProdottoSingolo("Pomodoro", "Descrizione", 10,
                certificazioni, produttore, "Specifiche", 1);
        handlerProdotto.requestAdd(pomodori);
        Prodotto cipolle = new ProdottoSingolo("Cipolla", "Descrizione", 12,
                certificazioni, produttore, "Specifiche", 3);
        handlerProdotto.requestAdd(cipolle);
        for(Prodotto p : handlerVisualizzazioneProdotti.showList())
        {
            System.out.println(p.toString());
        }

    }
}
