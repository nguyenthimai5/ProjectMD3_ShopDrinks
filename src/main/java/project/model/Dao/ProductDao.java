package project.model.Dao;

import java.util.List;

public interface ProductDao<T,V>extends AppDao<T,V> {
    List<T> searchByName(String name);
    List<T> findAllProductStatus();

}
