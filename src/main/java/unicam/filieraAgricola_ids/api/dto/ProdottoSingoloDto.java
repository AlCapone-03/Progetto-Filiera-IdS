package unicam.filieraAgricola_ids.api.dto;

public class ProdottoSingoloDto extends ProdottoDto {

    private String certificazioni;

    public ProdottoSingoloDto(String nome, String descrizione, int quantita,
                              double prezzo, int idProduttore, String certificazioni) {

        super(nome, descrizione, quantita, prezzo, idProduttore);
        this.certificazioni = certificazioni;
    }

    public String getCertificazioni() {
        return certificazioni;
    }

    public void setCertificazioni(String certificazioni) {
        this.certificazioni = certificazioni;
}

}