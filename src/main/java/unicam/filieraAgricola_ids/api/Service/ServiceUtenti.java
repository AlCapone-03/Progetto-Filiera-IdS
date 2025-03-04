package unicam.filieraAgricola_ids.api.Service;

import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.Repository.UtenteRepository;
import unicam.filieraAgricola_ids.api.Utenti.*;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Service
public class ServiceUtenti {

    private final UtenteRepository utenti;

    @Autowired
    public ServiceUtenti(UtenteRepository utenti) {
        this.utenti = utenti;
    }

    public UtenteRepository getRepository() {
        return utenti;
    }

    public List<Venditore> getVenditori() {
        List<Ruolo> ruoli = List.of(Ruolo.PRODUTTORE, Ruolo.TRASFORMATORE, Ruolo.DISTRIBUTORE);
        return utenti.findByRuoloIn(ruoli)
                .stream()
                .map(this::convertiInVenditore) // Converte l'utente nella giusta sottoclasse
                .collect(Collectors.toList());
    }

    // Converte una lista di ID in una lista di oggetti venditore
    @Transactional
    public List<Venditore> getVenditoriByIds(List<Integer> ids) {
        Set<Integer> idSet = Set.copyOf(ids); // Converte in Set per ricerca veloce
        return getVenditori().stream()
                .filter(venditore -> idSet.contains(venditore.getId())) // Filtra solo quelli con ID nella lista
                .collect(Collectors.toList());
    }

    public Venditore convertiInVenditore(Utente utente) {
        switch (utente.getRuolo()) {
            case PRODUTTORE:
                Produttore produttore = new Produttore();
                produttore.setId(utente.getId());
                produttore.setNome(utente.getNome());
                produttore.setEmail(utente.getEmail());
                produttore.setPassword(utente.getPassword());
                produttore.setRuolo(utente.getRuolo());
                return produttore;
            case TRASFORMATORE:
                Trasformatore trasformatore= new Trasformatore();
                trasformatore.setId(utente.getId());
                trasformatore.setNome(utente.getNome());
                trasformatore.setEmail(utente.getEmail());
                trasformatore.setPassword(utente.getPassword());
                trasformatore.setRuolo(utente.getRuolo());
                return trasformatore;
            case DISTRIBUTORE:
                DistributoreTipicita distributoreTipicita = new DistributoreTipicita();
                distributoreTipicita.setId(utente.getId());
                distributoreTipicita.setNome(utente.getNome());
                distributoreTipicita.setEmail(utente.getEmail());
                distributoreTipicita.setPassword(utente.getPassword());
                distributoreTipicita.setRuolo(utente.getRuolo());
                return distributoreTipicita;
            default:
                throw new IllegalArgumentException("Ruolo non valido: " + utente.getRuolo());
        }
    }

}