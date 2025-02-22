package unicam.filieraAgricola_ids.api.Dto;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;

@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "tipo")
@JsonSubTypes({
        @JsonSubTypes.Type(value = FieraDto.class, name = "fiera"),
        @JsonSubTypes.Type(value = EventoAziendaleDto.class, name = "eventoaziendale"),
})
public abstract class EventoDto {


    private String data_inizio;

    private String data_fine;

    private String luogo;

    private String nome;

    public String getData_inizio() {
        return data_inizio;
    }

    public void setData_inizio(String data_inizio) {
        this.data_inizio = data_inizio;
    }

    public String getData_fine() {
        return data_fine;
    }

    public void setData_fine(String data_fine) {
        this.data_fine = data_fine;
    }

    public String getLuogo() {
        return luogo;
    }

    public void setLuogo(String luogo) {
        this.luogo = luogo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
