package unicam.filieraAgricola_ids.api.handler;

public interface IHandlerGestione<T> {

    boolean requestAdd(T obj);

    boolean requestRemove(int id);

}
