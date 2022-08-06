/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.CategoryDAO;
import dal.DAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.Categories;
import model.Products;

/**
 *
 * @author ADMIN
 */
public class HomeServlet extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet TabServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet TabServlet at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        String id_raw = request.getParameter("id");
        int id;
        if (id_raw == null) {
            id = 0;
        } else {
            id = Integer.parseInt(id_raw);
        }
        DAO d = new DAO();
        if (id == 0) {
            List<Products> list1 = d.getAll();
            int page, numberpage = 12;
            int size = list1.size();
            int num = (size % 12 == 0 ? (size / 12) : ((size / 12) + 1));//so trang
            String xpage = request.getParameter("page");
            if (xpage == null) {
                page = 1;
            } else {
                page = Integer.parseInt(xpage);
            }
            int start, end;
            start = (page - 1) * numberpage;
            end = Math.min(page * numberpage, size);
            List<Products> list = d.getListByPage(list1, start, end);
            request.setAttribute("data", list);
            request.setAttribute("page", page);
            request.setAttribute("num", num);
            request.setAttribute("id", id);
            CategoryDAO cdb = new CategoryDAO();
            List<Categories> list2 = cdb.getAll();
            request.setAttribute("data1", list2);
            request.getRequestDispatcher("home.jsp").forward(request, response);
        } else {
            List<Products> list1 = d.getByCatID(id);
            int page, numberpage = 12;
            int size = list1.size();
            int num = (size % 12 == 0 ? (size / 12) : ((size / 12) + 1));//so trang
            String xpage = request.getParameter("page");
            if (xpage == null) {
                page = 1;
            } else {
                page = Integer.parseInt(xpage);
            }
            int start, end;
            start = (page - 1) * numberpage;
            end = Math.min(page * numberpage, size);
            List<Products> list = d.getListByPage(list1, start, end);
            request.setAttribute("data", list);
            request.setAttribute("page", page);
            request.setAttribute("num", num);
            request.setAttribute("id", id);

            CategoryDAO cdb = new CategoryDAO();
            List<Categories> list2 = cdb.getAll();
            request.setAttribute("data1", list2);
            request.getRequestDispatcher("products.jsp").forward(request, response);
        }

    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
