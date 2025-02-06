package unicam.filieraAgricola_ids.api.eventi;

//c'è la possibilità di inserire il tipo date
public abstract class Evento {

    private String data_inizio;

    private String data_fine;

    private String luogo;

    private String nome;

    private static int index=1;

    private int id;

    public Evento(String data_inizio, String data_fine,
                  String luogo, String nome) {
        this.data_inizio = data_inizio;
        this.data_fine = data_fine;
        this.luogo = luogo;
        this.nome = nome;
        id = index++;
    }

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

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        EventoAziendale other = (EventoAziendale) obj;
        return getId() == other.getId();
    }

}
