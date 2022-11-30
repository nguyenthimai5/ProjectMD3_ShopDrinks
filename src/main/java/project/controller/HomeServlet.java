package project.controller;

import project.model.Service.CatalogService;
import project.model.Service.ProductService;
import project.model.Serviceimp.CatalogServiceImp;
import project.model.Serviceimp.ProductServiceImp;
import project.model.entity.Catalog;
import project.model.entity.Product;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "HomeServlet", value = "/HomeServlet")
public class HomeServlet extends HttpServlet {
    private ProductService<Product,Integer> productService=new ProductServiceImp();
    private CatalogService<Catalog,String> catalogService=new CatalogServiceImp();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");
        if (action != null && action.equals("home")) {
            List<Product> productList = productService.findAllProductStatus();
            request.setAttribute("productListOn",productList);
            request.getRequestDispatcher("views/index.jsp").forward(request, response);
        }else if (action != null && action.equals("shop")) {
            List<Product> productList = productService.findAllProductStatus();
            List<Catalog> catalogList=catalogService.findAllCatalogStatus();
            request.setAttribute("productListOn",productList);
            request.setAttribute("catalogListOn",catalogList);
            request.getRequestDispatcher("views/shop.jsp").forward(request, response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
