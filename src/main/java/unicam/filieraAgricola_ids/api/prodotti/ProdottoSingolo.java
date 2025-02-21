package unicam.filieraAgricola_ids.api.prodotti;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue("SINGOLO")
public class ProdottoSingolo extends Prodotto {

    private String certificazioni;

    public void setCertificazioni(String certificazioni) {
        this.certificazioni = certificazioni;
    }

    public String getCertificazioni() {
        return certificazioni;
    }

}