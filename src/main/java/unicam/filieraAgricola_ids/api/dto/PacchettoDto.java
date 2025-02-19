package unicam.filieraAgricola_ids.api.dto;

import java.util.List;

public class PacchettoDto extends ProdottoDto {


    private List<ProdottoDto> prodottiPacchetto;

    public PacchettoDto(String nome, String descrizione, int quantita, double prezzo,int idProduttore, List<ProdottoDto> prodottiPacchetto) {
        super(nome, descrizione, quantita, prezzo, idProduttore);
        this.prodottiPacchetto = prodottiPacchetto;
    }

    public List<ProdottoDto> getProdottiPacchetto() {
        return prodottiPacchetto;
    }

    public void setProdottiPacchetto(List<ProdottoDto> prodottiPacchetto) {
        this.prodottiPacchetto = prodottiPacchetto;
}
}