package org.apache.jsp.admin;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;

public final class manage_002dboooking_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {


    Connection con=null;
    PreparedStatement stmt=null;
    ResultSet rs=null;
 
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
      out.write("\n");
      out.write('\n');

    String email=(String)session.getAttribute("email");
    if(email==null) response.sendRedirect("index.jsp");      
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","root");
    String sql="SELECT * from tblusers where EmailId='"+email+"'";
    stmt=con.prepareStatement(sql);
    rs=stmt.executeQuery();
    while(rs.next()){
    }
    }catch(Exception e){}

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<?php\n");
      out.write("session_start();\n");
      out.write("error_reporting(0);\n");
      out.write("include('includes/config.php');\n");
      out.write("if(strlen($_SESSION['alogin'])==0)\t{\t\n");
      out.write("header('location:index.php');\n");
      out.write("}\n");
      out.write("else{\n");
      out.write("if(isset($_REQUEST['eid']))\n");
      out.write("\t{\n");
      out.write("$eid=intval($_GET['eid']);\n");
      out.write("$status=\"2\";\n");
      out.write("$sql = \"UPDATE tblbooking SET Status=:status WHERE  id=:eid\";\n");
      out.write("$query = $dbh->prepare($sql);\n");
      out.write("$query -> bindParam(':status',$status, PDO::PARAM_STR);\n");
      out.write("$query-> bindParam(':eid',$eid, PDO::PARAM_STR);\n");
      out.write("$query -> execute();\n");
      out.write("\n");
      out.write("$msg=\"Booking Successfully Cancelled\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write("if(isset($_REQUEST['aeid']))\n");
      out.write("\t{\n");
      out.write("$aeid=intval($_GET['aeid']);\n");
      out.write("$status=1;\n");
      out.write("\n");
      out.write("$sql = \"UPDATE tblbooking SET Status=:status WHERE  id=:aeid\";\n");
      out.write("$query = $dbh->prepare($sql);\n");
      out.write("$query -> bindParam(':status',$status, PDO::PARAM_STR);\n");
      out.write("$query-> bindParam(':aeid',$aeid, PDO::PARAM_STR);\n");
      out.write("$query -> execute();\n");
      out.write("\n");
      out.write("$msg=\"Booking Successfully Confirmed\";\n");
      out.write("}\n");
      out.write("\n");
      out.write("\n");
      out.write(" ?>\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\" class=\"no-js\">\n");
      out.write("\n");
      out.write("<head>\n");
      out.write("\t<meta charset=\"UTF-8\">\n");
      out.write("\t<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1\">\n");
      out.write("\t<meta name=\"description\" content=\"\">\n");
      out.write("\t<meta name=\"author\" content=\"\">\n");
      out.write("\t<meta name=\"theme-color\" content=\"#3e454c\">\n");
      out.write("\t\n");
      out.write("\t<title>Car Rental Portal |Admin Manage testimonials   </title>\n");
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
      out.write("  <style>\n");
      out.write("\t\t.errorWrap {\n");
      out.write("    padding: 10px;\n");
      out.write("    margin: 0 0 20px 0;\n");
      out.write("    background: #fff;\n");
      out.write("    border-left: 4px solid #dd3d36;\n");
      out.write("    -webkit-box-shadow: 0 1px 1px 0 rgba(0,0,0,.1);\n");
      out.write("    box-shadow: 0 1px 1px 0 rgba(0,0,0,.1);\n");
      out.write("}\n");
      out.write(".succWrap{\n");
      out.write("    padding: 10px;\n");
      out.write("    margin: 0 0 20px 0;\n");
      out.write("    background: #fff;\n");
      out.write("    border-left: 4px solid #5cb85c;\n");
      out.write("    -webkit-box-shadow: 0 1px 1px 0 rgba(0,0,0,.1);\n");
      out.write("    box-shadow: 0 1px 1px 0 rgba(0,0,0,.1);\n");
      out.write("}\n");
      out.write("\t\t</style>\n");
      out.write("\n");
      out.write("</head>\n");
      out.write("\n");
      out.write("<body>\n");
      out.write("\t<?php include('includes/header.php');?>\n");
      out.write("\n");
      out.write("\t<div class=\"ts-main-content\">\n");
      out.write("\t\t<?php include('includes/leftbar.php');?>\n");
      out.write("\t\t<div class=\"content-wrapper\">\n");
      out.write("\t\t\t<div class=\"container-fluid\">\n");
      out.write("\n");
      out.write("\t\t\t\t<div class=\"row\">\n");
      out.write("\t\t\t\t\t<div class=\"col-md-12\">\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<h2 class=\"page-title\">Manage Bookings</h2>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<!-- Zero Configuration Table -->\n");
      out.write("\t\t\t\t\t\t<div class=\"panel panel-default\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-heading\">Bookings Info</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"panel-body\">\n");
      out.write("\t\t\t\t\t\t\t<?php if($error){?><div class=\"errorWrap\"><strong>ERROR</strong>:<?php echo htmlentities($error); ?> </div><?php } \n");
      out.write("\t\t\t\telse if($msg){?><div class=\"succWrap\"><strong>SUCCESS</strong>:<?php echo htmlentities($msg); ?> </div><?php }?>\n");
      out.write("\t\t\t\t\t\t\t\t<table id=\"zctb\" class=\"display table table-striped table-bordered table-hover\" cellspacing=\"0\" width=\"100%\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>#</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Name</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Vehicle</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>From Date</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>To Date</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Message</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Status</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Posting date</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Action</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</thead>\n");
      out.write("\t\t\t\t\t\t\t\t\t<tfoot>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>#</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<th>Name</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Vehicle</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>From Date</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>To Date</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Message</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Status</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Posting date</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<th>Action</th>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t</tfoot>\n");
      out.write("\t\t\t\t\t\t\t\t\t<tbody>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t<?php $sql = \"SELECT tblusers.FullName,tblbrands.BrandName,tblvehicles.VehiclesTitle,tblbooking.FromDate,tblbooking.ToDate,tblbooking.message,tblbooking.VehicleId as vid,tblbooking.Status,tblbooking.PostingDate,tblbooking.id  from tblbooking join tblvehicles on tblvehicles.id=tblbooking.VehicleId join tblusers on tblusers.EmailId=tblbooking.userEmail join tblbrands on tblvehicles.VehiclesBrand=tblbrands.id  \";\n");
      out.write("$query = $dbh -> prepare($sql);\n");
      out.write("$query->execute();\n");
      out.write("$results=$query->fetchAll(PDO::FETCH_OBJ);\n");
      out.write("$cnt=1;\n");
      out.write("if($query->rowCount() > 0)\n");
      out.write("{\n");
      out.write("foreach($results as $result)\n");
      out.write("{\t\t\t\t?>\t\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><?php echo htmlentities($cnt);?></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><?php echo htmlentities($result->FullName);?></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><a href=\"edit-vehicle.php?id=<?php echo htmlentities($result->vid);?>\"><?php echo htmlentities($result->BrandName);?> , <?php echo htmlentities($result->VehiclesTitle);?></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><?php echo htmlentities($result->FromDate);?></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><?php echo htmlentities($result->ToDate);?></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><?php echo htmlentities($result->message);?></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><?php \n");
      out.write("if($result->Status==0)\n");
      out.write("{\n");
      out.write("echo htmlentities('Not Confirmed yet');\n");
      out.write("} else if ($result->Status==1) {\n");
      out.write("echo htmlentities('Confirmed');\n");
      out.write("}\n");
      out.write(" else{\n");
      out.write(" \techo htmlentities('Cancelled');\n");
      out.write(" }\n");
      out.write("\t\t\t\t\t\t\t\t\t\t?></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\t<td><?php echo htmlentities($result->PostingDate);?></td>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<td><a href=\"manage-bookings.php?aeid=<?php echo htmlentities($result->id);?>\" onclick=\"return confirm('Do you really want to Confirm this booking')\"> Confirm</a> /\n");
      out.write("\n");
      out.write("\n");
      out.write("<a href=\"manage-bookings.php?eid=<?php echo htmlentities($result->id);?>\" onclick=\"return confirm('Do you really want to Cancel this Booking')\"> Cancel</a>\n");
      out.write("</td>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t\t\t</tr>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t<?php $cnt=$cnt+1; }} ?>\n");
      out.write("\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\t\t\t</tbody>\n");
      out.write("\t\t\t\t\t\t\t\t</table>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t</div>\n");
      out.write("\t</div>\n");
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
      out.write("</body>\n");
      out.write("</html>\n");
      out.write("<?php } ?>\n");
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
