package project.controller;

import project.model.Service.CatalogService;
import project.model.Service.SizeService;
import project.model.Serviceimp.CatalogServiceImp;
import project.model.Serviceimp.SizeServiceImp;
import project.model.entity.Catalog;
import project.model.entity.Size;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "SizeServlet", value = "/SizeServlet")
public class SizeServlet extends HttpServlet {
    private SizeService<Size,String> sizeService=new SizeServiceImp();
    public void getAllSize(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        List<Size> sizeList=sizeService.findAll();
        request.setAttribute("sizeList",sizeList);
        request.getRequestDispatcher("views/size.jsp").forward(request,response);
    }
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action=request.getParameter("action");
        if (action != null && action.equals("size")) {
            getAllSize(request, response);
        }else if (action != null && action.equals("update")) {
            String sizeId = request.getParameter("sizeId");
            Size sizeUpdate=sizeService.findById(sizeId);
            request.setAttribute("sizeUpdate", sizeUpdate);
            request.getRequestDispatcher("views/UpdateSize.jsp").forward(request, response);
        } else if (action != null && action.equals("delete")) {
            String sizeId = request.getParameter("sizeId");
            boolean result = sizeService.delete(sizeId);
            if (result) {
                getAllSize(request,response);
            }
        }else if (action!=null&& action.equals("search")) {
            List<Size> listSearchSize=sizeService.searchByName(request.getParameter("searchName"));
            if (listSearchSize==null){
                getAllSize(request,response);
            }else {
                request.setAttribute("sizeList",listSearchSize);
                request.getRequestDispatcher("views/size.jsp").forward(request, response);
            }
        }


    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("UTF-8");
        String action = request.getParameter("action");

        if (action != null && action.equals("add")) {
            Size size=new Size();
            size.setSizeId(request.getParameter("sizeId"));
            size.setSizeName(request.getParameter("sizeName"));
            size.setSizeStatus(Boolean.parseBoolean(request.getParameter("sizeStatus")));
            boolean result = sizeService.save(size);
            if (result) {
                getAllSize(request, response);
            }
        } else if (action != null && action.equals("update")) {
            Size size=new Size();
            size.setSizeId(request.getParameter("sizeId"));
            size.setSizeName(request.getParameter("sizeName"));
            size.setSizeStatus(Boolean.parseBoolean(request.getParameter("sizeStatus")));
            boolean result = sizeService.update(size);
            if (result) {
                getAllSize(request, response);
            }
        }
    }
}
