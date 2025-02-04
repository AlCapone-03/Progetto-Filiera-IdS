package unicam.filieraAgricola_ids.api.utenti;

public abstract class Utente {

    private int id;
    private String nome;
    private String email;
    private String password;

    public Utente(int id, String nome, String email, String password) {
        this.id = id;
        this.nome = nome;
        this.email = email;
        this.password = password;
    }
}
