package unicam.filieraAgricola_ids.api.Controller;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import unicam.filieraAgricola_ids.api.Dto.UtenteDto;
import unicam.filieraAgricola_ids.api.Service.ServiceRegistrazioneUtenti;
import unicam.filieraAgricola_ids.api.Utenti.FactoryUtente;
import unicam.filieraAgricola_ids.api.Utenti.Ruolo;
import unicam.filieraAgricola_ids.api.Utenti.Utente;

@RestController
public class ControllerRegistrazione {

    private final ServiceRegistrazioneUtenti serviceRegistrazioneUtenti;

    @Autowired
    public ControllerRegistrazione(ServiceRegistrazioneUtenti serviceRegistrazioneUtenti) {
        this.serviceRegistrazioneUtenti = serviceRegistrazioneUtenti;
    }

    @PostMapping("/register")
    public ResponseEntity<String> requestUserRegistration(@RequestBody UtenteDto utente) {
        FactoryUtente factoryUtente = new FactoryUtente();
        Utente utente1 = factoryUtente.createUser(utente.getNome(), utente.getEmail(),
                utente.getPassword(), utente.getRuolo());
        return serviceRegistrazioneUtenti.registraUtente(utente1);
    }

}
