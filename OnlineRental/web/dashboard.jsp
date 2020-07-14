<%-- 
    Document   : dashboard
    Created on : 18 Jun, 2020, 11:32:41 AM
    Author     : vinit
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%! 
    PreparedStatement stmt=null; Connection con=null;  ResultSet rs=null;
    int c=0,v=0,b=0,br=0,sub=0,cq=0,cv=0;
    String email=null;
    %>
<%
    try{
     email=(String)session.getAttribute("email");
    }catch(Exception e){
        out.print("EREO");
    }
    try{
     if(email==null){
        response.sendRedirect("index.jsp");
 }
else
 
%>
<!doctype html>
<html lang="en" class="no-js">
<head>
	<meta charset="UTF-8">
	<meta http-equiv="X-UA-Compatible" content="IE=edge">
	<meta name="viewport" content="width=device-width, initial-scale=1, minimum-scale=1, maximum-scale=1">
	<meta name="description" content="">
	<meta name="author" content="">
	<meta name="theme-color" content="#3e454c">
	<title>Car Rental Portal | Admin Dashboard</title>
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
</head>
<body>
    <jsp:include page="header_admin.jsp"/>
	<div class="ts-main-content">
        <jsp:include page="leftbar.jsp"/>
		<div class="content-wrapper">
			<div class="container-fluid">
				<div class="row">
				<div class="col-md-12">

						<h2 class="page-title">Dashboard</h2>
						
						<div class="row">
							<div class="col-md-12">
								<div class="row">
									<div class="col-md-3">
										<div class="panel panel-default">
											<div class="panel-body bk-primary text-light">
<%	
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
%>
        <div class="stat-panel-number h1 "><%=c%></div>
	<div class="stat-panel-title text-uppercase">Reg Users</div>
	</div>
	</div>
		<a href="reg-users.jsp" class="block-anchor panel-footer">Full Detail <i class="fa fa-arrow-right"></i></a>
		</div>
		</div>
		<div class="col-md-3">
		<div class="panel panel-default">
		<div class="panel-body bk-success text-light">
		<div class="stat-panel text-center">
		
<%	
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
%>
                    <div class="stat-panel-number h1 "><%=v%></div>
		<div class="stat-panel-title text-uppercase">Listed Vehicles</div>
			</div>
			</div>
		
                    <a href="manage-vehicles.php" class="block-anchor panel-footer text-center">Full Detail &nbsp; <i class="fa fa-arrow-right"></i></a>
			</div>
			</div>
				<div class="col-md-3">
				<div class="panel panel-default">
				<div class="panel-body bk-info text-light">
				<div class="stat-panel text-center">
                                    
                                    		
<%	
   try{
        String sql="SELECT id from tblbooking "; 
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","root");
        stmt=con.prepareStatement(sql);
        rs=stmt.executeQuery();
        while(rs.next()){b++;}    
   }catch(Exception e){
        out.print("EREO1");
      
   }  	%>
                <div class="stat-panel-number h1 "><%=b%></div>
		<div class="stat-panel-title text-uppercase">Total Bookings</div>
			</div>
			</div>
		<a href="manage-bookings.jsp" class="block-anchor panel-footer text-center">Full Detail &nbsp; <i class="fa fa-arrow-right"></i></a>
			</div>
			</div>
		<div class="col-md-3">
		<div class="panel panel-default">
		<div class="panel-body bk-warning text-light">
		<div class="stat-panel text-center">
		
<%	
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
%>
    <div class="stat-panel-number h1 "><%=br%></div>
    <div class="stat-panel-title text-uppercase">Listed Brands</div>
		</div>
		</div>
	<a href="manage-brands.php" class="block-anchor panel-footer text-center">Full Detail &nbsp; <i class="fa fa-arrow-right"></i></a>
	</div>
	</div>
	</div>
	</div>
	</div>
	</div>
	</div>
<div class="row">
        <div class="col-md-12">
					<div class="row">
							<div class="col-md-12">
								<div class="row">
									<div class="col-md-3">
										<div class="panel panel-default">
											<div class="panel-body bk-primary text-light">
												<div class="stat-panel text-center">
<%	
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
%>
	<div class="stat-panel-number h1 "><%=sub%></div>
	<div class="stat-panel-title text-uppercase">Subscibers</div>
	</div>
    </div>
        <a href="manage-subscribers.php" class="block-anchor panel-footer">Full Detail <i class="fa fa-arrow-right"></i></a>
	</div>
	</div>
									<div class="col-md-3">
										<div class="panel panel-default">
											<div class="panel-body bk-success text-light">
												<div class="stat-panel text-center">
												<div class="stat-panel text-center">
<%	
   try{
        String sql="SELECT id from tblcontactusquery "; 
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","root");
        stmt=con.prepareStatement(sql);
        rs=stmt.executeQuery();
        while(rs.next()){cq++;}    
   }catch(Exception e){
            out.print("EREO1");
   
   }  %>
				<div class="stat-panel-number h1 "><%=cq%></div>
				<div class="stat-panel-title text-uppercase">Queries</div>
				</div>
				</div>
				<a href="manage-conactusquery.php" class="block-anchor panel-footer text-center">Full Detail &nbsp; <i class="fa fa-arrow-right"></i></a>
				</div>
				</div>
				<div class="col-md-3">
				<div class="panel panel-default">
				<div class="panel-body bk-info text-light">
				<div class="stat-panel text-center">
<%	
   try{
        String sql="SELECT id from tbltestimonial"; 
        Class.forName("com.mysql.jdbc.Driver");
        Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","root");
        stmt=con.prepareStatement(sql);
        rs=stmt.executeQuery();
        while(rs.next()){cv++;}   
   }catch(Exception e){ out.print("EEE"); }
%>
	<div class="stat-panel-number h1 "><%=cv%></div>
        <div class="stat-panel-title text-uppercase">Testimonials</div>
                </div>
		</div>
	<a href="testimonials.php" class="block-anchor panel-footer text-center">Full Detail &nbsp; <i class="fa fa-arrow-right"></i></a>
		</div>
                </div>
        
                </div>
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
	<script>
		
	window.onload = function(){
    
		// Line chart from swirlData for dashReport
		var ctx = document.getElementById("dashReport").getContext("2d");
		window.myLine = new Chart(ctx).Line(swirlData, {
			responsive: true,
			scaleShowVerticalLines: false,
			scaleBeginAtZero : true,
			<%-- multiTooltipTemplate: "<%if (label){%><%=label%>: <%}%><%= value %>",
		});--%>
		
		// Pie Chart from doughutData
		var doctx = document.getElementById("chart-area3").getContext("2d");
		window.myDoughnut = new Chart(doctx).Pie(doughnutData, {responsive : true});

		// Dougnut Chart from doughnutData
		var doctx = document.getElementById("chart-area4").getContext("2d");
		window.myDoughnut = new Chart(doctx).Doughnut(doughnutData, {responsive : true});

	}
	</script>
</body>
<% }
    catch(Exception e){
        out.print("INDSLD"+e);
    }
%>

</html>
