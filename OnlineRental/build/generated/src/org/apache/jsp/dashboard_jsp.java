package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class dashboard_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
    PreparedStatement stmt=null; Connection con=null;  ResultSet rs=null;
    int c=0,v=0,b=0,br=0,sub=0,cq=0,cv=0;
    String email=null;
    
  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write('\n');

    try{
     email=(String)session.getAttribute("eamil");
    }catch(Exception e){
        out.print("EREO");
    }
    try{
     if(email==null){
        response.sendRedirect("index.jsp");
 }
else
 

      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1\">\n");
      out.write("\t<meta name=\"description\" content=\"\">\n");
      out.write("\t<meta name=\"author\" content=\"\">\n");
      out.write("\t<meta name=\"theme-color\" content=\"#3e454c\">\n");
      out.write("\t\n");
      out.write("\t<title>Car Rental Portal | Admin Dashboard</title>\n");
      out.write("\n");
      out.write("\t<!-- Font awesome -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\t<!-- Sandstone Bootstrap CSS -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap.min.css\">\n");
      out.write("\t<!-- Bootstrap Datatables -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/dataTables.bootstrap.min.css\">\n");
      out.write("\t<!-- Bootstrap social button library -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap-social.css\">\n");
      out.write("\t<!-- Bootstrap select -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/bootstrap-select.css\">\n");
      out.write("\t<!-- Bootstrap file input -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/fileinput.min.css\">\n");
      out.write("\t<!-- Awesome Bootstrap checkbox -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/awesome-bootstrap-checkbox.css\">\n");
      out.write("\t<!-- Admin Stye -->\n");
      out.write("\t<link rel=\"stylesheet\" href=\"css/style.css\">\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("    \n");
      out.write("    ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("\t<div class=\"ts-main-content\">\n");
      out.write("        ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "leftbar.jsp", out, false);
      out.write("\n");
      out.write("\t\t<div class=\"content-wrapper\">\n");
      out.write("\t\t\t<div class=\"container-fluid\">\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<h2 class=\"page-title\">Dashboard</h2>\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body bk-primary text-light\">\n");
	
   try{
        String sql="SELECT id from tblusers "; 
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","root");
        stmt=con.prepareStatement(sql);
        rs=stmt.executeQuery();
        while(rs.next()){c++;}    
   }catch(Exception e){
      
        out.print("EREO1");
   }

      out.write("\n");
      out.write("        <div class=\"stat-panel-number h1 \">");
      out.print(c);
      out.write("</div>\n");
      out.write("\t<div class=\"stat-panel-title text-uppercase\">Reg Users</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\t<a href=\"reg-users.jsp\" class=\"block-anchor panel-footer\">Full Detail <i class=\"fa fa-arrow-right\"></i></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t<div class=\"panel-body bk-success text-light\">\n");
      out.write("\t\t<div class=\"stat-panel text-center\">\n");
      out.write("\t\t\n");
	
   try{
        String sql="SELECT id from tblvehicles "; 
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","root");
        stmt=con.prepareStatement(sql);
        rs=stmt.executeQuery();
        while(rs.next()){v++;}    
   }catch(Exception e){      
       
        out.print("EREO1");
   
   
   }  

      out.write("\n");
      out.write("                    <div class=\"stat-panel-number h1 \"><?php echo htmlentities($totalvehicle);?></div>\n");
      out.write("\t\t<div class=\"stat-panel-title text-uppercase\">Listed Vehicles</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\n");
      out.write("                    <a href=\"manage-vehicles.php\" class=\"block-anchor panel-footer text-center\">Full Detail &nbsp; <i class=\"fa fa-arrow-right\"></i></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t<div class=\"panel-body bk-info text-light\">\n");
      out.write("\t\t\t\t<div class=\"stat-panel text-center\">\n");
      out.write("                                    \n");
      out.write("                                    \t\t\n");
	
   try{
        String sql="SELECT id from tblbooking "; 
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","root");
        stmt=con.prepareStatement(sql);
        rs=stmt.executeQuery();
        while(rs.next()){b++;}    
   }catch(Exception e){
        out.print("EREO1");
      
   }  	
      out.write("\n");
      out.write("                <div class=\"stat-panel-number h1 \">");
      out.print(b);
      out.write("</div>\n");
      out.write("\t\t<div class=\"stat-panel-title text-uppercase\">Total Bookings</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t<a href=\"manage-bookings.php\" class=\"block-anchor panel-footer text-center\">Full Detail &nbsp; <i class=\"fa fa-arrow-right\"></i></a>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t<div class=\"panel-body bk-warning text-light\">\n");
      out.write("\t\t<div class=\"stat-panel text-center\">\n");
      out.write("\t\t\n");
	
   try{
        String sql="SELECT id from tblbrands "; 
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","root");
        stmt=con.prepareStatement(sql);
        rs=stmt.executeQuery();
        while(rs.next()){br++;}    
   }catch(Exception e){
        out.print("EREO1");
      
   }  

      out.write("\n");
      out.write("    <div class=\"stat-panel-number h1 \">");
      out.print(br);
      out.write("</div>\n");
      out.write("    <div class=\"stat-panel-title text-uppercase\">Listed Brands</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t<a href=\"manage-brands.php\" class=\"block-anchor panel-footer text-center\">Full Detail &nbsp; <i class=\"fa fa-arrow-right\"></i></a>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("<div class=\"row\">\n");
      out.write("        <div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body bk-primary text-light\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"stat-panel text-center\">\n");
	
   try{
        String sql="SELECT id from tblsubscribers "; 
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","root");
        stmt=con.prepareStatement(sql);
        rs=stmt.executeQuery();
        while(rs.next()){sub++;}    
   }catch(Exception e){
            out.print("EREO1");
   
   }  

      out.write("\n");
      out.write("\t<div class=\"stat-panel-number h1 \">");
      out.print(sub);
      out.write("</div>\n");
      out.write("\t<div class=\"stat-panel-title text-uppercase\">Subscibers</div>\n");
      out.write("\t</div>\n");
      out.write("    </div>\n");
      out.write("        <a href=\"manage-subscribers.php\" class=\"block-anchor panel-footer\">Full Detail <i class=\"fa fa-arrow-right\"></i></a>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<div class=\"panel-body bk-success text-light\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"stat-panel text-center\">\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t\t<div class=\"stat-panel text-center\">\n");
	
   try{
        String sql="SELECT id from tblcontactusquery "; 
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","root");
        stmt=con.prepareStatement(sql);
        rs=stmt.executeQuery();
        while(rs.next()){cq++;}    
   }catch(Exception e){
            out.print("EREO1");
   
   }  
      out.write("\n");
      out.write("\t\t\t\t<div class=\"stat-panel-number h1 \"><?php echo htmlentities($query);?></div>\n");
      out.write("\t\t\t\t<div class=\"stat-panel-title text-uppercase\">Queries</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<a href=\"manage-conactusquery.php\" class=\"block-anchor panel-footer text-center\">Full Detail &nbsp; <i class=\"fa fa-arrow-right\"></i></a>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t\t<div class=\"col-md-3\">\n");
      out.write("\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t<div class=\"panel-body bk-info text-light\">\n");
      out.write("\t\t\t\t<div class=\"stat-panel text-center\">\n");
	
   try{
        String sql="SELECT id from tbltestimonial"; 
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","root");
        stmt=con.prepareStatement(sql);
        rs=stmt.executeQuery();
        while(rs.next()){cv++;}   
   }catch(Exception e){ out.print("EEE"); }

      out.write("\n");
      out.write("\t<div class=\"stat-panel-number h1 \">");
      out.print(cv);
      out.write("</div>\n");
      out.write("        <div class=\"stat-panel-title text-uppercase\">Testimonials</div>\n");
      out.write("                </div>\n");
      out.write("\t\t</div>\n");
      out.write("\t<a href=\"testimonials.php\" class=\"block-anchor panel-footer text-center\">Full Detail &nbsp; <i class=\"fa fa-arrow-right\"></i></a>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
 }
    catch(Exception e){
        out.print("INDSLD"+e);
    }

      out.write("\n");
      out.write("\t<!-- Loading Scripts -->\n");
      out.write("\t<script src=\"js/jquery.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap-select.min.js\"></script>\n");
      out.write("\t<script src=\"js/bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/jquery.dataTables.min.js\"></script>\n");
      out.write("\t<script src=\"js/dataTables.bootstrap.min.js\"></script>\n");
      out.write("\t<script src=\"js/Chart.min.js\"></script>\n");
      out.write("\t<script src=\"js/fileinput.js\"></script>\n");
      out.write("\t<script src=\"js/chartData.js\"></script>\n");
      out.write("\t<script src=\"js/main.js\"></script>\n");
      out.write("\t<script>\n");
      out.write("\t\t\n");
      out.write("\twindow.onload = function(){\n");
      out.write("    \n");
      out.write("\t\t// Line chart from swirlData for dashReport\n");
      out.write("\t\tvar ctx = document.getElementById(\"dashReport\").getContext(\"2d\");\n");
      out.write("\t\twindow.myLine = new Chart(ctx).Line(swirlData, {\n");
      out.write("\t\t\tresponsive: true,\n");
      out.write("\t\t\tscaleShowVerticalLines: false,\n");
      out.write("\t\t\tscaleBeginAtZero : true,\n");
      out.write("\t\t");
      out.write("\n");
      out.write("\t\t\n");
      out.write("\t\t// Pie Chart from doughutData\n");
      out.write("\t\tvar doctx = document.getElementById(\"chart-area3\").getContext(\"2d\");\n");
      out.write("\t\twindow.myDoughnut = new Chart(doctx).Pie(doughnutData, {responsive : true});\n");
      out.write("\n");
      out.write("\t\t// Dougnut Chart from doughnutData\n");
      out.write("\t\tvar doctx = document.getElementById(\"chart-area4\").getContext(\"2d\");\n");
      out.write("\t\twindow.myDoughnut = new Chart(doctx).Doughnut(doughnutData, {responsive : true});\n");
      out.write("\n");
      out.write("\t}\n");
      out.write("\t</script>\n");
      out.write("</body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
