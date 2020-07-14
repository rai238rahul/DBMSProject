<%-- 
    Document   : index.jsp
    Created on : 4 Jun, 2020, 11:11:33 AM
    Author     : vinit
--%>
<%@page import="com.DBConnection"%>
<%@ page import="java.sql.*" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    String email=(String)session.getAttribute("email");
    if(email!=null){
        //response.sendRedirect("index.jsp");
        }else{
            //response.sendRedirect("index.jsp");
    }
%>
<%! 
    Connection con=null;
    PreparedStatement stmt=null;
    ResultSet rs=null;
    int  modelYear=0,seatingCapacity=0,pricePerDay=0,id=0,status=0;
    String fuelType=null,Testimonial=null;
    String vehicleTitle=null,brandName=null,vehicleOverview=null,image=null,fullName=null;
%>
<%
try{  
    Class.forName("com.mysql.jdbc.Driver");
    out.print("DRIVER LOADED");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","root");
  }
catch(Exception e){
    out.print("ERRORWQ"+e);
}
%>
<jsp:include page="config.jsp"/>
<!DOCTYPE HTML>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta name="keywords" content="">
<meta name="description" content="">
<title>Car Rental Portal</title>
<!--Bootstrap -->
<link rel="stylesheet" href="assets/css/bootstrap.min.css" type="text/css">
<link rel="stylesheet" href="assets/css/style.css" type="text/css">
<link rel="stylesheet" href="assets/css/owl.carousel.css" type="text/css">
<link rel="stylesheet" href="assets/css/owl.transitions.css" type="text/css">
<link href="assets/css/slick.css" rel="stylesheet">
<link href="assets/css/bootstrap-slider.min.css" rel="stylesheet">
<link href="assets/css/font-awesome.min.css" rel="stylesheet">
<link rel="stylesheet" id="switcher-css" type="text/css" href="assets/switcher/css/switcher.css" media="all" />
<link rel="alternate stylesheet" type="text/css" href="assets/switcher/css/red.css" title="red" media="all" data-default-color="true" />
<link rel="alternate stylesheet" type="text/css" href="assets/switcher/css/orange.css" title="orange" media="all" />
<link rel="alternate stylesheet" type="text/css" href="assets/switcher/css/blue.css" title="blue" media="all" />
<link rel="alternate stylesheet" type="text/css" href="assets/switcher/css/pink.css" title="pink" media="all" />
<link rel="alternate stylesheet" type="text/css" href="assets/switcher/css/green.css" title="green" media="all" />
<link rel="alternate stylesheet" type="text/css" href="assets/switcher/css/purple.css" title="purple" media="all" />
<link rel="apple-touch-icon-precomposed" sizes="144x144" href="assets/images/favicon-icon/apple-touch-icon-144-precomposed.png">
<link rel="apple-touch-icon-precomposed" sizes="114x114" href="assets/images/favicon-icon/apple-touch-icon-114-precomposed.html">
<link rel="apple-touch-icon-precomposed" sizes="72x72" href="assets/images/favicon-icon/apple-touch-icon-72-precomposed.png">
<link rel="apple-touch-icon-precomposed" href="assets/images/favicon-icon/apple-touch-icon-57-precomposed.png">
<link rel="shortcut icon" href="assets/images/favicon-icon/favicon.png">
<link href="https://fonts.googleapis.com/css?family=Lato:300,400,700,900" rel="stylesheet"> 
</head>
<body>

<!-- Start Switcher -->
<jsp:include page="colorswitcher.jsp" />
<%--<?php include('includes/colorswitcher.php');?>--%>
<!-- /Switcher -->  
        
<!--Header-->
<jsp:include page="header.jsp" />
<%-- <?php include('includes/header.php');?> --%>
<!-- /Header --> 

<!-- Banners -->
<section id="banner" class="banner-section">
  <div class="container">
    <div class="div_zindex">
      <div class="row">
        <div class="col-md-5 col-md-push-7">
          <div class="banner_content">
            <h1>Find the right car for you.</h1>
            <p>We have more than a thousand cars for you to choose. </p>
            <a href="#" class="btn">Read More <span class="angle_arrow"><i class="fa fa-angle-right" aria-hidden="true"></i></span></a> </div>
        </div>
      </div>
    </div>
  </div>
</section>
<!-- /Banners --> 
<!-- Resent Cat-->
<section class="section-padding gray-bg">
  <div class="container">
    <div class="section-header text-center">
      <h2>Find the Best <span>CarForYou</span></h2>
      <p>There are many variations of passages of Lorem Ipsum available, but the majority have suffered alteration in some form, by injected humour, or randomised words which don't look even slightly believable. If you are going to use a passage of Lorem Ipsum, you need to be sure there isn't anything embarrassing hidden in the middle of text.</p>
    </div>
    <div class="row"> 
      
      <!-- Nav tabs -->
      <div class="recent-tab">
        <ul class="nav nav-tabs" role="tablist">
          <li role="presentation" class="active"><a href="#resentnewcar" role="tab" data-toggle="tab">New Car</a></li>
        </ul>
      </div>
      <!-- Recently Listed New Cars -->
      <div class="tab-content">
        <div role="tabpanel" class="tab-pane active" id="resentnewcar">
