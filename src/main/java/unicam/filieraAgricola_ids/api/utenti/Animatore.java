package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.eventi.Evento;
import unicam.filieraAgricola_ids.api.eventi.EventoAziendale;
import unicam.filieraAgricola_ids.api.eventi.Fiera;
import unicam.filieraAgricola_ids.api.handler.HandlerEvento;
import unicam.filieraAgricola_ids.api.handler.IHandler;

import java.util.ArrayList;
import java.util.List;

public class Animatore extends Utente {

    private List<Evento> listaEventiCaricati;

    public Animatore(String nome, String email, String password, List<IHandler> handlers) {
        super(nome, email, password, handlers);

        listaEventiCaricati = new ArrayList<>();
    }

    public List<Evento> getListaEventiCaricati() {
        return listaEventiCaricati;
    }

    public boolean createEvent(String data_inizio, String data_fine, String luogo, String nome, List<Venditore> listaInvitati) {
        Evento eventoAziendale = new EventoAziendale(data_inizio, data_fine, luogo, nome, listaInvitati);
        if(getHandlerEvento().requestAdd(eventoAziendale)){
            listaEventiCaricati.add(eventoAziendale);
            return true;
        }
        return false;
    }

    public boolean createFair(String data_inizio,String data_fine, String nome, String luogo, String dettagli) {
        Evento fiera = new Fiera(data_inizio, data_fine, nome, luogo, dettagli);
        if (getHandlerEvento().requestAdd(fiera)){
            listaEventiCaricati.add(fiera);
            return true;
        }
        return false;
    }

    public boolean modifyDataEvent(int idEvento, String data_inizio, String data_fine, String nome, String luogo) {
        return getHandlerEvento().requestModifyEvent(idEvento, data_inizio, data_fine, nome, luogo);
    }

    public boolean deleteEvent(int idEvento) {
        if (getHandlerEvento().requestRemove(idEvento)){
            for(Evento evento : listaEventiCaricati){
                if(evento.getId() == idEvento){
                    listaEventiCaricati.remove(evento);
                    return true;
                }
            }
        }
        return false;
    }

    public HandlerEvento getHandlerEvento() {
        return (HandlerEvento) getHandlers().get(0);
    }

}
