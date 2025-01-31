package unicam.filieraAgricola_ids.api.eventi;

import unicam.filieraAgricola_ids.api.utenti.Venditore;

import java.util.ArrayList;
import java.util.List;

public class EventoAziendale extends Evento{

    private List<Venditore> listaInvitati;

    public EventoAziendale(String data_inizio, String data_fine, String luogo,
                           String nome, int id, List<Venditore> lista) {

        super(data_inizio, data_fine, luogo, nome, id);
        listaInvitati = lista;
    }

}
