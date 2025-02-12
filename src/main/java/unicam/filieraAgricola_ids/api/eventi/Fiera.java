package unicam.filieraAgricola_ids.api.eventi;

import unicam.filieraAgricola_ids.api.utenti.Venditore;

import java.util.ArrayList;
import java.util.List;

public class Fiera extends Evento{

    private String dettagli;
    private List<Venditore> listaFieristi;

    public Fiera(String data_inizio, String data_fine,String nome, String luogo, String dettagli ) {

        super(data_inizio, data_fine, luogo, nome);
        this.dettagli=dettagli;
        listaFieristi= new ArrayList<>();
    }

    @Override
    public String getData_inizio() {
        return super.getData_inizio();
    }

    @Override
    public void setData_inizio(String data_inizio) {
        super.setData_inizio(data_inizio);
    }

    @Override
    public String getData_fine() {
        return super.getData_fine();
    }

    @Override
    public void setData_fine(String data_fine) {
        super.setData_fine(data_fine);
    }

    @Override
    public String getLuogo() {
        return super.getLuogo();
    }

    @Override
    public void setLuogo(String luogo) {
        super.setLuogo(luogo);
    }

    @Override
    public String getNome() {
        return super.getNome();
    }

    @Override
    public void setNome(String nome) {
        super.setNome(nome);
    }

    @Override
    public int getId() {
        return super.getId();
    }

    public boolean addFierista(Venditore venditore){
        return listaFieristi.add(venditore);
    }
}
