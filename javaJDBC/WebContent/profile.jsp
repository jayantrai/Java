<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ page import="java.sql.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	
	<% 
		String url = "jdbc:mysql://localhost:3306/javaDB";
		String username = "root";
		String password = "";
		
		String sql = "select * from student";
		
		Class.forName("com.mysql.jdbc.Driver");
		Connection con = DriverManager.getConnection(url, username, password);
		Statement st = con.createStatement();
		
		ResultSet rs = st.executeQuery(sql);
		rs.next();
		
	
	%>
	
	Student ID : <%= rs.getString(1) %> <br>
	Student Name: <%= rs.getString(2) %>
	
</body>
</html>