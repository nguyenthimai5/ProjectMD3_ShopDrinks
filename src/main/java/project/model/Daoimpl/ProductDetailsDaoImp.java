package project.model.Daoimpl;

import project.model.Dao.ProductDetailsDao;
import project.model.entity.Product;
import project.model.entity.ProductDetails;
import project.model.util.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDetailsDaoImp implements ProductDetailsDao<ProductDetails,Integer> {
    @Override
    public List<ProductDetails> findAll() {
        List<ProductDetails> productDetailsList = null;
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getAllProductDetails()}");
            ResultSet rs = callSt.executeQuery();
            productDetailsList = new ArrayList<>();
            while (rs.next()) {
                ProductDetails productDetails=new ProductDetails();
                productDetails.setProDetailsId(rs.getInt("proDetailsId"));
                productDetails.setProductId(rs.getInt("productId"));
                productDetails.setSizeId(rs.getString("sizeId"));
                productDetails.setPricePrDt(rs.getFloat("pricePrDt"));
                productDetails.setProDtStatus(rs.getBoolean("proDtStatus"));
                productDetailsList.add(productDetails);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return productDetailsList;
    }

    @Override
    public ProductDetails findById(Integer id) {
        ProductDetails productDetails = null;
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getByIdProductDetails(?)}");
            callSt.setInt(1, id);
            ResultSet rs = callSt.executeQuery();
           productDetails=new ProductDetails();

            if (rs.next()) {
                productDetails.setProDetailsId(rs.getInt("proDetailsId"));
                productDetails.setProductId(rs.getInt("productId"));
                productDetails.setSizeId(rs.getString("sizeId"));
                productDetails.setPricePrDt(rs.getFloat("pricePrDt"));
                productDetails.setProDtStatus(rs.getBoolean("proDtStatus"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        } finally {
            ConnectionDB.closeConnection(conn, callSt);
        }
        return productDetails;
    }

    @Override
    public boolean save(ProductDetails productDetails) {
        boolean result = true;
        Connection conn = null;
        CallableStatement callSt = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call insertProductDetails(?,?,?,?)}");
            callSt.setInt(1,productDetails.getProductId());
            callSt.setString(2,productDetails.getSizeId());
            callSt.setFloat(3,productDetails.getPricePrDt());
            callSt.setBoolean(4,productDetails.isProDtStatus());
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
    public boolean update(ProductDetails productDetails) {
        boolean result=true;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call updateProductDetails(?,?,?,?,?)}");
            callSt.setInt(1,productDetails.getProDetailsId());
            callSt.setInt(2,productDetails.getProductId());
            callSt.setString(3,productDetails.getSizeId());
            callSt.setFloat(4,productDetails.getPricePrDt());
            callSt.setBoolean(5,productDetails.isProDtStatus());
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
            callSt= conn.prepareCall("{call deleteProductDetails(?)}");
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
    public List<ProductDetails> searchByName(String name) {
        return null;
    }
}
