package project.model.Serviceimp;

import project.model.Dao.OrderDao;
import project.model.Dao.ProductDao;
import project.model.Daoimpl.OrderDaoImp;
import project.model.Daoimpl.ProductDaoImp;
import project.model.Service.OrderService;
import project.model.entity.Orders;
import project.model.entity.Product;

import java.util.List;

public class OrderServiceImp implements OrderService<Orders,Integer> {
    private OrderDao<Orders,Integer> orderDao=new OrderDaoImp();
    @Override
    public List<Orders> findAll() {
        return orderDao.findAll();
    }

    @Override
    public Orders findById(Integer id) {
        return orderDao.findById(id);
    }

    @Override
    public boolean save(Orders orders) {
        return orderDao.save(orders);
    }

    @Override
    public boolean update(Orders orders) {
        return orderDao.update(orders);
    }

    @Override
    public boolean delete(Integer id) {
        return orderDao.delete(id);
    }

    @Override
    public List<Orders> searchByName(String name) {
        return orderDao.searchByName(name);
    }
}
