package unicam.filieraAgricola_ids.api.utenti;

import java.util.List;

public class Produttore extends Venditore {
    public Produttore(String nome, String email, String password) {
        super(nome, email, password);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
