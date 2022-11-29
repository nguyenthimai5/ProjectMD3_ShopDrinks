package project.model.Serviceimp;

import project.model.Dao.SizeDao;
import project.model.Dao.UserDao;
import project.model.Daoimpl.SizeDaoImp;
import project.model.Daoimpl.UserDaoImp;
import project.model.Service.UserService;
import project.model.entity.Size;
import project.model.entity.User;

import java.util.List;

public class UserServiceImp implements UserService<User,Integer> {
    private UserDao<User,Integer> userDao=new UserDaoImp();
    @Override
    public List<User> findAll() {
        return userDao.findAll();
    }

    @Override
    public User findById(Integer id) {
        return userDao.findById(id);
    }

    @Override
    public boolean save(User user) {
        return userDao.save(user);
    }

    @Override
    public boolean update(User user) {
        return userDao.update(user);
    }

    @Override
    public boolean delete(Integer id) {
        return userDao.delete(id);
    }

    @Override
    public List<User> searchByName(String name) {
        return userDao.searchByName(name);
    }
}
