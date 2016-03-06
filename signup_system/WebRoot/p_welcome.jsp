<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
              

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jstl/fmt" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
List sArr=(List)session.getAttribute("sArr");

%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'p_welcome.jsp' starting page</title>
    
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
       <table cellspacing="0">
    <tr>
    	<th>Student-ID</th>
    	<th>Student-Reason</th>
    	
    </tr>
    <c:forEach items="${sArr}" var="student">
    <tr>
    <td>
       <c:out value="${student.s_bid}"/>
       <c:out value="${student.s_reason}"/>  
    </td></tr>
	</c:forEach>

    </table>
    
  </body>
</html>
