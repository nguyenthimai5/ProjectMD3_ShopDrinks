package project.model.Daoimpl;

import project.model.Dao.ProductDao;
import project.model.entity.Catalog;
import project.model.entity.Product;
import project.model.util.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImp implements ProductDao<Product, Integer> {
    @Override
    public List<Product> findAll() {
        List<Product> productList = null;
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getAllProduct()}");
            ResultSet rs = callSt.executeQuery();
            productList = new ArrayList<>();
            while (rs.next()) {
                Product product = new Product();
                product.setProductId(rs.getInt("productId"));
                product.setProductName(rs.getString("productName"));
                product.setCatalogId(rs.getString("catalogId"));
                product.setDescriptions(rs.getString("descriptions"));
                product.setQuantity(rs.getInt("quantity"));
                product.setImage(rs.getString("image"));
                product.setPrice(rs.getFloat("price"));
                product.setProductStatus(rs.getBoolean("productStatus"));
                productList.add(product);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return productList;
    }

    @Override
    public Product findById(Integer id) {
        Product product = null;
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getByIdProduct(?)}");
            callSt.setInt(1, id);
            ResultSet rs = callSt.executeQuery();
            product = new Product();

            if (rs.next()) {

                product.setProductId(rs.getInt("productId"));
                product.setProductName(rs.getString("productName"));
                product.setCatalogId(rs.getString("catalogId"));
                product.setDescriptions(rs.getString("descriptions"));
                product.setQuantity(rs.getInt("quantity"));
                product.setImage(rs.getString("image"));
                product.setPrice(rs.getFloat("price"));
                product.setProductStatus(rs.getBoolean("productStatus"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return product;
    }

    @Override
    public boolean save(Product product) {
        boolean result = true;
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call insertProduct(?,?,?,?,?,?,?)}");
            callSt.setString(1, product.getProductName());
            callSt.setString(2, product.getCatalogId());
            callSt.setString(3, product.getDescriptions());
            callSt.setInt(4, product.getQuantity());
            callSt.setString(5, product.getImage());
            callSt.setFloat(6, product.getPrice());
            callSt.setBoolean(7, product.isProductStatus());
            callSt.executeUpdate();

        } catch (SQLException e) {
            result = false;
            throw new RuntimeException(e);
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return result;
    }

    @Override
    public boolean update(Product product) {
        boolean result=true;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call updateProduct(?,?,?,?,?,?,?,?)}");
            callSt.setInt(1, product.getProductId());
            callSt.setString(2, product.getProductName());
            callSt.setString(3, product.getCatalogId());
            callSt.setString(4, product.getDescriptions());
            callSt.setInt(5, product.getQuantity());
            callSt.setString(6, product.getImage());
            callSt.setFloat(7, product.getPrice());
            callSt.setBoolean(8, product.isProductStatus());
            callSt.executeUpdate();

        } catch (SQLException e) {
            result=false;
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return result;
    }

    @Override
    public boolean delete(Integer id) {
        boolean result=true;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call deleteProduct(?)}");
            callSt.setInt(1,id);
            callSt.executeUpdate();

        } catch (SQLException e) {
            result=false;
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return result;
    }

    @Override
    public List<Product> searchByName(String name) {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Product> productListsearch  = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getByNameProduct(?)}");
            callSt.setString(1,name);
            ResultSet rs = callSt.executeQuery();
            productListsearch   = new ArrayList<>();
            while (rs.next()) {
                Product product = new Product();
                product.setProductId(rs.getInt("productId"));
                product.setProductName(rs.getString("productName"));
                product.setCatalogId(rs.getString("catalogId"));
                product.setDescriptions(rs.getString("descriptions"));
                product.setQuantity(rs.getInt("quantity"));
                product.setImage(rs.getString("image"));
                product.setPrice(rs.getFloat("price"));
                product.setProductStatus(rs.getBoolean("productStatus"));
                productListsearch.add(product);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);

        }
        return productListsearch;
    }
}
