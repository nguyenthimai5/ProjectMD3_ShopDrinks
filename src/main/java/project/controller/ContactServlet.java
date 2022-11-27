package project.controller;

import project.model.Service.CatalogService;
import project.model.Service.ContactService;
import project.model.Serviceimp.CatalogServiceImp;
import project.model.Serviceimp.ContactServiceImp;
import project.model.entity.Catalog;
import project.model.entity.Contact;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ContactServlet", value = "/ContactServlet")
public class ContactServlet extends HttpServlet {
    private ContactService<Contact,String> contactService=new ContactServiceImp();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action=request.getParameter("action");
        if (action != null && action.equals("update")) {
            String conId = request.getParameter("address");
            Contact conUp=contactService.findById(conId);
            request.setAttribute("conUp",conUp);
            request.getRequestDispatcher("views/updateCatalog.jsp").forward(request, response);
        } else {
            getAllContact(request, response);
        }
    }
    public void getAllContact(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        List<Contact> contactList=contactService.findAll();
        request.setAttribute("contactList",contactList);
        request.getRequestDispatcher("views/contactAd.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if (action != null && action.equals("add")) {
            Contact contact=new Contact();
            contact.setAddress(request.getParameter("address"));
            contact.setEmail(request.getParameter("email"));
            contact.setPhone(request.getParameter("phone"));
            contact.setWebsite(request.getParameter("website"));
            boolean result = contactService.save(contact);
            if (result) {
                getAllContact(request, response);
            }
        } else if (action != null && action.equals("update")) {
            Contact contact=new Contact();
            contact.setAddress(request.getParameter("address"));
            contact.setEmail(request.getParameter("email"));
            contact.setPhone(request.getParameter("phone"));
            contact.setWebsite(request.getParameter("website"));
            boolean result = contactService.update(contact);
            if (result) {
                getAllContact(request, response);
            }
        }
    }
}
