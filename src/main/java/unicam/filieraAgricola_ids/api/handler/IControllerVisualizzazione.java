package unicam.filieraAgricola_ids.api.handler;

import java.util.List;

public interface IControllerVisualizzazione<T> {

    List<T> requestVisualizzazione();
}

// todo fare una sola interfaccia per la visualizzazione con entrambi i metodi
// per visualizzare i prodotti e gli eventi con una sola classe che li implementa
// entrambi e chi ha quel controller li ha a disposizione entrambi ma ne usa solo uno

// oppure un metodo solo sull'interfaccia ed è implementato da due classi