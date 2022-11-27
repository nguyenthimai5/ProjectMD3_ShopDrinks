package project.model.Daoimpl;

import project.model.Dao.ContactDao;
import project.model.entity.Catalog;
import project.model.entity.Contact;
import project.model.util.ConnectionDB;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ContactDaoImp implements ContactDao<Contact,String> {
    @Override
    public List<Contact> findAll() {
        List<Contact> contactList=null;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call getAllContact()}");
            ResultSet rs=callSt.executeQuery();
            contactList=new ArrayList<>();
            while (rs.next()){
                Contact contact=new Contact();
                contact.setAddress(rs.getString("address"));
                contact.setEmail(rs.getString("email"));
                contact.setPhone(rs.getString("phone"));
                contact.setWebsite(rs.getString("website"));
               contactList.add(contact);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return contactList;
    }

    @Override
    public Contact findById(String id) {
        return null;
    }

    @Override
    public boolean save(Contact contact) {
        boolean result=true;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call insertContact(?,?,?,?)}");
            callSt.setString(1,contact.getAddress());
            callSt.setString(2, contact.getEmail());
            callSt.setString(3,contact.getPhone());
            callSt.setString(4,contact.getWebsite());
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
    public boolean update(Contact contact) {
        boolean result=true;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call updateContact(?,?,?,?)}");
            callSt.setString(1,contact.getAddress());
            callSt.setString(2, contact.getEmail());
            callSt.setString(3,contact.getPhone());
            callSt.setString(4,contact.getWebsite());
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
        return false;
    }

    @Override
    public List<Contact> searchByName(String name) {
        return null;
    }
}
