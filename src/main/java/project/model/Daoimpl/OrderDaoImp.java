package project.model.Daoimpl;

import project.model.Dao.OrderDao;
import project.model.entity.Catalog;
import project.model.entity.Contact;
import project.model.entity.Orders;
import project.model.util.ConnectionDB;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class OrderDaoImp implements OrderDao<Orders,Integer> {
    @Override
    public List<Orders> findAll() {
        List<Orders> ordersList=null;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call getAllOrders()}");
            ResultSet rs=callSt.executeQuery();
            ordersList=new ArrayList<>();
            while (rs.next()){
                Orders orders=new Orders();
                orders.setOrdersId(rs.getInt("ordersId"));
                orders.setUserId(rs.getInt("userId"));
                orders.setCreateDate(rs.getDate("createDate"));
                orders.setTotalAmount(rs.getFloat("totalAmount"));
                orders.setQuantity(rs.getInt("quantity"));
                orders.setPhone(rs.getString("phone"));
                orders.setAddress(rs.getString("address"));
                orders.setOrderStatus(rs.getInt("orderStatus"));
                ordersList.add(orders);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return ordersList;
    }

    @Override
    public Orders findById(Integer id) {
        Orders orders=null;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call getByIdOrders(?)}");
            callSt.setInt(1,id);
            ResultSet rs=callSt.executeQuery();
            orders=new Orders();
            if (rs.next()){
                orders.setOrdersId(rs.getInt("ordersId"));
                orders.setUserId(rs.getInt("userId"));
                orders.setCreateDate(rs.getDate("createDate"));
                orders.setTotalAmount(rs.getFloat("totalAmount"));
                orders.setQuantity(rs.getInt("quantity"));
                orders.setPhone(rs.getString("phone"));
                orders.setAddress(rs.getString("address"));
                orders.setOrderStatus(rs.getInt("orderStatus"));
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }finally {
            ConnectionDB.closeConnection(conn,callSt);
        }
        return orders;
    }

    @Override
    public boolean save(Orders orders) {
        boolean result=true;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call insertOrders(?,?,?,?,?,?,?)}");
           callSt.setInt(1,orders.getUserId());
           callSt.setDate(2,new Date(orders.getCreateDate().getTime()));
           callSt.setFloat(3,orders.getTotalAmount());
           callSt.setInt(4,orders.getQuantity());
           callSt.setString(5,orders.getPhone());
           callSt.setString(6,orders.getAddress());
           callSt.setInt(7,orders.getOrderStatus());
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
    public boolean update(Orders orders) {
        boolean result=true;
        Connection conn=null;
        CallableStatement callSt=null;
        try{
            conn= ConnectionDB.openConnection();
            callSt= conn.prepareCall("{call updateOrders(?,?,?,?,?,?,?,?)}");
            callSt.setInt(1,orders.getOrdersId());
            callSt.setInt(2,orders.getUserId());
            callSt.setDate(3,new Date(orders.getCreateDate().getTime()));
            callSt.setFloat(4,orders.getTotalAmount());
            callSt.setInt(5,orders.getQuantity());
            callSt.setString(6,orders.getPhone());
            callSt.setString(7,orders.getAddress());
            callSt.setInt(8,orders.getOrderStatus());
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
            callSt= conn.prepareCall("{call deleteOrders(?)}");
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
    public List<Orders> searchByName(String name) {
        Connection conn = null;
        CallableStatement callSt = null;
        List<Orders> ordersListsearch  = null;
        try {
            conn = ConnectionDB.openConnection();
            callSt = conn.prepareCall("{call searchOrder(?)}");
            callSt.setString(1,name);
            ResultSet rs = callSt.executeQuery();
            ordersListsearch   = new ArrayList<>();
            while (rs.next()) {
                Orders orders=new Orders();
                orders.setOrdersId(rs.getInt("ordersId"));
                orders.setUserId(rs.getInt("userId"));
                orders.setCreateDate(rs.getDate("createDate"));
                orders.setTotalAmount(rs.getFloat("totalAmount"));
                orders.setQuantity(rs.getInt("quantity"));
                orders.setPhone(rs.getString("phone"));
                orders.setAddress(rs.getString("address"));
                orders.setOrderStatus(rs.getInt("orderStatus"));
                ordersListsearch.add(orders);
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            ConnectionDB.closeConnection(conn, callSt);

        }
        return ordersListsearch;
    }
}
