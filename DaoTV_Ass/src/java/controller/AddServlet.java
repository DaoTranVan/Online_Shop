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
import java.util.Locale.Category;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.InfoLab;
import model.InfoPC;
import model.Products;

/**
 *
 * @author ADMIN
 */
public class AddServlet extends HttpServlet {

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
            out.println("<title>Servlet AddServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet AddServlet at " + request.getContextPath() + "</h1>");
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
        String pid_raw = request.getParameter("pid");
        String name = request.getParameter("name");
        String cid_raw = request.getParameter("cid");
        String img = request.getParameter("img");
        String price = request.getParameter("price");
        String quantity_raw = request.getParameter("quantity");
        int pid,cid,quantity;
        try {
            pid=Integer.parseInt(pid_raw);
            cid=Integer.parseInt(cid_raw);
            quantity=Integer.parseInt(quantity_raw);
            DAO d = new DAO();
            Products p1 = d.getProductByID(pid);
            HttpSession session=request.getSession();
            session.setAttribute("pid", p1);
            if(p1!=null){
                String er = pid+ "exsited!!!";
                request.setAttribute("error", er);
                request.getRequestDispatcher("new.jsp").forward(request, response);
            }
            else{
                Products p = new Products(pid, name, cid, img, price,quantity);
                d.insertP(p);
//                if(cid==1){
//                    
//                }
//                else if(cid==2){
//                    response.sendRedirect("newl.jsp");
//                    String cpu = request.getParameter("cpu");
//                    String gpu = request.getParameter("gpu");
//                    String manhinh = request.getParameter("manhinh");
//                    String hedieuhanh = request.getParameter("hedieuhanh");
//                    String ram = request.getParameter("ram");
//                    String ssd = request.getParameter("ssd");
//                    String hdd = request.getParameter("hdd");
//                    String lan = request.getParameter("lan");
//                    String wlan = request.getParameter("wlan");
//                    String congketnoi = request.getParameter("congketnoi");
//                    String banphim = request.getParameter("banphim");
//                    String pin = request.getParameter("pin");
//                    String kichthuoc = request.getParameter("kichthuoc");
//                    String trongluong = request.getParameter("trongluong");
//                    InfoLab il = new InfoLab(pid,cpu, gpu, manhinh, hedieuhanh, ram, ssd, hdd, lan, wlan, congketnoi, banphim, pin, kichthuoc, trongluong);
//                    d.insertIL(il);
//                    
//                }
                response.sendRedirect("home");
            }
                    
        } catch (NumberFormatException e) {
            System.out.println(e);
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
