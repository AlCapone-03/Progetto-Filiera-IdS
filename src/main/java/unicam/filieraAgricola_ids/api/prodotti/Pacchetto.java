package unicam.filieraAgricola_ids.api.prodotti;

import java.util.List;

public class Pacchetto extends Prodotto{

    private List<Prodotto> prodottiPacchetto;

    private double prezzo;

    public Pacchetto(String nome, String descrizione, List<Prodotto> prodottiPacchetto, int quantita) {
        super(nome, descrizione,quantita);
        this.prodottiPacchetto = prodottiPacchetto;
        prezzo = getPrezzoIniziale();
    }

    private double getPrezzoIniziale() {
        double prezzo = 0;
        for (Prodotto prodotto : prodottiPacchetto) {
            ProdottoSingolo prodottoSingolo = (ProdottoSingolo) prodotto;
            prezzo += prodottoSingolo.getPrezzo();
        }
        return prezzo;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public List<Prodotto> getProdottiPacchetto() {
        return prodottiPacchetto;
    }

    @Override
    public String toString() {
        return "Pacchetto{ id = " + getId() +
                ", \n nome = " + getNome() +
                ", \n descrizione = " + getDescrizione() +
                ", \n prezzo = " + prezzo +
                '}';
    }
}
