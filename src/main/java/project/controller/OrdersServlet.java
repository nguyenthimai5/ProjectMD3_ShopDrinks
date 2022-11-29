package project.controller;

import project.model.Service.ContactService;
import project.model.Service.OrderService;
import project.model.Service.UserService;
import project.model.Serviceimp.ContactServiceImp;
import project.model.Serviceimp.OrderServiceImp;
import project.model.Serviceimp.UserServiceImp;
import project.model.entity.*;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@WebServlet(name = "OrdersServlet", value = "/OrdersServlet")
public class OrdersServlet extends HttpServlet {
    private UserService<User,Integer> userService=new UserServiceImp();
    private OrderService<Orders,Integer> orderService=new OrderServiceImp();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action=request.getParameter("action");
        if (action != null && action.equals("update")) {
            String ordersId = request.getParameter("ordersId");
            Orders ordersUp=orderService.findById(Integer.parseInt(ordersId));
            List<User> userListUp=userService.findAll();
            request.setAttribute("userListUp",userListUp);
            request.setAttribute("ordersUp", ordersUp);
            request.getRequestDispatcher("views/updateCatalog.jsp").forward(request, response);
        } else if (action != null && action.equals("delete")) {
            String ordersId = request.getParameter("ordersId");
            boolean result = orderService.delete(Integer.parseInt(ordersId));
            if (result) {
                getAllOsder(request,response);
            }
        }else if (action!=null&& action.equals("search")) {
            List<Orders> ordersListSearch=orderService.searchByName(request.getParameter("searchName"));
            if (ordersListSearch==null){
                getAllOsder(request,response);
            }else {
                request.setAttribute("ordersList",ordersListSearch);
                request.getRequestDispatcher("views/Orders.jsp").forward(request, response);
            }

        } else {
            getAllOsder(request, response);
        }
    }
    public void getAllOsder(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        List<Orders> ordersList=orderService.findAll();
        List<User> userList=userService.findAll();
        request.setAttribute("userList",userList);
        request.setAttribute("ordersList",ordersList);
        request.getRequestDispatcher("views/Orders.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if (action != null && action.equals("add")) {
            Orders orders=new Orders();
            orders.setUserId(Integer.parseInt(request.getParameter("userId")));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                orders.setCreateDate(sdf.parse(request.getParameter("createDate")));
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            orders.setTotalAmount(Float.parseFloat(request.getParameter("totalAmount")));
            orders.setQuantity(Integer.parseInt(request.getParameter("quantity")));
            orders.setPhone(request.getParameter("phone"));
            orders.setAddress(request.getParameter("address"));
            orders.setOrderStatus(Integer.parseInt(request.getParameter("orderStatus")));
            boolean result = orderService.save(orders);
            if (result) {
                getAllOsder(request, response);
            }
        } else if (action != null && action.equals("Update")) {
            Orders orders=new Orders();
            orders.setUserId(Integer.parseInt(request.getParameter("userId")));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                orders.setCreateDate(sdf.parse(request.getParameter("createDate")));
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            orders.setTotalAmount(Float.parseFloat(request.getParameter("totalAmount")));
            orders.setQuantity(Integer.parseInt(request.getParameter("quantity")));
            orders.setPhone(request.getParameter("phone"));
            orders.setAddress(request.getParameter("address"));
            orders.setOrderStatus(Integer.parseInt(request.getParameter("orderStatus")));
            boolean result = orderService.update(orders);
            if (result) {
                getAllOsder(request, response);
            }
        }
    }
}
