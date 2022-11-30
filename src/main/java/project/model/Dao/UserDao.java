package project.model.Dao;

import project.model.entity.User;

import java.util.List;

public interface UserDao<T,V> extends AppDao<T,V> {
    List<T> searchByName(String name);
    List<T> findAllUserStatus();
    User login(String name,String pass);
}