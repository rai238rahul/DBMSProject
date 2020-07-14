package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import com.DBConnection;
import java.sql.*;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

 
    Connection con=null;
    PreparedStatement stmt=null;
    ResultSet rs=null;
    int  modelYear=0,seatingCapacity=0,pricePerDay=0,id=0,status=0;
    String fuelType=null,Testimonial=null;
    String vehicleTitle=null,brandName=null,vehicleOverview=null,image=null,fullName=null;

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

    String email=(String)session.getAttribute("email");
    if(email!=null){
        //response.sendRedirect("index.jsp");
        }else{
            //response.sendRedirect("index.jsp");
    }

      out.write('\n');
      out.write('\n');

try{  
    Class.forName("com.mysql.jdbc.Driver");
    out.print("DRIVER LOADED");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","root");
  }
catch(Exception e){
    out.print("ERRORWQ"+e);
}

      out.write('\n');
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "config.jsp", out, false);
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE HTML>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\">\n");
      out.write("<meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width,initial-scale=1\">\n");
      out.write("<meta name=\"keywords\" content=\"\">\n");
      out.write("<meta name=\"description\" content=\"\">\n");
      out.write("<title>Car Rental Portal</title>\n");
      out.write("<!--Bootstrap -->\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/bootstrap.min.css\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/style.css\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/owl.carousel.css\" type=\"text/css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"assets/css/owl.transitions.css\" type=\"text/css\">\n");
      out.write("<link href=\"assets/css/slick.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"assets/css/bootstrap-slider.min.css\" rel=\"stylesheet\">\n");
      out.write("<link href=\"assets/css/font-awesome.min.css\" rel=\"stylesheet\">\n");
      out.write("<link rel=\"stylesheet\" id=\"switcher-css\" type=\"text/css\" href=\"assets/switcher/css/switcher.css\" media=\"all\" />\n");
      out.write("<link rel=\"alternate stylesheet\" type=\"text/css\" href=\"assets/switcher/css/red.css\" title=\"red\" media=\"all\" data-default-color=\"true\" />\n");
      out.write("<link rel=\"alternate stylesheet\" type=\"text/css\" href=\"assets/switcher/css/orange.css\" title=\"orange\" media=\"all\" />\n");
      out.write("<link rel=\"alternate stylesheet\" type=\"text/css\" href=\"assets/switcher/css/blue.css\" title=\"blue\" media=\"all\" />\n");
      out.write("<link rel=\"alternate stylesheet\" type=\"text/css\" href=\"assets/switcher/css/pink.css\" title=\"pink\" media=\"all\" />\n");
      out.write("<link rel=\"alternate stylesheet\" type=\"text/css\" href=\"assets/switcher/css/green.css\" title=\"green\" media=\"all\" />\n");
      out.write("<link rel=\"alternate stylesheet\" type=\"text/css\" href=\"assets/switcher/css/purple.css\" title=\"purple\" media=\"all\" />\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"144x144\" href=\"assets/images/favicon-icon/apple-touch-icon-144-precomposed.png\">\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"114x114\" href=\"assets/images/favicon-icon/apple-touch-icon-114-precomposed.html\">\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" sizes=\"72x72\" href=\"assets/images/favicon-icon/apple-touch-icon-72-precomposed.png\">\n");
      out.write("<link rel=\"apple-touch-icon-precomposed\" href=\"assets/images/favicon-icon/apple-touch-icon-57-precomposed.png\">\n");
      out.write("<link rel=\"shortcut icon\" href=\"assets/images/favicon-icon/favicon.png\">\n");
      out.write("<link href=\"https://fonts.googleapis.com/css?family=Lato:300,400,700,900\" rel=\"stylesheet\"> \n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("\n");
      out.write("<!-- Start Switcher -->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "colorswitcher.jsp", out, false);
      out.write('\n');
      out.write("\n");
      out.write("<!-- /Switcher -->  \n");
      out.write("        \n");
      out.write("<!--Header-->\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "header.jsp", out, false);
      out.write('\n');
      out.write("\n");
      out.write("<!-- /Header --> \n");
      out.write("\n");
      out.write("<!-- Banners -->\n");
      out.write("<section id=\"banner\" class=\"banner-section\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"div_zindex\">\n");
      out.write("      <div class=\"row\">\n");
      out.write("        <div class=\"col-md-5 col-md-push-7\">\n");
      out.write("          <div class=\"banner_content\">\n");
      out.write("            <h1>Find the right car for you.</h1>\n");
      out.write("            <p>We have more than a thousand cars for you to choose. </p>\n");
      out.write("            <a href=\"#\" class=\"btn\">Read More <span class=\"angle_arrow\"><i class=\"fa fa-angle-right\" aria-hidden=\"true\"></i></span></a> </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("<!-- /Banners --> \n");
      out.write("<!-- Resent Cat-->\n");
      out.write("<section class=\"section-padding gray-bg\">\n");
      out.write("  <div class=\"container\">\n");
      out.write("    <div class=\"section-header text-center\">\n");
      out.write("      <h2>Find the Best <span>CarForYou</span></h2>\n");
      out.write("      <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text.</p>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\"> \n");
      out.write("      \n");
      out.write("      <!-- Nav tabs -->\n");
      out.write("      <div class=\"recent-tab\">\n");
      out.write("        <ul class=\"nav nav-tabs\" role=\"tablist\">\n");
      out.write("          <li role=\"presentation\" class=\"active\"><a href=\"#resentnewcar\" role=\"tab\" data-toggle=\"tab\">New Car</a></li>\n");
      out.write("        </ul>\n");
      out.write("      </div>\n");
      out.write("      <!-- Recently Listed New Cars -->\n");
      out.write("      <div class=\"tab-content\">\n");
      out.write("        <div role=\"tabpanel\" class=\"tab-pane active\" id=\"resentnewcar\">\n");

      try{
   String sql="SELECT tblvehicles.VehiclesTitle,tblvehicles.status,tblbrands.BrandName,tblvehicles.PricePerDay,tblvehicles.FuelType,tblvehicles.ModelYear,tblvehicles.id,tblvehicles.SeatingCapacity,tblvehicles.VehiclesOverview,tblvehicles.Vimage1 from tblvehicles join tblbrands on tblbrands.id=tblvehicles.VehiclesBrand";
   stmt= con.prepareStatement(sql);
   rs=stmt.executeQuery(); 
   while(rs.next())
    {
            fuelType=rs.getString("FuelType");
            id=rs.getInt("id");
            modelYear =rs.getInt("ModelYear");
            seatingCapacity=rs.getInt("SeatingCapacity");
            pricePerDay=rs.getInt("PricePerDay");
            brandName=rs.getString("BrandName");
            vehicleTitle =rs.getString("VehiclesTitle");
            vehicleOverview=rs.getString("VehiclesOverview");
            image=rs.getString("Vimage1");
            status=rs.getInt("status");
    

      out.write("\n");
      out.write("<div class=\"col-list-3\">\n");
      out.write("<div class=\"recent-car-list\">\n");
      out.write("    <div class=\"car-info-box\"> <a href=\"vehicle-details.jsp?vhid=");
      out.print(id);
      out.write("\"><img src=\"admin/img/vehicleimages/");
      out.print(image);
      out.write("\" class=\"img-responsive\" alt=\"imageAS\"></a>\n");
      out.write("<ul>\n");
      out.write("    <li><i class=\"fa fa-car\" aria-hidden=\"true\"></i>");
      out.print(fuelType);
      out.write("</li>\n");
      out.write("    <li><i class=\"fa fa-calendar\" aria-hidden=\"true\"></i>");
      out.print( modelYear);
      out.write(" Model</li>\n");
      out.write("    <li><i class=\"fa fa-user\" aria-hidden=\"true\"></i>");
      out.print(seatingCapacity);
      out.write(" seats</li>\n");
      out.write("</ul>\n");
      out.write("</div>\n");
      out.write("<div class=\"car-title-m\">\n");
      out.write("    <h6><a href=\"vehicle-details.jsp?vhid=");
      out.print(id);
      out.write("\"> ");
      out.print( brandName);
      out.write(" , ");
      out.print(vehicleTitle);
      out.write("</a></h6>\n");
      out.write("<span class=\"price\">Rs.");
      out.print(pricePerDay);
      out.write("/Day</span> \n");
      out.write("</div>\n");
      out.write("    <div class=\"inventory_info_m\">\n");
      out.write("       <p>");
      out.print(vehicleTitle);
      out.write("</p> <p>");
      out.print(vehicleOverview);
      out.write(" </p>\n");
      out.write("          ");
 if(status==1) out.print("NOT AVAILABLE");
      out.write("\n");
      out.write("    </div> \n");
      out.write("</div>\n");
      out.write("</div>\n");

 }  
}
  catch(Exception e){
          out.print("ERRORR ");
    }

      out.write("\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("  </div>\n");
      out.write("</section>\n");
      out.write("<!-- /Resent Cat --> \n");
      out.write("<!-- Fun Facts-->\n");
      out.write("<section class=\"fun-facts-section\">\n");
      out.write("  <div class=\"container div_zindex\">\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div class=\"col-lg-3 col-xs-6 col-sm-3\">      \n");
      out.write("        <div class=\"fun-facts-m\">\n");
      out.write("          <div class=\"cell\">\n");
      out.write("            <h2><i class=\"fa fa-calendar\" aria-hidden=\"true\"></i>40+</h2>\n");
      out.write("            <p>Years In Business</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-lg-3 col-xs-6 col-sm-3\">\n");
      out.write("        <div class=\"fun-facts-m\">\n");
      out.write("          <div class=\"cell\">\n");
      out.write("            <h2><i class=\"fa fa-car\" aria-hidden=\"true\"></i>1200+</h2>\n");
      out.write("            <p>New Cars For Sale</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-lg-3 col-xs-6 col-sm-3\">\n");
      out.write("        <div class=\"fun-facts-m\">\n");
      out.write("          <div class=\"cell\">\n");
      out.write("            <h2><i class=\"fa fa-car\" aria-hidden=\"true\"></i>1000+</h2>\n");
      out.write("            <p>Used Cars For Sale</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("      <div class=\"col-lg-3 col-xs-6 col-sm-3\">\n");
      out.write("        <div class=\"fun-facts-m\">\n");
      out.write("          <div class=\"cell\">\n");
      out.write("            <h2><i class=\"fa fa-user-circle-o\" aria-hidden=\"true\"></i>600+</h2>\n");
      out.write("            <p>Satisfied Customers</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  <!-- Dark Overlay-->\n");
      out.write("  <div class=\"dark-overlay\"> </div>\n");
      out.write("</section>\n");
      out.write("<!-- /Fun Facts--> \n");
      out.write("<!--Testimonial -->\n");
      out.write("<section class=\"section-padding testimonial-section parallex-bg\">\n");
      out.write("  <div class=\"container div_zindex\">\n");
      out.write("    <div class=\"section-header white-text text-center\">\n");
      out.write("      <h2>OuR Satisfied <span>Customers");
      out.print(email);
      out.write("</span></h2>\n");
      out.write("    </div>\n");
      out.write("    <div class=\"row\">\n");
      out.write("      <div id=\"testimonial-slider\">\n");
      out.write("          ");

              int tid=1;
              String sql ="SELECT tbltestimonial.Testimonial,tblusers.FullName from tbltestimonial join tblusers on tbltestimonial.UserEmail=tblusers.EmailId where tbltestimonial.status=1";
        try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){  
                fullName=rs.getString("FullName");
                ///out.print(fullName); 
            
                Testimonial=rs.getString("Testimonial");
                //out.print(fullName); 
            }
        
       
      out.write("     \n");
      out.write("    \n");
      out.write("          <div class=\"testimonial-m\">\n");
      out.write("          <div class=\"testimonial-img\"> <img src=\"assets/images/cat-profil.png\" alt=\"NOT\" /> </div>\n");
      out.write("          <div class=\"testimonial-content\">\n");
      out.write("            <div class=\"testimonial-heading\">\n");
      out.write("              <h5>");
      out.print(fullName);
      out.write("</h5>\n");
      out.write("            <p>");
      out.print(Testimonial);
      out.write("</p>\n");
      out.write("          </div>\n");
      out.write("        </div>\n");
      out.write("        </div>\n");
      out.write("   </div>\n");
      out.write("    </div>\n");
      out.write("  </div>\n");
      out.write("  ");
}
            catch(Exception e){
            }
  
      out.write("\n");
      out.write("  <!-- Dark Overlay-->\n");
      out.write("  <div class=\"dark-overlay\"></div>\n");
      out.write("</section>\n");
      out.write("<!-- /Testimonial--> \n");
      out.write("\n");
      out.write("\n");
      out.write("<!--Footer -->\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "footer.jsp", out, false);
      out.write('\n');
      out.write("\n");
      out.write("<!-- /Footer--> \n");
      out.write("\n");
      out.write("<!--Back to top-->\n");
      out.write("<div id=\"back-top\" class=\"back-top\"> <a href=\"#top\"><i class=\"fa fa-angle-up\" aria-hidden=\"true\"></i> </a> </div>\n");
      out.write("<!--/Back to top--> \n");
      out.write("\n");
      out.write("<!--Login-Form -->\n");
      out.write("\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "login.jsp", out, false);
      out.write(" \n");
      out.write("<?php include('includes/login.php');?>\n");
      out.write("<!--/Login-Form --> \n");
      out.write("\n");
      out.write("<!--Register-Form -->\n");
      out.write("\n");
      out.write(" ");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "registration.jsp", out, false);
      out.write(" \n");
      out.write("<?php include('includes/registration.php');?>\n");
      out.write("\n");
      out.write("<!--/Register-Form --> \n");
      out.write("\n");
      out.write("<!--Forgot-password-Form -->\n");
      out.write("\n");
      org.apache.jasper.runtime.JspRuntimeLibrary.include(request, response, "forgotpassword.jsp", out, false);
      out.write("\n");
      out.write("<?php include('includes/forgotpassword.php');?>\n");
      out.write("<!--/Forgot-password-Form --> \n");
      out.write("\n");
      out.write("<!-- Scripts --> \n");
      out.write("<script src=\"assets/js/jquery.min.js\"></script>\n");
      out.write("<script src=\"assets/js/bootstrap.min.js\"></script> \n");
      out.write("<script src=\"assets/js/interface.js\"></script> \n");
      out.write("<!--Switcher-->\n");
      out.write("<script src=\"assets/switcher/js/switcher.js\"></script>\n");
      out.write("<!--bootstrap-slider-JS--> \n");
      out.write("<script src=\"assets/js/bootstrap-slider.min.js\"></script> \n");
      out.write("<!--Slider-JS--> \n");
      out.write("<script src=\"assets/js/slick.min.js\"></script> \n");
      out.write("<script src=\"assets/js/owl.carousel.min.js\"></script>\n");
      out.write("\n");
      out.write("</body>\n");
      out.write("\n");
      out.write("<!-- Mirrored from themes.webmasterdriver.net/carforyou/demo/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 16 Jun 2017 07:22:11 GMT -->\n");
      out.write("</html>");
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
