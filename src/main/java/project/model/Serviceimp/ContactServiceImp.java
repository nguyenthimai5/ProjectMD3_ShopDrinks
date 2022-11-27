package project.model.Serviceimp;

import project.model.Dao.CatalogDao;
import project.model.Dao.ContactDao;
import project.model.Daoimpl.CatalogDaoImp;
import project.model.Daoimpl.ContactDaoImp;
import project.model.Service.ContactService;
import project.model.entity.Catalog;
import project.model.entity.Contact;

import java.util.List;

public class ContactServiceImp implements ContactService<Contact,String> {
    private ContactDao<Contact,String> contacDao=new ContactDaoImp();
    @Override
    public List<Contact> findAll() {
        return contacDao.findAll();
    }

    @Override
    public Contact findById(String id) {
        return contacDao.findById(id);
    }

    @Override
    public boolean save(Contact contact) {
        return contacDao.save(contact);
    }

    @Override
    public boolean update(Contact contact) {
        return contacDao.update(contact);
    }

    @Override
    public boolean delete(String id) {
        return contacDao.delete(id);
    }

    @Override
    public List<Contact> searchByName(String name) {
        return contacDao.searchByName(name);
    }
}
