/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.DBConnection;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vinit
 */
public class ManageRegistration extends HttpServlet {

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
            out.println("<title>Servlet ManageRegistration</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet ManageRegistration at " + request.getContextPath() + "</h1>");
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
        processRequest(request, response);
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
        //processRequest(request, response);
            PrintWriter out=response.getWriter();
                String fullName=request.getParameter("fullname");
                String email=request.getParameter("emailid");
                String mobile=request.getParameter("mobileno");
                String password=request.getParameter("password");
                String msg="Success",msg1="Fail";    
                    try{
                    String sql= "insert into tblusers (FullName,EmailId,Password,Contactno)values(?,?,?,?)";
                    Connection con = DBConnection.getConnection();
                    PreparedStatement ps=con.prepareStatement(sql);
                    ps.setString(1, fullName);
                    ps.setString(2, email);
                    ps.setString(3, password);
                    ps.setString(4,mobile);
                    int rs=ps.executeUpdate();//();
                    if(rs!=0)
                       response.sendRedirect("index.jsp?reg="+msg);
                    else
                        response.sendRedirect("index.jsp?reg="+msg1);
                    }catch(Exception e){
                        out.print("ERROR"+e);
                    }
               
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
