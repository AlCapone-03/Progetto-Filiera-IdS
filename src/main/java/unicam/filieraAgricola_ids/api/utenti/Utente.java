package unicam.filieraAgricola_ids.api.utenti;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.List;

@Entity
public abstract class Utente {

    @Id
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

    public Utente() {
    }

    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
