/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import dal.ProductDAO;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import model.Account;
import model.Category;
import model.Product;

/**
 *
 * @author anhqu
 */
public class UpdateProductByAdmin extends HttpServlet {

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
            out.println("<title>Servlet UpdateProductByAdmin</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet UpdateProductByAdmin at " + request.getContextPath() + "</h1>");
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
         HttpSession session = request.getSession();
        Account a = (Account) session.getAttribute("acc");
        if (a.getId() != 1 || a == null) {
            PrintWriter out = response.getWriter();
            out.println("access denied");
        } else { 
        String pid = request.getParameter("pid");
        ProductDAO d = new ProductDAO();;       
        Product p = d.getProductbyID(pid); 
        List<Category> listC = d.getAllCategory();
       
        request.setAttribute("listC", listC);
        request.setAttribute("detail", p);      
        request.getRequestDispatcher("update.jsp").forward(request, response);
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
         String pid = request.getParameter("id");
         String pname = request.getParameter("name");
         String description = request.getParameter("description");
         String image = request.getParameter("image");
         String price = request.getParameter("price");
         String title = request.getParameter("title");
         String quantity = request.getParameter("quantity");
         String categori = request.getParameter("categori");
        HttpSession session = request.getSession();
        Account a = (Account) session.getAttribute("acc");
        ProductDAO d = new ProductDAO();
        d.updateProduct(pid, pname, image, price, title, description,quantity, categori);
        response.sendRedirect("management");
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
