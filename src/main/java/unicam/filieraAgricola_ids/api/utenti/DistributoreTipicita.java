package unicam.filieraAgricola_ids.api.utenti;
import unicam.filieraAgricola_ids.api.handler.HandlerProdotto;
import unicam.filieraAgricola_ids.api.handler.IHandler;
import unicam.filieraAgricola_ids.api.prodotti.Pacchetto;
import unicam.filieraAgricola_ids.api.prodotti.Prodotto;

import java.util.List;

public class DistributoreTipicita extends Venditore {

    public DistributoreTipicita(String nome, String email, String password,
                                List<IHandler> handlers) {
        super(nome, email, password, handlers);
    }

    public boolean createPackage(String nome, String descrizione,List<Prodotto> prodotti, int quantita){
        Pacchetto pacchetto = new Pacchetto(nome, descrizione, prodotti, quantita);
        if(getHandlerProdotto().requestAdd(pacchetto)){
            getProdottiCaricati().add(pacchetto);
            System.out.println("Pacchetto creato con successo");
            return true;
        }
        else System.out.println("Errore nella creazione del pacchetto");
        return false;
    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
