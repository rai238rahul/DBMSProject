<%-- 
    Document   : config
    Created on : 4 Jun, 2020, 1:28:58 PM
    Author     : vinit
--%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ page import="java.sql.*" %>
<%
try{
  Class.forName("com.mysql.jdbc.Driver");
  //out.print("DRIVER LOADED");
  Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/carrental","root","root");
}catch(Exception e){
    out.print("ERROR");
}
%>
