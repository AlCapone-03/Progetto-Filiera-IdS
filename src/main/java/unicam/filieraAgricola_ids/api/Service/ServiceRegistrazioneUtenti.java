package unicam.filieraAgricola_ids.api.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.Utenti.Utente;

import java.util.List;

@Service
public class ServiceRegistrazioneUtenti {

    private final ServiceUtenti serviceUtenti;

    @Autowired
    public ServiceRegistrazioneUtenti(ServiceUtenti serviceUtenti) {
        this.serviceUtenti = serviceUtenti;
    }

    public ResponseEntity<String> registraUtente(Utente utente) {
        List<Utente> utenti = serviceUtenti.getRepository().findByNomeAndEmail(utente.getNome(), utente.getEmail());
        if (utenti.isEmpty()) {
            serviceUtenti.getRepository().save(utente);
            return new ResponseEntity<>("Utente registrato", HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Utente già registrato", HttpStatus.BAD_REQUEST);
    }

}