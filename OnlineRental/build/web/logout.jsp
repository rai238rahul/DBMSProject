<%-- 
    Document   : logout
    Created on : 16 Jun, 2020, 7:12:18 PM
    Author     : vinit
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
session=request.getSession();  
session.invalidate();
response.sendRedirect("index.jsp");
%>
