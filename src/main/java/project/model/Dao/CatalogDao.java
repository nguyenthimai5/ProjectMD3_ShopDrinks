package project.model.Dao;

import java.util.List;

public interface CatalogDao<T,V> extends AppDao<T,V> {
    List<T> searchByName(String name);
}
