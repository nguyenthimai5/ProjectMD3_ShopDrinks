package project.controller;

import project.model.Service.CatalogService;
import project.model.Serviceimp.CatalogServiceImp;
import project.model.entity.Catalog;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@WebServlet(name = "CatalogServlet", value = "/CatalogServlet")
public class CatalogServlet extends HttpServlet {

    private CatalogService<Catalog,String> catalogService=new CatalogServiceImp();


    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action=request.getParameter("action");
        if (action!=null&& action.equals("catalog")) {
            getAllCatalog(request, response);
        }else if (action != null && action.equals("update")) {
                String catId = request.getParameter("catalogId");
                Catalog catUpDate= catalogService.findById(catId);
                request.setAttribute("catalogUpdate", catUpDate);
                request.getRequestDispatcher("views/updateCatalog.jsp").forward(request, response);
            } else if (action != null && action.equals("delete")) {
                String catId = request.getParameter("catalogId");
                boolean result = catalogService.delete(catId);
                if (result) {
                    getAllCatalog(request,response);
                }
            }else if (action!=null&& action.equals("search")) {
                List<Catalog> listSearchCat=catalogService.searchByName(request.getParameter("searchName"));
                if (listSearchCat==null){
                    getAllCatalog(request,response);
                }else {
                    request.setAttribute("listCatalog",listSearchCat);
                    request.getRequestDispatcher("views/catalog.jsp").forward(request, response);
                }

            }

    }

    public void getAllCatalog(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        List<Catalog> listCatalog = catalogService.findAll();
        request.setAttribute("listCatalog",listCatalog);
        request.getRequestDispatcher("views/catalog.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if (action != null && action.equals("add")) {
            Catalog catalog=new Catalog();
            catalog.setCatalogId(request.getParameter("catalogId"));
            catalog.setCatalogName(request.getParameter("catalogName"));
            catalog.setCatalogStatus(Boolean.parseBoolean(request.getParameter("catalogStatus")));
            boolean result = catalogService.save(catalog);
            if (result) {
                getAllCatalog(request, response);
            }
        } else if (action != null && action.equals("update")) {
            Catalog catalog=new Catalog();
            catalog.setCatalogId(request.getParameter("catalogId"));
            catalog.setCatalogName(request.getParameter("catalogName"));
            catalog.setCatalogStatus(Boolean.parseBoolean(request.getParameter("catalogStatus")));
            boolean result = catalogService.update(catalog);
            if (result) {
                getAllCatalog(request, response);
            }
        }
    }
}
