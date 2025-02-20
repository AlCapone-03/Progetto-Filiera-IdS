package unicam.filieraAgricola_ids.api.eventi;

import jakarta.persistence.*;
import unicam.filieraAgricola_ids.api.utenti.Venditore;

import java.util.ArrayList;
import java.util.List;

@Entity
@DiscriminatorValue("AZIENDALE")
public class EventoAziendale extends Evento{
    @ManyToMany
    @JoinTable(name = "evento_aziendale_venditori",
            joinColumns = @JoinColumn(name = "evento_id"),
            inverseJoinColumns = @JoinColumn(name = "venditore_id"))
    private final List<Venditore> listaInvitati= new ArrayList<>();


    public EventoAziendale() {
    }

    public List<Venditore> getListaInvitati() {
        return listaInvitati;
    }
}
