package project.model.Serviceimp;

import project.model.Dao.CatalogDao;
import project.model.Dao.ProductDetailsDao;
import project.model.Daoimpl.CatalogDaoImp;
import project.model.Daoimpl.ProductDetailsDaoImp;
import project.model.Service.ProductDetailsService;
import project.model.entity.Catalog;
import project.model.entity.ProductDetails;

import java.util.List;

public class ProductDetailsServiceImp implements ProductDetailsService<ProductDetails,Integer> {
    private ProductDetailsDao<ProductDetails,Integer> productDetailsDao=new ProductDetailsDaoImp();
    @Override
    public List<ProductDetails> findAll() {
        return productDetailsDao.findAll();
    }

    @Override
    public ProductDetails findById(Integer id) {
        return productDetailsDao.findById(id);
    }

    @Override
    public boolean save(ProductDetails productDetails) {
        return productDetailsDao.save(productDetails);
    }

    @Override
    public boolean update(ProductDetails productDetails) {
        return productDetailsDao.update(productDetails);
    }

    @Override
    public boolean delete(Integer id) {
        return productDetailsDao.delete(id);
    }

    @Override
    public List<ProductDetails> searchByName(String name) {
        return productDetailsDao.searchByName(name);
    }
}
