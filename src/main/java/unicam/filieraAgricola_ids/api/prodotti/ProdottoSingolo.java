package unicam.filieraAgricola_ids.api.prodotti;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

import java.util.List;

@Entity
@DiscriminatorValue("SINGOLO")
public class ProdottoSingolo extends Prodotto {

    private List<String> listaCertificazioni;

    private boolean validato = false;


  /*  public ProdottoSingolo(String nome, String descrizione,
                           double prezzo, List<String> listaCertificazioni,
                           Venditore produttore,int quantita) {
        super(nome, produttore, descrizione,quantita);
        this.listaCertificazioni = listaCertificazioni;
        this.validato = false;
        this.prezzo = prezzo;
    }
*/


//    public List<String> getListaCertificazioni() {
//        return listaCertificazioni;
//    }

    public void setListaCertificazioni(List<String> listaCertificazioni) {
        this.listaCertificazioni = listaCertificazioni;
    }

    public boolean isValidato() {
        return validato;
    }

    public void setValidato(boolean validato) {
        this.validato = validato;
    }

    @Override
    public String toString() {
        return "\n ProdottoSingolo{" +
                "id=" + getId() +
                ", \n listaCertificazioni=" + listaCertificazioni +
                ", \n descrizione='" + getDescrizione() + '\'' +
                ", \n prezzo=" + getPrezzo() +
                ", \n validato=" + validato +
                ", \n nome='" + getNome() + '\'' +
                ", \n quantita= " + getQuantita() +
                '}';
    }

}
