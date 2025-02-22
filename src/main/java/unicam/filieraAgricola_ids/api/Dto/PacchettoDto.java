package unicam.filieraAgricola_ids.api.Dto;

import java.util.List;

public class PacchettoDto extends ProdottoDto {

    private List<ProdottoDto> prodottiPacchetto;

    public List<ProdottoDto> getProdottiPacchetto() {
        return prodottiPacchetto;
    }

    public void setProdottiPacchetto(List<ProdottoDto> prodottiPacchetto) {
        this.prodottiPacchetto = prodottiPacchetto;
    }

}