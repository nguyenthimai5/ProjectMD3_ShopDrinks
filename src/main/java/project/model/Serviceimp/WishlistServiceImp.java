package project.model.Serviceimp;

import project.model.Dao.WishListDao;
import project.model.Daoimpl.WishListDaoImp;
import project.model.Service.WishListService;
import project.model.entity.WishList;

import java.util.List;

public class WishlistServiceImp implements WishListService<WishList,Integer> {
    private WishListDao<WishList,Integer> wishListDao=new WishListDaoImp();
    @Override
    public List<WishList> findAll() {
        return wishListDao.findAll();
    }

    @Override
    public WishList findById(Integer id) {
        return wishListDao.findById(id);
    }

    @Override
    public boolean save(WishList wishList) {
        return wishListDao.save(wishList);
    }

    @Override
    public boolean update(WishList wishList) {
        return wishListDao.update(wishList);
    }

    @Override
    public boolean delete(Integer id) {
        return wishListDao.delete(id);
    }

    @Override
    public List<WishList> findAllWishListStatus() {
        return wishListDao.findAllWishLishStatus();
    }
}
