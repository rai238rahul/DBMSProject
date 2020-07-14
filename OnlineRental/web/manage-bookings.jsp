<%-- infjdbvkjds
    Document   : manage-boooking
    Created on : 18 Jun, 2020, 11:14:49 AM
    Author     : vinit
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%!
    Connection con=null;
    PreparedStatement stmt=null;
    ResultSet rs=null;
    int status=0,vid,cnt=0;
    String fullName=null,fromDate=null,toDate=null,message=null,postingDate=null,brandName=null,vehicleTitle=null;
 %>
<%
    String email=(String)session.getAttribute("email");
    if(email==null) ;//response.sendRedirect("index.jsp");      
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","root");
    String sql="SELECT * from tblusers where EmailId='"+email+"'";
    stmt=con.prepareStatement(sql);
    rs=stmt.executeQuery();
    while(rs.next()){
    }
    }catch(Exception e){}
%>


<?php
session_start();
error_reporting(0);
include('includes/config.php');
if(strlen($_SESSION['alogin'])==0)	{	
header('location:index.php');
}
else{
if(isset($_REQUEST['eid']))
	{
$eid=intval($_GET['eid']);
$status="2";
$sql = "UPDATE tblbooking SET Status=:status WHERE  id=:eid";
$query = $dbh->prepare($sql);
$query -> bindParam(':status',$status, PDO::PARAM_STR);
$query-> bindParam(':eid',$eid, PDO::PARAM_STR);
$query -> execute();

$msg="Booking Successfully Cancelled";
}


if(isset($_REQUEST['aeid']))
	{
$aeid=intval($_GET['aeid']);
$status=1;

$sql = "UPDATE tblbooking SET Status=:status WHERE  id=:aeid";
$query = $dbh->prepare($sql);
$query -> bindParam(':status',$status, PDO::PARAM_STR);
$query-> bindParam(':aeid',$aeid, PDO::PARAM_STR);
$query -> execute();

$msg="Booking Successfully Confirmed";
}


 ?>

<!doctype html>
<html lang="en" class="no-js">

<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">
	<meta name="theme-color" content="#3e454c">
	
	<title>Car Rental Portal |Admin Manage testimonials   </title>

	<!-- Font awesome -->
	<link rel="stylesheet" href="admin/css/font-awesome.min.css">
	<!-- Sandstone Bootstrap CSS -->
	<link rel="stylesheet" href="admin/css/bootstrap.min.css">
	<!-- Bootstrap Datatables -->
	<link rel="stylesheet" href="admin/css/dataTables.bootstrap.min.css">
	<!-- Bootstrap social button library -->
	<link rel="stylesheet" href="admin/css/bootstrap-social.css">
	<!-- Bootstrap select -->
	<link rel="stylesheet" href="admin/css/bootstrap-select.css">
	<!-- Bootstrap file input -->
	<link rel="stylesheet" href="admin/css/fileinput.min.css">
	<!-- Awesome Bootstrap checkbox -->
	<link rel="stylesheet" href="admin/css/awesome-bootstrap-checkbox.css">
	<!-- Admin Stye -->
	<link rel="stylesheet" href="admin/css/style.css">
  <style>
		.errorWrap {
    padding: 10px;
    margin: 0 0 20px 0;
    background: #fff;
    border-left: 4px solid #dd3d36;
    -webkit-box-shadow: 0 1px 1px 0 rgba(0,0,0,.1);
    box-shadow: 0 1px 1px 0 rgba(0,0,0,.1);
}
.succWrap{
    padding: 10px;
    margin: 0 0 20px 0;
    background: #fff;
    border-left: 4px solid #5cb85c;
    -webkit-box-shadow: 0 1px 1px 0 rgba(0,0,0,.1);
    box-shadow: 0 1px 1px 0 rgba(0,0,0,.1);
}
		</style>

</head>

<body>
    <jsp:include page="header_admin.jsp"/>

	<div class="ts-main-content">
    <jsp:include page="leftbar.jsp"/>
        		<div class="content-wrapper">
			<div class="container-fluid">

				<div class="row">
					<div class="col-md-12">

						<h2 class="page-title">Manage Bookings</h2>

						<!-- Zero Configuration Table -->
						<div class="panel panel-default">
							<div class="panel-heading">Bookings Info</div>
							<div class="panel-body">
			<?php if($error){?><div class="errorWrap"><strong>ERROR</strong>:<?php echo htmlentities($error); ?> </div><?php } 
			else if($msg){?><div class="succWrap"><strong>SUCCESS</strong>:<?php echo htmlentities($msg); ?> </div><?php }?>
								<table id="zctb" class="display table table-striped table-bordered table-hover" cellspacing="0" width="100%">
									<thead>
										<tr>
										<th>#</th>
											<th>Name</th>
											<th>Vehicle</th>
											<th>From Date</th>
											<th>To Date</th>
											<th>Message</th>
											<th>Status</th>
											<th>Posting date</th>
											<th>Action</th>
										</tr>
									</thead>
									<tfoot>
										<tr>
										<th>#</th>
										<th>Name</th>
											<th>Vehicle</th>
											<th>From Date</th>
											<th>To Date</th>
											<th>Message</th>
											<th>Status</th>
											<th>Posting date</th>
											<th>Action</th>
										</tr>
									</tfoot>
									<tbody>

                                                                            <%
   email=(String)session.getAttribute("email");
    if(email==null)response.sendRedirect("index.jsp"); 
    try{
    Class.forName("com.mysql.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","root");
    String sql="SELECT tblusers.FullName,tblbrands.BrandName,tblvehicles.VehiclesTitle,tblbooking.FromDate,tblbooking.ToDate,tblbooking.message,"
            + "tblbooking.VehicleId as vid,tblbooking.Status,tblbooking.PostingDate,tblbooking.id  from tblbooking join tblvehicles on "
            + "tblvehicles.id=tblbooking.VehicleId join tblusers on tblusers.EmailId=tblbooking.userEmail join tblbrands on"
            + " tblvehicles.VehiclesBrand=tblbrands.id  ";
    stmt=con.prepareStatement(sql);
    rs=stmt.executeQuery();
    int cnt=1;
    while(rs.next()){
        fullName=rs.getString("FullName");
        fromDate=rs.getString("FromDate");
        toDate=rs.getString("FromDate");
        message=rs.getString("message");
        status=rs.getInt("Status");
        vid=rs.getInt("vid");
        postingDate =rs.getString("PostingDate");
        brandName=rs.getString("BrandName");
        vehicleTitle=rs.getString("VehiclesTitle"); 
        
%>
										<tr>
											<td><%=cnt%></td>
											<td><%= fullName%></td>
											<td><a href="edit-vehicle.jsp?id=<%=vid%>"> <%=brandName%> <%=vehicleTitle%></td>
											<td><%=fromDate%></td>
											<td><%=toDate%></td>
											<td><%= message%></td>
											<td>
     <%  
if(status==0)
{
out.print("Not Confirmed Yet");
}
else if (status==1) {
out.print("Confirmed");
}
 else{
 	out.print("Cancelled");
 }
%>                               </td>
				<td><%=postingDate%></td>
                                
	<td>
                    <%if(request.getParameter("msg")=="CONFIRMED"){ out.print("ALREADY CONFIRMED");}
                                    else if(request.getParameter("msg")=="CANCELLED"){ out.print("ALREADY CANCELLED");}
                                 else{%>
             <a href="ManageBooking?aeid=<%= vid %>" onclick="return confirm('Do you really want to Confirm this booking')"> Confirm</a> /
            <a href="ManageBooking?eid=<%=vid%>" onclick="return confirm('Do you really want to Cancel this Booking')"> Cancel</a>
            <% } %>
</td>									</tr>
								<% cnt=cnt+1; 
                                                                  }
                                                                     %>
										
									</tbody>
								</table>

						

							</div>
						</div>

					

					</div>
				</div>

			</div>
		</div>
	</div>

	<!-- Loading Scripts -->
	<script src="js/jquery.min.js"></script>
	<script src="js/bootstrap-select.min.js"></script>
	<script src="js/bootstrap.min.js"></script>
	<script src="js/jquery.dataTables.min.js"></script>
	<script src="js/dataTables.bootstrap.min.js"></script>
	<script src="js/Chart.min.js"></script>
	<script src="js/fileinput.js"></script>
	<script src="js/chartData.js"></script>
	<script src="js/main.js"></script>
</body>
</html>
<%   }catch(Exception e){out.print("ERROR");} %>
