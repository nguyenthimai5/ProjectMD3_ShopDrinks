package project.controller;

import project.model.Service.CatalogService;
import project.model.Service.ProductDetailsService;
import project.model.Service.ProductService;
import project.model.Service.SizeService;
import project.model.Serviceimp.CatalogServiceImp;
import project.model.Serviceimp.ProductDetailsServiceImp;
import project.model.Serviceimp.ProductServiceImp;
import project.model.Serviceimp.SizeServiceImp;
import project.model.entity.Catalog;
import project.model.entity.Product;
import project.model.entity.ProductDetails;
import project.model.entity.Size;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "ProductDetailsServlet", value = "/ProductDetailsServlet")
public class ProductDetailsServlet extends HttpServlet {

    private ProductDetailsService<ProductDetails,Integer> productDetailsService=new ProductDetailsServiceImp();
    private SizeService<Size,String> sizeService=new SizeServiceImp();
    private ProductService<Product,Integer> productService=new ProductServiceImp();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action=request.getParameter("action");
        if (action != null && action.equals("Update")) {
            String prDtId = request.getParameter("proDetailsId");
            ProductDetails proDtUp=productDetailsService.findById(Integer.parseInt(prDtId));
            List<Size> sizeListUp=sizeService.findAll();
            List<Product> productListUp=productService.findAll();
            request.setAttribute("productListUp",productListUp);
            request.setAttribute("proDtUp",proDtUp);
            request.setAttribute("sizeListUp",sizeListUp);
            request.getRequestDispatcher("views/updateProductDetails.jsp").forward(request,response);
        } else if (action != null && action.equals("delete")) {
            String prDtId = request.getParameter("proDetailsId");
            boolean result = productDetailsService.delete(Integer.parseInt(prDtId));
            if (result) {
                getAllProductDt(request,response);
            }
        }
         else {
            getAllProductDt(request, response);
        }
    }
    public void getAllProductDt(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        List<ProductDetails> productDetailsList=productDetailsService.findAll();
        request.setAttribute("productDetailsList",productDetailsList);
        List<Size> sizeList=sizeService.findAll();
        request.setAttribute("sizeList",sizeList);
        List<Product> productList=productService.findAll();
        request.setAttribute("productList",productList);
        request.getRequestDispatcher("views/ProductDetails.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if (action != null && action.equals("add")) {
            ProductDetails productDetails=new ProductDetails();
            productDetails.setProductId(Integer.parseInt(request.getParameter("productId")));
            productDetails.setSizeId(request.getParameter("sizeId"));
            productDetails.setPricePrDt(Float.parseFloat(request.getParameter("pricePrDt")));
            productDetails.setProDtStatus(Boolean.parseBoolean(request.getParameter("proDtStatus")));
            boolean result = productDetailsService.save(productDetails);
            if (result) {
                getAllProductDt(request, response);
            }
        } else if (action != null && action.equals("Update")) {
            ProductDetails productDetails=new ProductDetails();
            productDetails.setProDetailsId(Integer.parseInt(request.getParameter("proDetailsId")));
            productDetails.setProductId(Integer.parseInt(request.getParameter("productId")));
            productDetails.setSizeId(request.getParameter("sizeId"));
            productDetails.setPricePrDt(Float.parseFloat(request.getParameter("pricePrDt")));
            productDetails.setProDtStatus(Boolean.parseBoolean(request.getParameter("proDtStatus")));
            boolean result = productDetailsService.update(productDetails);
            if (result) {
                getAllProductDt(request, response);
            }
        }
    }
}
