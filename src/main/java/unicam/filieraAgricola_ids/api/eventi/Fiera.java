package unicam.filieraAgricola_ids.api.eventi;

import jakarta.persistence.*;
import unicam.filieraAgricola_ids.api.utenti.Venditore;

import java.util.ArrayList;
import java.util.List;
@Entity
@DiscriminatorValue("FIERA")
public class Fiera extends Evento{

    private String dettagli;
    @ManyToMany
    @JoinTable(name = "fiera_venditori",
            joinColumns = @JoinColumn(name = "evento_id"),
            inverseJoinColumns = @JoinColumn(name = "venditore_id"))
    private final List<Venditore> listaFieristi= new ArrayList<>();

    public Fiera(String data_inizio, String data_fine,String nome, String luogo, String dettagli ) {
        super(data_inizio, data_fine, luogo, nome);
        this.dettagli=dettagli;
    }

    public Fiera() {
    }

    public List<Venditore> getListaFieristi() {
        return listaFieristi;
    }

    public String getDettagli() {
        return dettagli;
    }

    public void setDettagli(String dettagli) {
        this.dettagli = dettagli;
    }
}
