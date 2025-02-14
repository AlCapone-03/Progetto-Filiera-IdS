package unicam.filieraAgricola_ids.api.factoryUtenti;
import unicam.filieraAgricola_ids.api.utenti.Utente;


public abstract class FactoryUtente {

    public abstract Utente createUser(String nome, String email, String password);

}