<%
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
    
%>
<div class="col-list-3">
<div class="recent-car-list">
    <div class="car-info-box"> <a href="vehicle-details.jsp?vhid=<%=id%>"><img src="admin/img/vehicleimages/<%=image%>" class="img-responsive" alt="imageAS"></a>
<ul>
    <li><i class="fa fa-car" aria-hidden="true"></i><%=fuelType%></li>
    <li><i class="fa fa-calendar" aria-hidden="true"></i><%= modelYear%> Model</li>
    <li><i class="fa fa-user" aria-hidden="true"></i><%=seatingCapacity%> seats</li>
</ul>
</div>
<div class="car-title-m">
    <h6><a href="vehicle-details.jsp?vhid=<%=id%>"> <%= brandName%> , <%=vehicleTitle%></a></h6>
<span class="price">Rs.<%=pricePerDay%>/Day</span> 
</div>
    <div class="inventory_info_m">
       <p><%=vehicleTitle%></p> <p><%=vehicleOverview%> </p>
          <% if(status==1) out.print("NOT AVAILABLE");%>
    </div> 
</div>
</div>
<%
 }  
}
  catch(Exception e){
          out.print("ERRORR ");
    }
%>
        </div>
      </div>
  </div>
</section>
<!-- /Resent Cat --> 
<!-- Fun Facts-->
<section class="fun-facts-section">
  <div class="container div_zindex">
    <div class="row">
      <div class="col-lg-3 col-xs-6 col-sm-3">      
        <div class="fun-facts-m">
          <div class="cell">
            <h2><i class="fa fa-calendar" aria-hidden="true"></i>40+</h2>
            <p>Years In Business</p>
          </div>
        </div>
      </div>
      <div class="col-lg-3 col-xs-6 col-sm-3">
        <div class="fun-facts-m">
          <div class="cell">
            <h2><i class="fa fa-car" aria-hidden="true"></i>1200+</h2>
            <p>New Cars For Sale</p>
          </div>
        </div>
      </div>
      <div class="col-lg-3 col-xs-6 col-sm-3">
        <div class="fun-facts-m">
          <div class="cell">
            <h2><i class="fa fa-car" aria-hidden="true"></i>1000+</h2>
            <p>Used Cars For Sale</p>
          </div>
        </div>
      </div>
      <div class="col-lg-3 col-xs-6 col-sm-3">
        <div class="fun-facts-m">
          <div class="cell">
            <h2><i class="fa fa-user-circle-o" aria-hidden="true"></i>600+</h2>
            <p>Satisfied Customers</p>
          </div>
        </div>
      </div>
    </div>
  </div>
  <!-- Dark Overlay-->
  <div class="dark-overlay"> </div>
</section>
<!-- /Fun Facts--> 
<!--Testimonial -->
<section class="section-padding testimonial-section parallex-bg">
  <div class="container div_zindex">
    <div class="section-header white-text text-center">
      <h2>OuR Satisfied <span>Customers<%=email%></span></h2>
    </div>
    <div class="row">
      <div id="testimonial-slider">
          <%
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
        
       %>     
    
          <div class="testimonial-m">
          <div class="testimonial-img"> <img src="assets/images/cat-profil.png" alt="NOT" /> </div>
          <div class="testimonial-content">
            <div class="testimonial-heading">
              <h5><%=fullName%></h5>
            <p><%=Testimonial%></p>
          </div>
        </div>
        </div>
   </div>
    </div>
  </div>
  <%}
            catch(Exception e){
            }
  %>
  <!-- Dark Overlay-->
  <div class="dark-overlay"></div>
</section>
<!-- /Testimonial--> 


<!--Footer -->

<jsp:include page="footer.jsp" />
<%-- <?php include('includes/footer.php'); ?>--%>
<!-- /Footer--> 

<!--Back to top-->
<div id="back-top" class="back-top"> <a href="#top"><i class="fa fa-angle-up" aria-hidden="true"></i> </a> </div>
<!--/Back to top--> 

<!--Login-Form -->

 <jsp:include page="login.jsp" /> 
<?php include('includes/login.php');?>
<!--/Login-Form --> 

<!--Register-Form -->

 <jsp:include page="registration.jsp" /> 
<?php include('includes/registration.php');?>

<!--/Register-Form --> 

<!--Forgot-password-Form -->

<jsp:include page="forgotpassword.jsp" />
<?php include('includes/forgotpassword.php');?>
<!--/Forgot-password-Form --> 

<!-- Scripts --> 
<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script> 
<script src="assets/js/interface.js"></script> 
<!--Switcher-->
<script src="assets/switcher/js/switcher.js"></script>
<!--bootstrap-slider-JS--> 
<script src="assets/js/bootstrap-slider.min.js"></script> 
<!--Slider-JS--> 
<script src="assets/js/slick.min.js"></script> 
<script src="assets/js/owl.carousel.min.js"></script>

</body>

<!-- Mirrored from themes.webmasterdriver.net/carforyou/demo/index.html by HTTrack Website Copier/3.x [XR&CO'2014], Fri, 16 Jun 2017 07:22:11 GMT -->
</html>