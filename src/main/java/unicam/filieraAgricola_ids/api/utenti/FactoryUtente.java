package unicam.filieraAgricola_ids.api.utenti;


public  class FactoryUtente {

    public Utente createUser(String nome, String email, String password, Ruolo ruolo){
        switch (ruolo){
            case ACQUIRENTE:
                return new Acquirente(nome,email,password,ruolo);
            case PRODUTTORE:
                return new Produttore(nome,email,password,ruolo);
            case TRASFORMATORE:
                return new Trasformatore(nome,email,password,ruolo);
            case DISTRIBUTORE:
                return new DistributoreTipicita(nome,email,password,ruolo);
            case ANIMATORE:
                return new Animatore(nome,email,password,ruolo);
            case CURATORE:
                return new Curatore(nome,email,password,ruolo);
            default:
                throw new IllegalArgumentException("Ruolo non valido");
        }

    }

}

