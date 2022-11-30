package project.model.Service;

import java.util.List;

public interface SizeService<T,V> extends AppService<T,V> {
    List<T> searchByName (String name);
    List<T> findAllSizeStatus();
}
