package project.controller;

import project.model.Service.CatalogService;
import project.model.Service.ProductService;
import project.model.Service.SizeService;
import project.model.Serviceimp.CatalogServiceImp;
import project.model.Serviceimp.ProductServiceImp;
import project.model.Serviceimp.SizeServiceImp;
import project.model.entity.Catalog;
import project.model.entity.Product;
import project.model.entity.Size;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.File;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductServlet", value = "/ProductServlet")
@MultipartConfig(
        fileSizeThreshold = 1024*1024*1,
        maxFileSize = 1024*1024*5,
        maxRequestSize = 1024*1024*10
)
public class ProductServlet extends HttpServlet {
    private ProductService<Product,Integer> productService=new ProductServiceImp();
    private CatalogService<Catalog,String> catalogService = new CatalogServiceImp();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action=request.getParameter("action");
        if (action != null && action.equals("product")) {
            getAllProduct(request, response);

        } else  if (action != null && action.equals("Update")) {
                String prId = request.getParameter("productId");
                Product proUpdate=productService.findById(Integer.parseInt(prId));
                List<Catalog> listCatalogUp = catalogService.findAllCatalogStatus();
                request.setAttribute("listCatalogUp",listCatalogUp);
                request.setAttribute("proUpdate", proUpdate);
                request.getRequestDispatcher("views/updateProduct.jsp").forward(request,response);
            } else if (action != null && action.equals("delete")) {
                String prId = request.getParameter("productId");
                boolean result = productService.delete(Integer.parseInt(prId));
                if (result) {
                    getAllProduct(request,response);
                }
            }else if (action!=null&& action.equals("search")) {
                List<Product> listProductSearch=productService.searchByName(request.getParameter("searchName"));
                if (listProductSearch==null){
                    getAllProduct(request,response);
                }else {
                    request.setAttribute("productList",listProductSearch);
                    request.getRequestDispatcher("views/productAd.jsp").forward(request,response);
                }
            }

    }
    public void getAllProduct(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        List<Product> productList = productService.findAll();
        request.setAttribute("productList",productList);
        List<Catalog> listCatalog = catalogService.findAllCatalogStatus();
        request.setAttribute("listCatalog",listCatalog);
        request.getRequestDispatcher("views/productAd.jsp").forward(request, response);
    }
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if (action != null && action.equals("add")) {
            Product product=new Product();
//            product.setProductId(Integer.parseInt(request.getParameter("productId")));
            product.setProductName(request.getParameter("productName"));
            product.setCatalogId(request.getParameter("catalogId"));
            product.setDescriptions(request.getParameter("descriptions"));
            product.setQuantity(Integer.parseInt(request.getParameter("quantity")));
            product.setImage(request.getParameter("image"));
            product.setPrice(Float.parseFloat(request.getParameter("price")));
            product.setProductStatus(Boolean.parseBoolean(request.getParameter("productStatus")));
            boolean result = productService.save(product);
            if (result) {
                getAllProduct(request, response);
            }
        } else if (action != null && action.equals("Update")) {
            Product product=new Product();
            product.setProductId(Integer.parseInt(request.getParameter("productId")));
            product.setProductName(request.getParameter("productName"));
            product.setCatalogId(request.getParameter("catalogId"));
            product.setDescriptions(request.getParameter("descriptions"));
            product.setQuantity(Integer.parseInt(request.getParameter("quantity")));
            if(request.getParameter("image")==null||request.getParameter("image")==""){
                product.setImage(request.getParameter("oldImg"));
            }else {
                product.setImage(request.getParameter("image"));
            }
            product.setPrice(Float.parseFloat(request.getParameter("price")));
            product.setProductStatus(Boolean.parseBoolean(request.getParameter("productStatus")));
            boolean result = productService.update(product);
            if (result) {
                getAllProduct(request, response);
            }
        }
    }
}
