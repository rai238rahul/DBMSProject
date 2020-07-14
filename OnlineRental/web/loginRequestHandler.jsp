<%@page import="com.LoginDAO"%>
<jsp:useBean id="loginBean" class="com.LoginBean" scope="session"/>
<jsp:setProperty name="loginBean" property="*"/>

<%
String result=LoginDAO.loginCheck(loginBean);
 if(result.equals("true")){
     session=request.getSession();
     session.setAttribute("email",loginBean.getEmail());
     if(loginBean.getEmail().equals("admin@gmail.com") && loginBean.getPassword().equals("2")){
         response.sendRedirect("dashboard.jsp?"+loginBean.getEmail());
     }
    else
         response.sendRedirect("index.jsp?"+loginBean.getPassword());
}
if(result.equals("false")){
	response.sendRedirect("login.jsp?status=false"+loginBean.getEmail());
        
       
}
if(result.equals("error")){
    response.sendRedirect("login.jsp?status=error");
}
 
%>