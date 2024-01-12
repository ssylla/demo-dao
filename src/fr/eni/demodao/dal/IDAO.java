package fr.eni.demodao.dal;

import java.util.List;

public interface IDAO<T, ID> {

    void save(T object);
    T findById(ID id);
    List<T> findAll();
    void update(T object);
    void delete(T object);
}
