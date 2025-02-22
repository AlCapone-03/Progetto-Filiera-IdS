package unicam.filieraAgricola_ids.api.eventi;

import jakarta.persistence.*;
import unicam.filieraAgricola_ids.api.utenti.Acquirente;
import java.util.ArrayList;
import java.util.List;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "tipo", discriminatorType = DiscriminatorType.STRING)
public abstract class Evento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToMany
    @JoinTable(
            name = "evento_acquirente",
            joinColumns = @JoinColumn(name = "evento_id"),
            inverseJoinColumns = @JoinColumn(name = "acquirente_id")
    )

    private List<Acquirente> listaPartecipanti = new ArrayList<>();

    private String data_inizio;

    private String data_fine;

    private String luogo;

    private String nome;


    public Evento() {

    }

    public String getData_inizio() {
        return data_inizio;
    }

    public void setData_inizio(String data_inizio) {
        this.data_inizio = data_inizio;
    }

    public String getData_fine() {
        return data_fine;
    }

    public void setData_fine(String data_fine) {
        this.data_fine = data_fine;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getId() {
        return id;
    }

    public List<Acquirente> getListaPartecipanti() {
        return listaPartecipanti;
    }

    public void setListaPartecipanti(List<Acquirente> listaPartecipanti) {
        this.listaPartecipanti = listaPartecipanti;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EventoAziendale other = (EventoAziendale) obj;
        return getId() == other.getId();
    }

}
