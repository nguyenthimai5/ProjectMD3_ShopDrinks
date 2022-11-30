package project.model.Daoimpl;

import project.model.Dao.CatalogDao;
import project.model.entity.Catalog;
import project.model.entity.Product;
import project.model.util.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CatalogDaoImp implements CatalogDao<Catalog,String> {
    @Override
    public List<Catalog> findAll() {
        List<Catalog> catalogList=null;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call getAllCatalog()}");
            ResultSet rs=callSt.executeQuery();
            catalogList=new ArrayList<>();
            while (rs.next()){
                Catalog cat=new Catalog();
                cat.setCatalogId(rs.getString("catalogId"));
                cat.setCatalogName(rs.getString("catalogName"));
                cat.setCatalogStatus(rs.getBoolean("catalogStatus"));
                catalogList.add(cat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return catalogList;
    }

    @Override
    public Catalog findById(String id) {
        Catalog cat=null;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call getByIdCatalog(?)}");
            callSt.setString(1,id);
            ResultSet rs=callSt.executeQuery();
            cat=new Catalog();

            if (rs.next()){
                cat.setCatalogId(rs.getString("catalogId"));
                cat.setCatalogName(rs.getString("catalogName"));
                cat.setCatalogStatus(rs.getBoolean("catalogStatus"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return cat;
    }

    @Override
    public boolean save(Catalog catalog) {
       boolean result=true;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call insertCatalog(?,?,?)}");
            callSt.setString(1,catalog.getCatalogId());
            callSt.setString(2, catalog.getCatalogName());
            callSt.setBoolean(3, catalog.isCatalogStatus());

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
    public boolean update(Catalog catalog) {
        boolean result=true;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call updateCatalog(?,?,?)}");
            callSt.setString(1,catalog.getCatalogId());
            callSt.setString(2, catalog.getCatalogName());
            callSt.setBoolean(3, catalog.isCatalogStatus());

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
            callSt= conn.prepareCall("{call deleteCatalog(?)}");
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
    public List<Catalog> searchByName(String name) {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Catalog> catalogsListsearch  = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call getByNameCatalog(?)}");
            callSt.setString(1,name);
            ResultSet rs = callSt.executeQuery();
            catalogsListsearch   = new ArrayList<>();
            while (rs.next()) {
                Catalog catalog=new Catalog();
                catalog.setCatalogId(rs.getString("catalogId"));
                catalog.setCatalogName(rs.getString("catalogName"));
                catalog.setCatalogStatus(rs.getBoolean("catalogStatus"));
                catalogsListsearch.add(catalog);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);

        }
        return catalogsListsearch;
    }

    @Override
    public List<Catalog> findAllCatalogStatus() {
        List<Catalog> catalogList=null;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call getAllCatalogStatus()}");
            ResultSet rs=callSt.executeQuery();
            catalogList=new ArrayList<>();
            while (rs.next()){
                Catalog cat=new Catalog();
                cat.setCatalogId(rs.getString("catalogId"));
                cat.setCatalogName(rs.getString("catalogName"));
                cat.setCatalogStatus(rs.getBoolean("catalogStatus"));
                catalogList.add(cat);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return catalogList;
    }
}
