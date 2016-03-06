<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>

<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  <title>
  	Student Login
  </title>
  <style type = "text/css">
  		body{
  			background-image:url("image/logo.jpg");
  			background-position:center;
  			background-size: auto
  			image height : 80;
  			background-position: top center !important;
			background-repeat: no-repeat !important;
			background-attachment: fixed;
			margin: 0;
        	padding: 0;
        	repeat: repeat-y;
  		}
  	</style>
    <base href="<%=basePath%>">
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
  </head>
  
  <!-- <body>
    <form action="SignupAction" method="post">
    	<div>
    		professor Id : <input type="text" name="p_id"/><br>
    		student Id : <input type="text" name="s_bid"/><br>
    		reason : <textarea name=s_reason></textarea><br>
    		<input type="submit" value="Submit"/>
    	</div>
    </form>
  </body> -->
  <body>
   <form action="SignupAction" method="post">
  <div class="intro-header">

        <div class="container">

            <div class="row">
                <div class="col-lg-12">
                    <div class="intro-message">
                        <h1><center>Welcome to Binghamton University</h1>
                        <h3>Signup System</h3>
                            		professor Id : <input type="text" name="p_id"/><br>
    								student Id : <input type="text" name="s_bid"/><br>
    								reason : <textarea name=s_reason></textarea><br>
    								<input type="submit" value="Submit"/>
                    </div>
                </div>
            </div>

        </div>
      </div>
      </form>
      </body>
</html>
