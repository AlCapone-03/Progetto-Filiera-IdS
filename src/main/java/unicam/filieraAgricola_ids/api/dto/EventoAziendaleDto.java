package unicam.filieraAgricola_ids.api.dto;


import java.util.List;

public class EventoAziendaleDto extends EventoDto {

    private List<Integer> listaInvitati;

    public List<Integer> getListaInvitati() {
        return listaInvitati;
    }

    public void setListaInvitati(List<Integer> listaInvitati) {
        this.listaInvitati = listaInvitati;
    }

}
