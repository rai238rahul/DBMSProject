<%-- 
    Document   : vehicle-details
    Created on : 10 Jun, 2020, 12:03:16 PM
    Author     : vinit
--%>
<%@page import="com.DBConnection"%>
<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%!
    PreparedStatement stmt=null; Connection con=null; String email=null; ResultSet rs=null;
    int bid=0,pricePerDay=0,id=0,modelYear=0,seatingCapacity=0;
    String Vimage1=null,Vimage2=null,Vimage3=null,Vimage4=null,Vimage5=null,image=null;
    String brandName=null,vehicleTitle=null,fuelType=null,vehicleOverview=null,vhid=null;
    int AirConditioner=0,CrashSensor=0, AntiLockBrakingSystem=0, PowerWindows=0,   PowerSteering=0,
    CDPlayer=0,LeatherSeats=0,  CentralLocking=0,BrakeAssist=0,PassengerAirbag=0,DriverAirbag=0,PowerDoorLocks=0;
%>
<%
        email=(String)session.getAttribute("email");
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","root");
%>
<%--  <?php 
session_start();
include('includes/config.php');
error_reporting(0);
if(isset($_POST['submit']))
{
$fromdate=$_POST['fromdate'];
$todate=$_POST['todate']; 
$message=$_POST['message'];
$useremail=$_SESSION['login'];
$status=0;
$vhid=$_GET['vhid'];
$sql="INSERT INTO  tblbooking(userEmail,VehicleId,FromDate,ToDate,message,Status) VALUES(:useremail,:vhid,:fromdate,:todate,:message,:status)";
$query = $dbh->prepare($sql);
$query->bindParam(':useremail',$useremail,PDO::PARAM_STR);
$query->bindParam(':vhid',$vhid,PDO::PARAM_STR);
$query->bindParam(':fromdate',$fromdate,PDO::PARAM_STR);
$query->bindParam(':todate',$todate,PDO::PARAM_STR);
$query->bindParam(':message',$message,PDO::PARAM_STR);
$query->bindParam(':status',$status,PDO::PARAM_STR);
$query->execute();
$lastInsertId = $dbh->lastInsertId();
if($lastInsertId)
{
echo "<script>alert('Booking successfull.');</script>";
}
else 
{
echo "<script>alert('Something went wrong. Please try again');</script>";
}
}
?>
--%>
<!DOCTYPE HTML>
<html lang="en">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width,initial-scale=1">
<meta name="keywords" content="">
<meta name="description" content="">
<title>Car Rental Port | Vehicle Details</title>
<!--Bootstrap -->
<link rel="stylesheet" href="assets/css/bootstrap.min.css" type="text/css">
<!--Custome Style -->
<link rel="stylesheet" href="assets/css/style.css" type="text/css">
<!--OWL Carousel slider-->
<link rel="stylesheet" href="assets/css/owl.carousel.css" type="text/css">
<link rel="stylesheet" href="assets/css/owl.transitions.css" type="text/css">
<!--slick-slider -->
<link href="assets/css/slick.css" rel="stylesheet">
<!--bootstrap-slider -->
<link href="assets/css/bootstrap-slider.min.css" rel="stylesheet">
<!--FontAwesome Font Style -->
<link href="assets/css/font-awesome.min.css" rel="stylesheet">

<!-- SWITCHER -->
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
<?php include('includes/colorswitcher.php');?>
<!-- /Switcher -->  

<!--Header-->

<jsp:include page="header.jsp" />
<?php include('includes/header.php');?>
<!-- /Header --> 

