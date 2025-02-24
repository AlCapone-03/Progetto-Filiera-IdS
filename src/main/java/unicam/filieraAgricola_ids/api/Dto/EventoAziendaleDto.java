package unicam.filieraAgricola_ids.api.Dto;

import java.util.List;

public class EventoAziendaleDto extends EventoDto {

    private List<Integer> listaInvitati;

    public void setListaInvitati(List<Integer> listaInvitati) {
        this.listaInvitati = listaInvitati;
    }

    public List<Integer> getListaInvitati() {
        return listaInvitati;
    }

}
