package unicam.filieraAgricola_ids.api.utenti;


public  class FactoryUtente {

    public Utente createUser(String nome, String email, String password, Ruolo ruolo){
        return switch (ruolo) {
            case ACQUIRENTE -> new Acquirente(nome, email, password, ruolo);
            case PRODUTTORE -> new Produttore(nome, email, password, ruolo);
            case TRASFORMATORE -> new Trasformatore(nome, email, password, ruolo);
            case DISTRIBUTORE -> new DistributoreTipicita(nome, email, password, ruolo);
            case ANIMATORE -> new Animatore(nome, email, password, ruolo);
            case CURATORE -> new Curatore(nome, email, password, ruolo);
            default -> throw new IllegalArgumentException("Ruolo non valido");
        };
    }

}

