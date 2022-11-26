package project.model.Service;

import java.util.List;

public interface CatalogService<T,V> extends AppService<T,V> {
List<T> searchByName (String name);
}