<!--Listing-Image-Slider-->
<%
   try{
    vhid=request.getParameter("vhid");
    out.print(vhid);
    String sql= "SELECT tblvehicles.*,tblbrands.BrandName,tblbrands.id as bid  "
            + "from tblvehicles join tblbrands on"
            + " tblbrands.id=tblvehicles.VehiclesBrand where tblvehicles.id='" + vhid + "' ";
    
    
    stmt = con.prepareStatement(sql);
    rs=stmt.executeQuery();
    while(rs.next()){
  // String sbid=rs.getString("bid");
    brandName =rs.getString("BrandName");
    pricePerDay=rs.getInt("PricePerDay");
    vehicleTitle =rs.getString("BrandName");
    fuelType=rs.getString("FuelType");
    id=rs.getInt("id");
    modelYear =rs.getInt("ModelYear");
    seatingCapacity=rs.getInt("SeatingCapacity");
    pricePerDay=rs.getInt("PricePerDay");
    brandName=rs.getString("BrandName");
    vehicleTitle =rs.getString("VehiclesTitle");
    vehicleOverview=rs.getString("VehiclesOverview");
    AirConditioner =rs.getInt("AirConditioner");
    CrashSensor=rs.getInt("CrashSensor");
    AntiLockBrakingSystem=rs.getInt("AntiLockBrakingSystem");
    PowerWindows=rs.getInt("PowerWindows");
    PowerSteering=rs.getInt("PowerSteering");
    CDPlayer=rs.getInt("CDPlayer");
    LeatherSeats=rs.getInt("LeatherSeats");
    CentralLocking=rs.getInt("CentralLocking");
    DriverAirbag=rs.getInt("DriverAirbag");
    PassengerAirbag=rs.getInt("PassengerAirbag");
    PowerDoorLocks=rs.getInt("PowerDoorLocks");
    out.print(PowerDoorLocks);
    Vimage2=rs.getString("Vimage2");
    Vimage3=rs.getString("Vimage3");
    Vimage4=rs.getString("Vimage4");
    Vimage1=rs.getString("Vimage1");
    Vimage5=rs.getString("Vimage5");

    }
%>
<section id="listing_img_slider">
    <div><img src="admin/img/vehicleimages/<%=Vimage1%>" style="align-content: center   " class="img-responsive" alt="image" width="300" height="200></div>
  <%-- <div><img src="admin/img/vehicleimages/<%=Vimage2%>" class="img-responsive" alt="image" width="200" height="200"></div>
       <div><img src="admin/img/vehicleimages/<%=Vimage3%>" class="img-responsive" alt="image" width="200" height="200"></div>
        <div><img src="admin/img/vehicleimages/<%=Vimage4%>" class="img-responsive"  alt="image" width="200" height="200"></div>
  --%>
  <%  if(Vimage5=="")
    {
    }
      else {
  %>
   <div><img src="admin/img/vehicleimages/<%=Vimage5%>" class="img-responsive" alt="image" width="200" height="200"></div>
  <%
 }
}catch(Exception e){
    out.print("ERROR"+e);
}
  %>
</section>
<!--/Listing-Image-Slider-->
<!--Listing-detail-->
<section class="listing-detail">
  <div class="container">
    <div class="listing_detail_head row">
      <div class="col-md-9">
        <h2> <%=brandName%>,<%=vehicleTitle%>;</h2>
      </div>
      <div class="col-md-3">
        <div class="price_info">
          <p> <%=pricePerDay%> </p>Per Day        
        </div>
      </div>
    </div>
    <div class="row">
      <div class="col-md-9">
        <div class="main_features">
          <ul>
          
            <li> <i class="fa fa-calendar" aria-hidden="true"></i>
              <h5> <%=modelYear%> </h5>
              <p>Reg.Year</p>
            </li>
            <li> <i class="fa fa-cogs" aria-hidden="true"></i>
              <h5><%=fuelType%></h5>
              <p>Fuel Type</p>
            </li>
       
            <li> <i class="fa fa-user-plus" aria-hidden="true"></i>
              <h5> <%= seatingCapacity %></h5>
              <p>Seats</p>
            </li>
          </ul>
        </div>
        <div class="listing_more_info">
          <div class="listing_detail_wrap"> 
            <!-- Nav tabs -->
            <ul class="nav nav-tabs gray-bg" role="tablist">
              <li role="presentation" class="active"><a href="#vehicle-overview " aria-controls="vehicle-overview" role="tab" data-toggle="tab">Vehicle Overview </a></li>
              <li role="presentation"><a href="#accessories" aria-controls="accessories" role="tab" data-toggle="tab">Accessories</a></li>
            </ul>
            <!-- Tab panes -->
            <div class="tab-content"> 
              <!-- vehicle-overview -->
              <div role="tabpanel" class="tab-pane active" id="vehicle-overview">
                <p> <%= vehicleOverview %> <%=email%> ></p>
                              <!-- Accessories -->
              <div role="tabpanel" class="tab-pane" id="accessories"> 
                <!--Accessories-->
                <table>
                  <thead>
                    <tr>  <th colspan="2">Accessories</th>
                    </tr>
                  </thead>
                  <tbody>
                    <tr>
                      <td>Air Conditioner</td>
                    <%
                        out.print(AirConditioner);
                        if(AirConditioner==1)
                        {
                        %>
                      <td><i class="fa fa-check" aria-hidden="true"></i></td>
                <% } else { %> 
                        <td><i class="fa fa-close" aria-hidden="true"></i></td>
                 <% } %> </tr>

                <tr>
<td>AntiLock Braking System</td>
<% if(AntiLockBrakingSystem==1)
{
%>
<td><i class="fa fa-check" aria-hidden="true"></i></td>
<% } else {%>
<td><i class="fa fa-close" aria-hidden="true"></i></td>
<% } %>
   </tr>
