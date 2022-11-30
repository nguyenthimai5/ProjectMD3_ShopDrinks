package project.model.Service;

import java.util.List;

public interface WishListService<T,V> extends AppService<T,V> {

    List<T> findAllWishListStatus();
}