package project.model.Serviceimp;

import project.model.Dao.CatalogDao;
import project.model.Daoimpl.CatalogDaoImp;
import project.model.Service.CatalogService;
import project.model.entity.Catalog;

import java.util.List;

public class CatalogServiceImp implements CatalogService<Catalog,String> {
    private CatalogDao<Catalog,String> catalogDao=new CatalogDaoImp();
    @Override
    public List<Catalog> findAll() {
        return catalogDao.findAll();
    }

    @Override
    public Catalog findById(String id) {
        return catalogDao.findById(id);
    }

    @Override
    public boolean save(Catalog catalog) {
        return catalogDao.save(catalog);
    }

    @Override
    public boolean update(Catalog catalog) {
        return catalogDao.update(catalog);
    }

    @Override
    public boolean delete(String id) {
        return catalogDao.delete(id);
    }

    @Override
    public List<Catalog> searchByName(String name) {
        return catalogDao.searchByName(name);
    }
}
