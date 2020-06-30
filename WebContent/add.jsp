<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" errorPage="error.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="java.sql.*"%>
<%! int a=3; %>

<%
/* int num1 = Integer.parseInt(request.getParameter("num1"));
int num2 = Integer.parseInt(request.getParameter("num2"));
System.out.println(num1+num2);
int k = num1+num2;
int j = 9/0;
out.println(k); */

String url = "jdbc:mysql://localhost:3306/jsp_db";
Class.forName("com.mysql.jdbc.Driver");
Connection con =DriverManager.getConnection(url,"root","");
Statement st = con.createStatement();
String Sql = "select * from student where rollno=103";
ResultSet rs = st.executeQuery(Sql);
rs.next();
/* jdbc:mysql://localhost:3306/hitanshu
username:root */


%>

<%=rs.getString(2) %> <br/>

My fav no. is <%= a %>
</body>
</html>