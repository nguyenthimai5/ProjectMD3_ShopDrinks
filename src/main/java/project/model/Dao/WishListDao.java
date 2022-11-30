package project.model.Dao;

import java.util.List;

public interface WishListDao<T,V> extends AppDao<T,V> {

    List<T> findAllWishLishStatus();
}