/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import com.DBConnection;
import com.mysql.cj.protocol.Resultset;
import java.io.IOException;
import java.io.PrintWriter;
import static java.lang.System.out;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 *
 * @author vinit
 */
public class ProfileUpdate extends HttpServlet {

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
        processRequest(request, response);
            PrintWriter out = response.getWriter();
  
           String fullname=null,address=null,city=null,phone=null,country=null,dob=null;
            fullname=request.getParameter("fullname");
            city=request.getParameter("city");
            phone=request.getParameter("mobilenumber");
            dob=request.getParameter("dob");
            country=request.getParameter("country");
            address=request.getParameter("address");
            //String email=request.getParameter("email");
            HttpSession  session=request.getSession();
            String email=(String)session.getAttribute("email");
            if(email==null){
     
            }
            else{
                String sql="update tblusers set FullName=?,address=?,city=?,country=?,contactNo=?,dob=? where Emailid=?";
                Connection con = DBConnection.getConnection();
                PreparedStatement ps;
            try {
                ps = con.prepareStatement(sql);
                ps.setString(1, fullname);
                ps.setString(2, address);
                ps.setString(3, city);
                ps.setString(4, country);
                ps.setString(5, phone);
                ps.setString(6, dob);
                ps.setString(7, email);
                int rs= ps.executeUpdate();
                if(rs>0){
                    response.sendRedirect("profile.jsp");
                }else{
                    response.sendRedirect("index.jsp");
                }
            }catch(Exception e){
                        out.print("ERROR"+e);
            }
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
