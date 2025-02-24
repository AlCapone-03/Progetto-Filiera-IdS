package unicam.filieraAgricola_ids.api.Dto;

import unicam.filieraAgricola_ids.api.Utenti.Ruolo;

public class UtenteDto {

    private String nome;
    private String email;
    private String password;
    private Ruolo ruolo;

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

    public Ruolo getRuolo() {
        return ruolo;
    }

    public void setRuolo(Ruolo ruolo) {
        this.ruolo =ruolo;
    }
}