package unicam.filieraAgricola_ids.api.dto;

public class ProdottoDto {

    private String nome;

    private String descrizione;

    private int quantita;

    private double prezzo;

    public ProdottoDto(String nome, String descrizione, int quantita) {
        this.nome = nome;
        this.descrizione = descrizione;
        this.quantita = quantita;
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
}
