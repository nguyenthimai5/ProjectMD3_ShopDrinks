package project.model.Service;

import project.model.entity.User;

import java.util.List;

public interface UserService<T,V> extends AppService<T,V> {
    List<T> searchByName (String name);
    List<T> findAllUserStatus();
    User login(String name,String pass);
}
