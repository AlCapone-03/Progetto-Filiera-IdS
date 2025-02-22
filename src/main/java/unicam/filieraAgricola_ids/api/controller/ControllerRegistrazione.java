package unicam.filieraAgricola_ids.api.controller;

import jakarta.websocket.server.PathParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import unicam.filieraAgricola_ids.api.service.ServiceRegistrazioneUtenti;
import unicam.filieraAgricola_ids.api.utenti.FactoryUtente;
import unicam.filieraAgricola_ids.api.utenti.Ruolo;
import unicam.filieraAgricola_ids.api.utenti.Utente;

@RestController
public class ControllerRegistrazione {

    private ServiceRegistrazioneUtenti serviceRegistrazioneUtenti;

    @Autowired
    public ControllerRegistrazione(ServiceRegistrazioneUtenti serviceRegistrazioneUtenti) {
        this.serviceRegistrazioneUtenti = serviceRegistrazioneUtenti;
    }

    @PostMapping("/register")
    public ResponseEntity<String> requestUserRegistration(@PathParam("nome")String nome,
                                                          @PathParam("email")String email,
                                                          @PathParam("password")String password,
                                                          @PathParam("ruolo") Ruolo ruolo)
    {
        FactoryUtente factoryUtente = new FactoryUtente();
        Utente utente = factoryUtente.createUser(nome, email, password, ruolo);
        return serviceRegistrazioneUtenti.registraUtente(utente);
    }

}
