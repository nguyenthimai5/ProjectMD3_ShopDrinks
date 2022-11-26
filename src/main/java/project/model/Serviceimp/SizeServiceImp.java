package project.model.Serviceimp;

import project.model.Dao.CatalogDao;
import project.model.Dao.SizeDao;
import project.model.Daoimpl.CatalogDaoImp;
import project.model.Daoimpl.SizeDaoImp;
import project.model.Service.SizeService;
import project.model.entity.Catalog;
import project.model.entity.Size;

import java.util.List;

public class SizeServiceImp implements SizeService<Size,String> {

    private SizeDao<Size,String> sizeDao=new SizeDaoImp();
    @Override
    public List<Size> findAll() {
        return sizeDao.findAll();
    }

    @Override
    public Size findById(String id) {
        return sizeDao.findById(id);
    }

    @Override
    public boolean save(Size size) {
        return sizeDao.save(size);
    }

    @Override
    public boolean update(Size size) {
        return sizeDao.update(size);
    }

    @Override
    public boolean delete(String id) {
        return sizeDao.delete(id);
    }

    @Override
    public List<Size> searchByName(String name) {
        return sizeDao.searchByName(name);
    }
}
