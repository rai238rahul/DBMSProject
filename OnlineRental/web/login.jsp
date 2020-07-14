<%-- 
    Document   : login
    Created on : 4 Jun, 2020, 1:31:42 PM
    Author     : vinit
--%>

<%@page import="java.sql.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<% 
        Connection con = null;
        PreparedStatement stmt = null;
        ResultSet rs=null;
     try{
         Class.forName("com.mysql.jdbc.Driver");
         con = DriverManager.getConnection ("jdbc:mysql://localhost:3306/carrental","root","root");  
         //redirect user to home page if already logged in
     }catch(Exception e)
     {
         out.print("sf"+e);
     }
     String email=(String)session.getAttribute("email");
     if(email=="admin@gmail.com"){
         response.sendRedirect("dashboard.jsp");
     }
     else   if(email!=null){
              response.sendRedirect("index.jsp?"+email);
        }
        else{
            out.println("ERROE");
        }
        String status=request.getParameter("status");
        
        if(status!=null){
        	if(status.equals("false")){
        		   out.print("Incorrect login details!");	           		
        	}
        	else{
        		out.print("Some error occurred!");
        	}
        }
/*            Player play=Manager.createRealizedPlayer(new File("admin/img/1592380501-polly-speech.wav").toURI().toURL());
            play.start();
            play.stop();*/
        %>
<div class="modal fade" id="loginform">
  <div class="modal-dialog" role="document">
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
        <h3 class="modal-title">Login</h3>
      </div>
      <div class="modal-body">
        <div class="row">
          <div class="login_wrap">
            <div class="col-md-12 col-sm-6">
                <form method="post" action="loginRequestHandler.jsp">
                <div class="form-group">
                  <input type="email" class="form-control" name="email" placeholder="Email address*">
                </div>
                <div class="form-group">
                  <input type="password" class="form-control" name="password" placeholder="Password*">
                </div>
                <div class="form-group checkbox">
                  <input type="checkbox" id="remember">
               
                </div>
                <div class="form-group">
                  <input type="submit" name="login" value="Login" class="btn btn-block">
                </div>
              </form>
            </div>
           
          </div>
        </div>
      </div>
      <div class="modal-footer text-center">
        <p>Don't have an account? <a href="#signupform" data-toggle="modal" data-dismiss="modal">Signup Here</a></p>
        <p><a href="#forgotpassword" data-toggle="modal" data-dismiss="modal">Forgot Password ?</a></p>
      </div>
    </div>
  </div>
</div>