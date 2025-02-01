package unicam.filieraAgricola_ids.api.eventi;

import unicam.filieraAgricola_ids.api.utenti.Venditore;

import java.util.ArrayList;
import java.util.List;

public class Fiera extends Evento{

    private List<Venditore> listaFieristi;

    public Fiera(String data_inizio, String data_fine,
                 String luogo, String nome, int id) {

        super(data_inizio, data_fine, luogo, nome, id);
        listaFieristi= new ArrayList<>();
    }

}
