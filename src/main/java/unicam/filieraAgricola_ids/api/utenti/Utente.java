package unicam.filieraAgricola_ids.api.utenti;

public abstract class Utente {

    private int id;
    private String nome;
    private String email;
    private String password;
    private static int index = 1;

    public Utente(String nome, String email, String password) {
        this.id = index++;
        this.nome = nome;
        this.email = email;
        this.password = password;
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
