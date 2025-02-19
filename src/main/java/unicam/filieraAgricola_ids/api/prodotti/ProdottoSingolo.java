package unicam.filieraAgricola_ids.api.prodotti;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("SINGOLO")
public class ProdottoSingolo extends Prodotto {

    private String certificazioni;

    private int idPacchetto;


/*  public ProdottoSingolo(String nome, String descrizione,
                           double prezzo, List<String> listaCertificazioni,
                           Venditore produttore,int quantita) {
        super(nome, produttore, descrizione,quantita);
        this.listaCertificazioni = listaCertificazioni;
        this.validato = false;
        this.prezzo = prezzo;
    }
*/

    public int getIdPacchetto() {
       return idPacchetto;
    }

    public void setIdPacchetto(int idPacchetto) {
        this.idPacchetto = idPacchetto;
    }

    public void setCertificazioni(String certificazioni) {
        this.certificazioni = certificazioni;
    }

    public String getCertificazioni() {
        return certificazioni;
    }


}
