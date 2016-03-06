<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
String status=(String)session.getAttribute("status");
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <title>
  Professor Login
  </title>
    <base href="<%=basePath%>">
    
    <title>My JSP 'p_signup.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
     <section class="loginform cf">  
<form name="login" action="LoginAction" method="post">  
    <ul>  
        <li><label for="p_id">Professor Id</label>  
        <input type="text" name="p_id" placeholder="your id" required></li>  
        <li><label for="password">Password</label>  
        <input type="password" name="password" placeholder="password" required></li>  
        <li>  
        <input type="submit" value="Login"></li>  
        <!--  <%=status %>-->
    </ul>  
</form>  
</section>
  </body>
</html>
