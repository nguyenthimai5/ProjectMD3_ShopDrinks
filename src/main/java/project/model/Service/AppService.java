package project.model.Service;

import java.util.List;

public interface AppService<T,V>{
    List<T> findAll();
    T findById(V id);
    boolean save(T t);
    boolean update(T t);
    boolean delete(V id);
}
