package unicam.filieraAgricola_ids.api.prodotti;

import jakarta.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("PACCHETTO")
public class Pacchetto extends Prodotto{

    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(
            name = "pacchetto_prodotti",
            joinColumns = @JoinColumn(name = "pacchetto_id"),
            inverseJoinColumns = @JoinColumn(name = "prodotto_id")
    )

    private List<Prodotto> prodottiPacchetto = new ArrayList<>();

    public void setProdottiPacchetto(List<Prodotto> prodotti) {
        this.prodottiPacchetto = prodotti;
    }
    public List<Prodotto> getProdottiPacchetto() {
        return prodottiPacchetto;
    }

}