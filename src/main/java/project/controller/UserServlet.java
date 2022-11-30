package project.controller;

import project.model.Service.SizeService;
import project.model.Service.UserService;
import project.model.Serviceimp.SizeServiceImp;
import project.model.Serviceimp.UserServiceImp;
import project.model.entity.Catalog;
import project.model.entity.Size;
import project.model.entity.User;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.List;

@WebServlet(name = "UserServlet", value = "/UserServlet")
public class UserServlet extends HttpServlet {
    private UserService<User,Integer> userService=new UserServiceImp();
        public void getAllUser(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        List<User> userList=userService.findAll();
        request.setAttribute("userList",userList);
        request.getRequestDispatcher("views/userAdmin.jsp").forward(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action=request.getParameter("action");
        if (action!=null&&action.equals("user")) {
            getAllUser(request, response);
        }else if (action != null && action.equals("update")) {
                String userId = request.getParameter("userId");
                User userUp=userService.findById(Integer.parseInt(userId));
                request.setAttribute("userUp", userUp);
                request.getRequestDispatcher("views/UpdateUser.jsp").forward(request, response);
            } else if (action != null && action.equals("delete")) {
                String userId = request.getParameter("userId");
                boolean result = userService.delete(Integer.parseInt(userId));
                if (result) {
                    getAllUser(request,response);
                }
            }else if (action!=null&& action.equals("search")) {
                List<User> userListSearch=userService.searchByName(request.getParameter("searchName"));

                if (userListSearch==null){
                    getAllUser(request,response);
                }else {
                    request.setAttribute("userList",userListSearch);
                    request.getRequestDispatcher("views/userAdmin.jsp").forward(request, response);
                }
            }

    }



    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if (action != null && action.equals("add")) {
            User user=new User();
            user.setUserName(request.getParameter("userName"));
            user.setPassWords(request.getParameter("passWords"));
            user.setFullName(request.getParameter("fullName"));
            user.setPhone(request.getParameter("phone"));
            user.setEmail(request.getParameter("email"));
            user.setAddress(request.getParameter("address"));
            user.setUserStatus(Boolean.parseBoolean(request.getParameter("userStatus")));
            user.setUserPemission(Boolean.parseBoolean(request.getParameter("userPemission")));
            user.setConfrimPassWords(request.getParameter("confrimPassWords"));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                user.setBirthDate(sdf.parse(request.getParameter("birthDate")));
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            user.setImageUser(request.getParameter("imageUser"));
            boolean result = userService.save(user);
            if (result) {
                getAllUser(request, response);
            }
        } else if (action != null && action.equals("update")) {
            User user=new User();
            user.setUserId(Integer.parseInt(request.getParameter("userId")));
            user.setUserName(request.getParameter("userName"));
            user.setPassWords(request.getParameter("passWords"));
            user.setFullName(request.getParameter("fullName"));
            user.setPhone(request.getParameter("phone"));
            user.setEmail(request.getParameter("email"));
            user.setAddress(request.getParameter("address"));
            user.setUserStatus(Boolean.parseBoolean(request.getParameter("userStatus")));
            user.setUserPemission(Boolean.parseBoolean(request.getParameter("userPemission")));
            user.setConfrimPassWords(request.getParameter("confrimPassWords"));
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                user.setBirthDate(sdf.parse(request.getParameter("birthDate")));
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            if(request.getParameter("imageUser")==null||request.getParameter("imageUser")==""){
                user.setImageUser(request.getParameter("oldImg"));
            }else {
                user.setImageUser(request.getParameter("imageUser"));
            }
            boolean result = userService.update(user);
            if (result) {
                getAllUser(request, response);
            }
        }else if (action!=null&&action.equals("signup")){
            String username=request.getParameter("userName");
            String pass=request.getParameter("passWords");
            String confrimPass=request.getParameter("confrimPassWords");
            String fullName=request.getParameter("fullName");
            String email=request.getParameter("email");
            String address=request.getParameter("address");
            String phone =request.getParameter("phone");
            String birthDate=request.getParameter("birthDate");
            String imageUser=request.getParameter("imageUser");
            User user=new User();
            user.setUserName(username);
            user.setPassWords(pass);
            user.setConfrimPassWords(confrimPass);
            user.setFullName(fullName);
            user.setEmail(email);
            user.setAddress(address);
            user.setPhone(phone);
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
            try {
                user.setBirthDate(sdf.parse(birthDate));
            } catch (ParseException e) {
                throw new RuntimeException(e);
            }
            user.setImageUser(imageUser);
           boolean result = userService.save(user);
           if (result){
               getAllUser(request,response);
           }
        } else if (action!=null&&action.equals("signin")) {
         User user = null;
         String name=request.getParameter("userName");
         String pass=request.getParameter("passWords");
         user=userService.login(name,pass);
         if (user!=null){
             if (user.isUserPemission()&&user.isUserStatus()){
                 request.getRequestDispatcher("views/homeAd.jsp").forward(request, response);

             }else if (user.isUserStatus()&& !user.isUserPemission()){
                 request.getRequestDispatcher("views/index.jsp").forward(request, response);
             }else {
                 request.getRequestDispatcher("views/log in sign up.jsp").forward(request, response);
             }
         }
        }

    }
}
