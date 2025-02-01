package unicam.filieraAgricola_ids.api.handler;

import java.util.List;

public interface IControllerVisualizzazione<T> {

    List<T> requestVisualizzazione();
}

// todo fare una sola interfaccia per la visualizzazione con entrambi i metodi
// per visualizzare i prodotti e gli eventi