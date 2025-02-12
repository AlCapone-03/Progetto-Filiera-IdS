package unicam.filieraAgricola_ids.api.utenti;
import unicam.filieraAgricola_ids.api.handler.IHandler;

import java.util.List;

public class Trasformatore extends Venditore {

    public Trasformatore(String nome, String email, String password,
                         List<IHandler> handlers) {
        super(nome, email, password, handlers);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
