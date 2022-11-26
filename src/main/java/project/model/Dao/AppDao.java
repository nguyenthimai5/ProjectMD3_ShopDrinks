package project.model.Dao;

import java.util.List;

public interface AppDao<T,V>{
    List<T> findAll();
    T findById(V id);
    boolean save(T t);
    boolean update(T t);
    boolean delete(V id);
}
