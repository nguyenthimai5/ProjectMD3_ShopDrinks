package project.model.Daoimpl;

import project.model.Dao.UserDao;
import project.model.entity.Size;
import project.model.entity.User;
import project.model.util.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDaoImp implements UserDao<User,Integer> {
    @Override
    public List<User> findAll() {
        List<User> userList=null;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call getAllUsers()}");
            ResultSet rs=callSt.executeQuery();
            userList=new ArrayList<>();
            while (rs.next()){
                User user=new User();
                user.setUserId(rs.getInt("userId"));
                user.setUserName(rs.getString("userName"));
                user.setPassWords(rs.getString("passWords"));
                user.setFullName(rs.getString("fullName"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setAddress(rs.getString("address"));
                user.setUserStatus(rs.getBoolean("userStatus"));
               user.setConfrimPassWords(rs.getString("confrimPassWords"));
                user.setBirthDate(rs.getDate("birthDate"));
                user.setImageUser(rs.getString("imageUser"));
                user.setUserPemission(rs.getBoolean("userPemission"));
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return userList;
    }

    @Override
    public User findById(Integer id) {
        User user=null;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call getByIdUsers(?)}");
            callSt.setInt(1,id);
            ResultSet rs=callSt.executeQuery();
            user=new User();

            if (rs.next()){
                user.setUserId(rs.getInt("userId"));
                user.setUserName(rs.getString("userName"));
                user.setPassWords(rs.getString("passWords"));
                user.setFullName(rs.getString("fullName"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setAddress(rs.getString("address"));
                user.setConfrimPassWords(rs.getString("confrimPassWords"));
                user.setImageUser(rs.getString("imageUser"));
                user.setUserStatus(rs.getBoolean("userStatus"));
                user.setBirthDate(rs.getDate("birthDate"));
                user.setUserPemission(rs.getBoolean("userPemission"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return user;
    }

    @Override
    public boolean save(User user) {
        boolean result=true;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call insertUsers(?,?,?,?,?,?,?,?,?,?,?)}");
            callSt.setString(1, user.getUserName());
            callSt.setString(2, user.getPassWords());
            callSt.setString(3, user.getFullName());
            callSt.setString(4, user.getPhone());
            callSt.setString(5, user.getEmail());
            callSt.setString(6, user.getAddress());
            callSt.setBoolean(7, user.isUserStatus());
            callSt.setString(8, user.getConfrimPassWords());
            callSt.setDate(9, new Date(user.getBirthDate().getTime()));
            callSt.setString(10,user.getImageUser());
            callSt.setBoolean(11,user.isUserPemission());
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
    public boolean update(User user) {
        boolean result=true;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call updateUsers(?,?,?,?,?,?,?,?,?,?,?,?)}");
            callSt.setInt(1,user.getUserId());
            callSt.setString(2, user.getUserName());
            callSt.setString(3, user.getPassWords());
            callSt.setString(4, user.getFullName());
            callSt.setString(5, user.getPhone());
            callSt.setString(6, user.getEmail());
            callSt.setString(7, user.getAddress());
            callSt.setBoolean(8, user.isUserStatus());
            callSt.setString(9, user.getConfrimPassWords());
            callSt.setDate(10, new Date(user.getBirthDate().getTime()));
            callSt.setString(11,user.getImageUser());
            callSt.setBoolean(12, user.isUserPemission());
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
            callSt= conn.prepareCall("{call deleteUsers(?)}");
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
    public List<User> searchByName(String name) {
       Connection conn = null;
        CallableStatement callSt = null;
        List<User> userListsearch  = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call searchByNameUsers(?)}");
            callSt.setString(1,name);
            ResultSet rs = callSt.executeQuery();
            userListsearch   = new ArrayList<>();
            while (rs.next()) {
                User user=new User();
                user.setUserId(rs.getInt("userId"));
                user.setUserName(rs.getString("userName"));
                user.setPassWords(rs.getString("passWords"));
                user.setFullName(rs.getString("fullName"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setAddress(rs.getString("address"));
                user.setUserStatus(rs.getBoolean("userStatus"));
                user.setUserPemission(rs.getBoolean("userPemission"));
                user.setConfrimPassWords(rs.getString("confrimPassWords"));
                user.setBirthDate(rs.getDate("birthDate"));
                user.setImageUser(rs.getString("imageUser"));
                userListsearch.add(user);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);

        }
        return userListsearch;
    }

    @Override
    public List<User> findAllUserStatus() {
        List<User> userList=null;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call getAllUsersStt()}");
            ResultSet rs=callSt.executeQuery();
            userList=new ArrayList<>();
            while (rs.next()){
                User user=new User();
                user.setUserId(rs.getInt("userId"));
                user.setUserName(rs.getString("userName"));
                user.setPassWords(rs.getString("passWords"));
                user.setFullName(rs.getString("fullName"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setAddress(rs.getString("address"));
                user.setUserStatus(rs.getBoolean("userStatus"));
                user.setConfrimPassWords(rs.getString("confrimPassWords"));
                user.setBirthDate(rs.getDate("birthDate"));
                user.setImageUser(rs.getString("imageUser"));
                user.setUserPemission(rs.getBoolean("userPemission"));
                userList.add(user);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return userList;
    }


    @Override
    public User login(String name, String pass) {
        User user=null;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call login(?,?)}");
            callSt.setString(1,name);
            callSt.setString(2,pass);

            ResultSet rs=callSt.executeQuery();
            user=new User();

            if (rs.next()){
                user.setUserId(rs.getInt("userId"));
                user.setUserName(rs.getString("userName"));
                user.setPassWords(rs.getString("passWords"));
                user.setFullName(rs.getString("fullName"));
                user.setPhone(rs.getString("phone"));
                user.setEmail(rs.getString("email"));
                user.setAddress(rs.getString("address"));
                user.setConfrimPassWords(rs.getString("confrimPassWords"));
                user.setImageUser(rs.getString("imageUser"));
                user.setUserStatus(rs.getBoolean("userStatus"));
                user.setBirthDate(rs.getDate("birthDate"));
                user.setUserPemission(rs.getBoolean("userPemission"));

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return user;
    }


}
