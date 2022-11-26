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
        return findAll();
    }

    @Override
    public ProductDetails findById(Integer id) {
        return null;
    }

    @Override
    public boolean save(ProductDetails productDetails) {
        return false;
    }

    @Override
    public boolean update(ProductDetails productDetails) {
        return false;
    }

    @Override
    public boolean delete(Integer id) {
        return false;
    }

    @Override
    public List<ProductDetails> searchByName(String name) {
        return null;
    }
}
