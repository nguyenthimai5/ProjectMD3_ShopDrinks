package project.model.Serviceimp;

import project.model.Dao.ProductDao;
import project.model.Dao.SizeDao;
import project.model.Daoimpl.ProductDaoImp;
import project.model.Daoimpl.SizeDaoImp;
import project.model.Service.ProductService;
import project.model.entity.Product;
import project.model.entity.Size;

import java.util.List;

public class ProductServiceImp implements ProductService<Product,String> {
    private ProductDao<Product,String> productDao=new ProductDaoImp();
    @Override
    public List<Product> findAll() {
        return productDao.findAll();
    }

    @Override
    public Product findById(String id) {
        return productDao.findById(id);
    }

    @Override
    public boolean save(Product product) {
        return productDao.save(product);
    }

    @Override
    public boolean update(Product product) {
        return productDao.update(product);
    }

    @Override
    public boolean delete(String id) {
        return productDao.delete(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productDao.searchByName(name);
    }
}
