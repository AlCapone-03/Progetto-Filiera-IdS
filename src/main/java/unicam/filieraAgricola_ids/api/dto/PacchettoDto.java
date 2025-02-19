package unicam.filieraAgricola_ids.api.dto;

import java.util.List;

public class PacchettoDto {

    private String nome;

    private String descrizione;

    private int quantita;

    private double prezzo;

    private List<ProdottoDto> prodottiPacchetto;

    public PacchettoDto(String nome, String descrizione, int quantita, double prezzo, List<ProdottoDto> prodottiPacchetto) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.quantita = quantita;
        this.prezzo = prezzo;
        this.prodottiPacchetto = prodottiPacchetto;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescrizione() {
        return descrizione;
    }

    public void setDescrizione(String descrizione) {
        this.descrizione = descrizione;
    }

    public int getQuantita() {
        return quantita;
    }

    public void setQuantita(int quantita) {
        this.quantita = quantita;
    }

    public double getPrezzo() {
        return prezzo;
    }

    public void setPrezzo(double prezzo) {
        this.prezzo = prezzo;
    }

    public List<ProdottoDto> getProdottiPacchetto() {
        return prodottiPacchetto;
    }

    public void setProdottiPacchetto(List<ProdottoDto> prodottiPacchetto) {
        this.prodottiPacchetto = prodottiPacchetto;
    }
}
