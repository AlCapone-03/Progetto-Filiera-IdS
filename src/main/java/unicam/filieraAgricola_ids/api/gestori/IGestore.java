package unicam.filieraAgricola_ids.api.gestori;

public interface IGestore<T> {

    boolean addObject(T t);

    boolean removeObject(int index);

}
