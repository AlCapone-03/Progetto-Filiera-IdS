package unicam.filieraAgricola_ids.api.eventi;

import unicam.filieraAgricola_ids.api.utenti.Venditore;

import java.util.ArrayList;
import java.util.List;

public class Fiera extends Evento{

    private String dettagli;
    private List<Venditore> listaFieristi;

    public Fiera(String data_inizio, String data_fine,String nome, String luogo, String dettagli ) {

        super(data_inizio, data_fine, luogo, nome);
        this.dettagli=dettagli;
        listaFieristi= new ArrayList<>();
    }

    public boolean addFierista(Venditore venditore){
        return listaFieristi.add(venditore);
    }
}
