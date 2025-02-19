package unicam.filieraAgricola_ids.api.prodotti;

import jakarta.persistence.*;
import unicam.filieraAgricola_ids.api.utenti.Venditore;

import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("PACCHETTO")
public class Pacchetto extends Prodotto{

//    @OneToMany
//    @JoinTable(
//            name = "pacchetto_prodotti",
//            joinColumns = @JoinColumn(name = "pacchetto_id"),
//            inverseJoinColumns = @JoinColumn(name = "prodotto_id")
//    )
 //   private List<Prodotto> prodottiPacchetto = new ArrayList<>();


//    public Pacchetto(String nome, Venditore produttore, String descrizione, List<Prodotto> prodottiPacchetto, int quantita) {
//        super(nome, produttore, descrizione,quantita);
//        this.prodottiPacchetto = prodottiPacchetto;
//        prezzo = getPrezzoIniziale();
//    }


// //   public List<Prodotto> getProdottiPacchetto() {
//        return prodottiPacchetto;
//    }

//    public void setProdottiPacchetto(List<Prodotto> prodottiPacchetto) {
//        this.prodottiPacchetto = prodottiPacchetto;
//    }

    @Override
    public String toString() {
        return "Pacchetto{ id = " + getId() +
                ", \n nome = " + getNome() +
                ", \n descrizione = " + getDescrizione() + '}';
    }
}
