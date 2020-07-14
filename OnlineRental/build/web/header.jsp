<%-- 
    Document   : header
    Created on : 4 Jun, 2020, 11:45:37 AM
    Author     : vinit
--%>
<%@page import="java.sql.*"%>
<%@page import="com.DBConnection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!String email=null;%>
<header>
  <div class="default-header">
    <div class="container">
      <div class="row">
        <div class="col-sm-3 col-md-2">
          <div class="logo"> <a href="index.jsp"><img src="assets/images/logo.png" alt="image"/></a> </div>
        </div>
        <div class="col-sm-9 col-md-10">
          <div class="header_info">
            <div class="header_widgets">
              <div class="circle_icon"> <i class="fa fa-envelope" aria-hidden="true"></i> </div>
              <p class="uppercase_text">For Support Mail us : </p>
              <a href="mailto:info@example.com">info@phtpoint.com</a> </div>
            <div class="header_widgets">
              <div class="circle_icon"> <i class="fa fa-phone" aria-hidden="true"></i> </div>
              <p class="uppercase_text">Service Helpline Call Us: </p>
              <a href="tel:61-1234-5678-09">+91-7828879725</a> </div>
            <div class="social-follow">
           </div>
   <%
     email=(String)session.getAttribute("email");
    if(email==null){%>
 <div class="login_btn"> <a href="#loginform" class="btn btn-xs uppercase" data-toggle="modal" data-dismiss="modal">Login / Register</a> </div>   
     <%   }else{
            //response.sendRedirect("index.jsp");
            out.print("Welcome To Car rental portal");
        }
%>          </div>
        </div>
      </div>
    </div>
  </div>
  
  <!-- Navigation -->
  <nav id="navigation_bar" class="navbar navbar-default">
    <div class="container">
      <div class="navbar-header">
        <button id="menu_slide" data-target="#navigation" aria-expanded="false" data-toggle="collapse" class="navbar-toggle collapsed" type="button"> <span class="sr-only">Toggle navigation</span> <span class="icon-bar"></span> <span class="icon-bar"></span> <span class="icon-bar"></span> </button>
      </div>
      <div class="header_wrap">
        <div class="user_login">
          <ul>
            <li class="dropdown"> <a href="#" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false"><i class="fa fa-user-circle" aria-hidden="true"></i> 
<%
   String sql="SELECT FullName FROM tblusers WHERE EmailId='"+email+"'";
    try {
            Connection con = DBConnection.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs=ps.executeQuery();
            while(rs.next()){
                String fullName=rs.getString("FullName");
                out.print(fullName); 

            }
      }    
    catch(Exception e){
        out.print("ERROR");
    }


 
                    %>   <i class="fa fa-angle-down" aria-hidden="true"></i></a>
                <ul class="dropdown-menu">
          
         
<%                      if(email!=null){
          %>
                          
            <li><a href="profile.jsp">Profile Settings</a></li>
              <li><a href="update-password.php">Update Password</a></li>
            <li><a href="my-booking.jsp">My Booking</a></li>
            <li><a href="post-testimonial.jsp">Post a Testimonial</a></li>
          <li><a href="my-testimonials.jsp">My Testimonial</a></li>
            <li><a href="logout.jsp">Sign Out</a></li>
            <% //<?php} else { ?>
                }else{
                    %>
            <li><a href="#loginform"  data-toggle="modal" data-dismiss="modal">Profile Settings</a></li>
              <li><a href="#loginform"  data-toggle="modal" data-dismiss="modal">Update Password</a></li>
            <li><a href="#loginform"  data-toggle="modal" data-dismiss="modal">My Booking</a></li>
            <li><a href="#loginform"  data-toggle="modal" data-dismiss="modal">Post a Testimonial</a></li>
          <li><a href="#loginform"  data-toggle="modal" data-dismiss="modal">My Testimonial</a></li>
            <li><a href="#loginform"  data-toggle="modal" data-dismiss="modal">Sign Out</a></li>
             <%  //<?php } ?>
                }        %>
          </ul>
            </li>
          </ul>
        </div>
        <div class="header_search">
          <div id="search_toggle"><i class="fa fa-search" aria-hidden="true"></i></div>
          <form action="#" method="get" id="header-search-form">
            <input type="text" placeholder="Search..." class="form-control">
            <button type="submit"><i class="fa fa-search" aria-hidden="true"></i></button>
          </form>
        </div>
      </div>
      <div class="collapse navbar-collapse" id="navigation">
        <ul class="nav navbar-nav">
          <li><a href="index.jsp">Home</a>    </li>       	 
          <li><a href="page.php?type=aboutus">About Us</a></li>
          <li><a href="car-listing.jsp">Car Listing</a>
          <li><a href="page.php?type=faqs">FAQs</a></li>
          <li><a href="contact-us.jsp">Contact Us</a></li>
        </ul>
      </div>
    </div>
  </nav>
  <!-- Navigation end -->   
</header>