<tr>
<td>Power Steering</td>
<% if( PowerSteering==1)
{
%>
<td><i class="fa fa-check" aria-hidden="true"></i></td>
<% } else { %>
<td><i class="fa fa-close" aria-hidden="true"></i></td>
<% } %>
</tr>
   <tr>
<td>Power Windows</td>
<% if(PowerWindows==1)
{
%>
<td><i class="fa fa-check" aria-hidden="true"></i></td>
<% } else { %>
<td><i class="fa fa-close" aria-hidden="true"></i></td>
<% } %>
</tr>
                   
 <tr>
<td>CD Player</td>
<% if(CDPlayer==1)
{
%>
<td><i class="fa fa-check" aria-hidden="true"></i></td>
<% } else { %>
<td><i class="fa fa-close" aria-hidden="true"></i></td>
<% } %>
</tr>
<tr>
<td>Leather Seats</td>
<% if(LeatherSeats==1)
{
%>
<td><i class="fa fa-check" aria-hidden="true"></i></td>
<% } else { %>
<td><i class="fa fa-close" aria-hidden="true"></i></td>
<% } %>
</tr>
<tr>
<td>Central Locking</td>
<% if(CentralLocking==1)
{
%>
<td><i class="fa fa-check" aria-hidden="true"></i></td>
<% } else { %>
<td><i class="fa fa-close" aria-hidden="true"></i></td>
<% } %>
</tr>
<tr>
<td>Power Door Locks</td>
<% if(PowerDoorLocks==1)
{
%>
<td><i class="fa fa-check" aria-hidden="true"></i></td>
<% } else { %>
<td><i class="fa fa-close" aria-hidden="true"></i></td>
<% } %>
                    </tr>
                    <tr>
<td>Brake Assist</td>
<% if( BrakeAssist==1)
{
%>
<td><i class="fa fa-check" aria-hidden="true"></i></td>
<%  } else { %>
<td><i class="fa fa-close" aria-hidden="true"></i></td>
<% } %>
</tr>

<tr>
<td>Driver Airbag</td>
<% if(DriverAirbag==1)
{
%>
<td><i class="fa fa-check" aria-hidden="true"></i></td>
<% } else { %>
<td><i class="fa fa-close" aria-hidden="true"></i></td>
<% } %>
 </tr>
 
 <tr>
 <td>Passenger Airbag</td>
 <% if( PassengerAirbag==1)
{
%>
<td><i class="fa fa-check" aria-hidden="true"></i></td>
<% } else {%>
<td><i class="fa fa-close" aria-hidden="true"></i></td>
<% }%>
</tr>
<tr>
<td>Crash Sensor</td>
<% if( CrashSensor==1)
{
%>
<td><i class="fa fa-check" aria-hidden="true"></i></td>
<%} else { %>
<td><i class="fa fa-close" aria-hidden="true"></i></td>
<% } %>
</tr>
                  </tbody>
                </table>
              </div>
            </div>
          </div>
          
        </div>
 </div>
