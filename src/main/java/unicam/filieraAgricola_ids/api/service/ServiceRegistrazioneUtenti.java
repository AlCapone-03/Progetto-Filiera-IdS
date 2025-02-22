package unicam.filieraAgricola_ids.api.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import unicam.filieraAgricola_ids.api.repository.UtenteRepository;
import unicam.filieraAgricola_ids.api.utenti.Utente;

import java.util.List;

@Service
public class ServiceRegistrazioneUtenti {

    private final UtenteRepository utenteRepository;

    @Autowired
    public ServiceRegistrazioneUtenti(UtenteRepository utenteRepository) {
        this.utenteRepository = utenteRepository;
    }

    public ResponseEntity<String> registraUtente(Utente utente) {
        List<Utente> utenti = utenteRepository.findByNomeAndEmail(utente.getNome(), utente.getEmail());
        if (utenti.isEmpty()) {
            utenteRepository.save(utente);
            return new ResponseEntity<>("Utente registrato con successo", HttpStatus.CREATED);
        }
        return new ResponseEntity<>("Utente già registrato", HttpStatus.BAD_REQUEST);
    }

}