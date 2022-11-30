package project.model.Daoimpl;

import project.model.Dao.SizeDao;
import project.model.entity.Catalog;
import project.model.entity.Size;
import project.model.util.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SizeDaoImp implements SizeDao<Size,String> {
    @Override
    public List<Size> findAll() {
        List<Size> sizeList=null;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call getAllSize()}");
            ResultSet rs=callSt.executeQuery();
            sizeList=new ArrayList<>();
            while (rs.next()){
                Size size=new Size();
                size.setSizeId(rs.getString("sizeId"));
                size.setSizeName(rs.getString("sizeName"));
                size.setSizeStatus(rs.getBoolean("sizeStatus"));
                sizeList.add(size);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return sizeList;
    }

    @Override
    public Size findById(String id) {
        Size size=null;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call getByIdSize(?)}");
            callSt.setString(1,id);
            ResultSet rs=callSt.executeQuery();
            size=new Size();

            if (rs.next()){
                size.setSizeId(rs.getString("sizeId"));
                size.setSizeName(rs.getString("sizeName"));
                size.setSizeStatus(rs.getBoolean("sizeStatus"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return size;
    }

    @Override
    public boolean save(Size size) {
        boolean result=true;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call insertSize(?,?,?)}");
            callSt.setString(1,size.getSizeId());
            callSt.setString(2, size.getSizeName());
            callSt.setBoolean(3, size.isSizeStatus());

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
    public boolean update(Size size) {
        boolean result=true;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call updateSize(?,?,?)}");
            callSt.setString(1,size.getSizeId());
            callSt.setString(2, size.getSizeName());
            callSt.setBoolean(3, size.isSizeStatus());

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
    public boolean delete(String id) {
        boolean result=true;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call deleteSize(?)}");
            callSt.setString(1,id);
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
    public List<Size> searchByName(String name) {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Size> sizeListsearch  = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getByNameSize(?)}");
            callSt.setString(1,name);
            ResultSet rs = callSt.executeQuery();
            sizeListsearch   = new ArrayList<>();
            while (rs.next()) {
                Size size=new Size();
                size.setSizeId(rs.getString("sizeId"));
                size.setSizeName(rs.getString("sizeName"));
                size.setSizeStatus(rs.getBoolean("sizeStatus"));
                sizeListsearch.add(size);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);

        }
        return sizeListsearch;
    }

    @Override
    public List<Size> findAllSizeStatus() {
        List<Size> sizeList=null;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call getAllSizeStatus()}");
            ResultSet rs=callSt.executeQuery();
            sizeList=new ArrayList<>();
            while (rs.next()){
                Size size=new Size();
                size.setSizeId(rs.getString("sizeId"));
                size.setSizeName(rs.getString("sizeName"));
                size.setSizeStatus(rs.getBoolean("sizeStatus"));
                sizeList.add(size);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return sizeList;
    }
}
