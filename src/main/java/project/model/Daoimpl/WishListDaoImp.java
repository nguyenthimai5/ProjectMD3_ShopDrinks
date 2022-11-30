package project.model.Daoimpl;

import project.model.Dao.WishListDao;
import project.model.entity.Size;
import project.model.entity.WishList;
import project.model.util.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class WishListDaoImp implements WishListDao<WishList,Integer> {
    @Override
    public List<WishList> findAll() {
        List<WishList> wishLists=null;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call getAllWishList()}");
            ResultSet rs=callSt.executeQuery();
            wishLists=new ArrayList<>();
            while (rs.next()){
                WishList wishList=new WishList();
                wishList.setProductId(rs.getInt("productId"));
                wishList.setUserId(rs.getInt("userId"));
                wishList.setWishlistId(rs.getInt("wishlistId"));
                wishList.setWishlistStatus(rs.getBoolean("wishlistStatus"));
                wishLists.add(wishList);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return wishLists;
    }

    @Override
    public WishList findById(Integer id) {
        WishList wishList=null;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call getByIdWishList(?)}");
            callSt.setInt(1,id);
            ResultSet rs=callSt.executeQuery();
            wishList=new WishList();

            if (rs.next()){
                wishList.setProductId(rs.getInt("productId"));
                wishList.setUserId(rs.getInt("userId"));
                wishList.setWishlistId(rs.getInt("wishlistId"));
                wishList.setWishlistStatus(rs.getBoolean("wishlistStatus"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return wishList;
    }

    @Override
    public boolean save(WishList wishList) {
        boolean result=true;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call insertWishList(?,?,?)}");
            callSt.setInt(1,wishList.getProductId());
            callSt.setInt(2,wishList.getUserId());
            callSt.setBoolean(3, wishList.isWishlistStatus());

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
    public boolean update(WishList wishList) {
        boolean result=true;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call updateWishList(?,?,?,?)}");
            callSt.setInt(1,wishList.getProductId());
            callSt.setInt(2,wishList.getUserId());
            callSt.setInt(3,wishList.getWishlistId());
            callSt.setBoolean(4, wishList.isWishlistStatus());
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
            callSt= conn.prepareCall("{call deleteWishList(?)}");
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
    public List<WishList> findAllWishLishStatus() {
        List<WishList> wishLists=null;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call getWishListSttOn()}");
            ResultSet rs=callSt.executeQuery();
            wishLists=new ArrayList<>();
            while (rs.next()){
                WishList wishList=new WishList();
                wishList.setProductId(rs.getInt("productId"));
                wishList.setUserId(rs.getInt("userId"));
                wishList.setWishlistId(rs.getInt("wishlistId"));
                wishList.setWishlistStatus(rs.getBoolean("wishlistStatus"));
                wishLists.add(wishList);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return wishLists;
    }
}
