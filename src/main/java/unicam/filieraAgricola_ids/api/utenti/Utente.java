package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.handler.IHandler;

import java.util.List;

public abstract class Utente {

    private final int id;
    private String nome;
    private String email;
    private String password;
    private static int index = 1;
    private final List<IHandler> handlers;

    public Utente(String nome, String email, String password, List<IHandler> handlers) {
        this.id = index++;
        this.nome = nome;
        this.email = email;
        this.password = password;
        this.handlers = handlers;
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

    public List<IHandler> getHandlers() {
        return handlers;
    }
}
