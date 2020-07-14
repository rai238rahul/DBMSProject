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
public class ManageBooking extends HttpServlet {

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
       // processRequest(request, response);
                HttpSession session=request.getSession();
                PrintWriter out=response.getWriter();
                String email=(String)session.getAttribute("email");
                if(!"admin@gmail.com".equals(email)){
                    //response.sendRedirect("index.jsp");
                        out.print("ERROR ");    
                }
                String eid=request.getParameter("eid");
                String aeid=request.getParameter("aeid");
                if(aeid!=null){
                    
                    int status=1;
                    try{
                    String sql= "UPDATE tblbooking SET Status=1  WHERE  VehicleId='"+aeid+"'";
                    String sql1= "UPDATE tblvehicles SET Status='"+status+"' WHERE  id='"+aeid+"'";
                    Connection con = DBConnection.getConnection();
                    PreparedStatement ps=con.prepareStatement(sql);
                    PreparedStatement ps1=con.prepareStatement(sql1);
                    ps.executeUpdate();
                    ps1.executeUpdate();
                    String msg="CONFIRMED";
                    response.sendRedirect("manage-bookings.jsp?msg="+msg);
                    }
                    catch(Exception e){
                        out.print("ERROR"+e);
                    }
               
                } else if (eid!=null){
                    int status=2,vstatus=0;
                    try{
                    String sql= "UPDATE tblbooking SET Status='"+status+"' WHERE  VehicleId='"+eid+"'";
                    String sql1= "UPDATE tblvehicles SET Status='"+vstatus+"' WHERE  id='"+eid+"'";
                    Connection con = DBConnection.getConnection();
                    PreparedStatement ps=con.prepareStatement(sql);
                    PreparedStatement ps1=con.prepareStatement(sql1);
                    ps.executeUpdate();
                    ps1.executeUpdate();
                    String msg="CANCELLED";
                    response.sendRedirect("manage-bookings.jsp?msg="+msg);
                    }
                    catch(Exception e){
                    out.print("ERROR"+e);
                    }
                }
                else{
                    response.sendRedirect("index.jsp");
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
