package project.controller;

import project.model.Service.ProductService;
import project.model.Service.SizeService;
import project.model.Service.UserService;
import project.model.Service.WishListService;
import project.model.Serviceimp.ProductServiceImp;
import project.model.Serviceimp.SizeServiceImp;
import project.model.Serviceimp.UserServiceImp;
import project.model.Serviceimp.WishlistServiceImp;
import project.model.entity.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "WishListServlet", value = "/WishListServlet")
public class WishListServlet extends HttpServlet {

    private WishListService<WishList,Integer> wishListService=new WishlistServiceImp();
    private UserService<User,Integer> userService=new UserServiceImp();
    private ProductService<Product,Integer> productService=new ProductServiceImp();

    public void getAllWishList(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        List<Product> productList=productService.findAllProductStatus();
        List<User> userList=userService.findAllUserStatus();
        List<WishList> wishLists=wishListService.findAll();
        request.setAttribute("productList",productList);
        request.setAttribute("userList",userList);
        request.setAttribute("wishLists",wishLists);
        request.getRequestDispatcher("views/wishlistAd.jsp").forward(request,response);
    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action=request.getParameter("action");
        if (action != null && action.equals("wishlist")) {
            getAllWishList(request, response);

        } else  if (action != null && action.equals("update")) {
            String wId = request.getParameter("wishlistId");
            WishList wishListUp=wishListService.findById(Integer.parseInt(wId));
            List<Product> productListUp=productService.findAllProductStatus();
            List<User> userListUp=userService.findAllUserStatus();
            request.setAttribute("wishListUp",wishListUp);
            request.setAttribute("productListUp",productListUp);
            request.setAttribute("userListUp",userListUp);
            request.getRequestDispatcher("views/updateWishList.jsp").forward(request,response);
        } else if (action != null && action.equals("delete")) {
            String wId = request.getParameter("wishlistId");
            boolean result = wishListService.delete(Integer.parseInt(wId));
            if (result) {
                getAllWishList(request,response);
            }
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if (action != null && action.equals("add")) {
            WishList wishList=new WishList();
            wishList.setProductId(Integer.parseInt(request.getParameter("productId")));
            wishList.setUserId(Integer.parseInt(request.getParameter("userId")));
            wishList.setWishlistStatus(Boolean.parseBoolean(request.getParameter("wishlistStatus")));
            boolean result=wishListService.save(wishList);
            if (result) {
                getAllWishList(request, response);
            }
        } else if (action != null && action.equals("update")) {
            WishList wishList=new WishList();
            wishList.setProductId(Integer.parseInt(request.getParameter("productId")));
            wishList.setUserId(Integer.parseInt(request.getParameter("userId")));
            wishList.setWishlistId(Integer.parseInt(request.getParameter("wishlistId")));
            wishList.setWishlistStatus(Boolean.parseBoolean(request.getParameter("wishlistStatus")));
            boolean result=wishListService.update(wishList);
            if (result) {
                getAllWishList(request, response);
            }
        }
    }
}
