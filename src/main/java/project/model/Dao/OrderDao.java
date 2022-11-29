package project.model.Dao;

import java.util.List;

public interface OrderDao<T,V> extends AppDao<T,V> {
    List<T> searchByName(String name);
}

