package unicam.filieraAgricola_ids.api.utenti;

import java.util.List;

public class DistributoreTipicita extends Venditore {

    public DistributoreTipicita(String nome, String email, String password) {
        super(nome, email, password);
    }

//    public boolean createPackage(String nome, Venditore produttore,String descrizione,List<Prodotto> prodotti, int quantita){
//        Pacchetto pacchetto = new Pacchetto(nome, produttore, descrizione, prodotti, quantita);
//        if(getHandlerProdotto().requestAdd(pacchetto)){
//            getProdottiCaricati().add(pacchetto);
//            System.out.println("Pacchetto creato con successo");
//            return true;
//        }
//        else System.out.println("Errore nella creazione del pacchetto");
//        return false;
//    }
    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

}