<%-- }} --%>
   
      </div>
      
      <!--Side-Bar-->
      <aside class="col-md-3">
      
        <div class="share_vehicle">
          <p>Share: <a href="#"><i class="fa fa-facebook-square" aria-hidden="true"></i></a> <a href="#"><i class="fa fa-twitter-square" aria-hidden="true"></i></a> <a href="#"><i class="fa fa-linkedin-square" aria-hidden="true"></i></a> <a href="#"><i class="fa fa-google-plus-square" aria-hidden="true"></i></a> </p>
        </div>
        <div class="sidebar_widget">
          <div class="widget_heading">
            <h5><i class="fa fa-envelope" aria-hidden="true"></i>Book Now</h5>
          </div>
            <form method="post" action="BookingController?vhid=+<%=id%>" >
            <div class="form-group">
                <input type="date" class="form-control" name="fromdate" placeholder="From Date(dd/mm/yyyy)" required min="<% new java.util.Date();%>">
            </div>
            <div class="form-group">
                <input type="date" class="form-control" name="todate" placeholder="To Date(dd/mm/yyyy)" required max="2020-12-31"> 
            </div>
            <div class="form-group">
              <textarea rows="4" class="form-control" name="message" placeholder="Message" required></textarea>
            </div>
              <%
                  if(email!=null){
              %>
             <div class="form-group">
                <input type="submit" class="btn"  name="submit" value="Book Krle ">
              </div>
              <%}  else { %>
                <a href="#loginform" class="btn btn-xs uppercase" data-toggle="modal" data-dismiss="modal">Login For Book</a>

              <% } %>
          </form>
        </div>
      </aside>
      <!--/Side-Bar--> 
    </div>
    
    <div class="space-20"></div>
    <div class="divider"></div>
    
    <!--Similar-Cars-->
    <div class="similar_cars">
      <h3>Similar Cars</h3>
      <div class="row">
        <%
        String bid=request.getParameter("vhid");
        try {
        String sql="SELECT tblvehicles.VehiclesTitle,tblbrands.BrandName,tblvehicles.PricePerDay,tblvehicles.FuelType,tblvehicles.ModelYear,tblvehicles.id,tblvehicles.SeatingCapacity,tblvehicles.VehiclesOverview,tblvehicles.Vimage1 from tblvehicles join tblbrands on tblbrands.id=tblvehicles.VehiclesBrand where tblvehicles.VehiclesBrand='"+bid+"'";
        con = DBConnection.getConnection();
        stmt = con.prepareStatement(sql);
        ResultSet rs=stmt.executeQuery();
        while(rs.next()){
            fuelType=rs.getString("FuelType");
            id=rs.getInt("id");
            modelYear =rs.getInt("ModelYear");
            seatingCapacity=rs.getInt("SeatingCapacity");
            pricePerDay=rs.getInt("PricePerDay");
            brandName=rs.getString("BrandName");
            vehicleTitle =rs.getString("VehiclesTitle");
            vehicleOverview=rs.getString("VehiclesOverview");
            image=rs.getString("Vimage1");
            
            /*  
           
<?php 
$bid=$_SESSION['brndid'];
$sql="SELECT tblvehicles.VehiclesTitle,tblbrands.BrandName,tblvehicles.PricePerDay,tblvehicles.FuelType,tblvehicles.ModelYear,tblvehicles.id,tblvehicles.SeatingCapacity,tblvehicles.VehiclesOverview,tblvehicles.Vimage1 from tblvehicles join tblbrands on tblbrands.id=tblvehicles.VehiclesBrand where tblvehicles.VehiclesBrand=:bid";
$query = $dbh -> prepare($sql);
$query->bindParam(':bid',$bid, PDO::PARAM_STR);
$query->execute();
$results=$query->fetchAll(PDO::FETCH_OBJ);
$cnt=1;
if($query->rowCount() > 0)
{
foreach($results as $result)
{ ?>      */
        }
            %>
        <div class="col-md-3 grid_listing">
          <div class="product-listing-m gray-bg">
              <div class="product-listing-img"> <a href="vehicle-details.jsp?vhid=<%=id%>"><img src="admin/img/vehicleimages/<%=Vimage1%>" class="img-responsive" alt="image" /> </a>
            </div>
            <div class="product-listing-content">
                <h5><a href="vehicle-details.jsp?vhid=<%=id%>"> <%=brandName%> , <%=vehicleTitle%></a></h5>
              <p class="list-price"><%=pricePerDay%></p>
          
              <ul class="features_list">
                
             <li><i class="fa fa-user" aria-hidden="true"></i> <%=seatingCapacity %> seats</li>
                <li><i class="fa fa-calendar" aria-hidden="true"></i> <%=modelYear%>  model</li>
                <li><i class="fa fa-car" aria-hidden="true"></i> <%=fuelType %></li>
              </ul>
            </div>
          </div>
        </div>
      </div>
    </div>
              <%     
    }catch(Exception e){
        out.print("ERROR");
    }
 %>       

    <!--/Similar-Cars--> 
    
  </div>
</section>
<!--/Listing-detail--> 

<!--Footer -->

<jsp:include page="footer.jsp" />
<?php include('includes/footer.php');?>

<!-- /Footer--> 

<!--Back to top-->
<div id="back-top" class="back-top"> <a href="#top"><i class="fa fa-angle-up" aria-hidden="true"></i> </a> </div>
<!--/Back to top--> 

<!--Login-Form -->

<jsp:include page="login.jsp" />
<?php include('includes/login.php');?>
<!--/Login-Form --> 

<!--Register-Form 
<%--<jsp:include page=" registration.jsp" />--%>
-->

<?php include('includes/registration.php');?>

<!--/Register-Form --> 

<!--Forgot-password-Form -->
<jsp:include page=" forgotpassword.jsp" />

<?php include('includes/forgotpassword.php');?>

<script src="assets/js/jquery.min.js"></script>
<script src="assets/js/bootstrap.min.js"></script> 
<script src="assets/js/interface.js"></script> 
<script src="assets/switcher/js/switcher.js"></script>
<script src="assets/js/bootstrap-slider.min.js"></script> 
<script src="assets/js/slick.min.js"></script> 
<script src="assets/js/owl.carousel.min.js"></script>
</body>
</html>