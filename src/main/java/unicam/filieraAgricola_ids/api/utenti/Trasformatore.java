package unicam.filieraAgricola_ids.api.utenti;

import unicam.filieraAgricola_ids.api.handler.HandlerMarketplace;

import java.util.List;

public class Trasformatore extends Venditore {

    public Trasformatore(String nome, String email, String password,
                         List<HandlerMarketplace> handler,int p_IVA) {
        super(nome, email, password, handler, p_IVA);
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
