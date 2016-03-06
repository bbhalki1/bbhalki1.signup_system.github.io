<%@ page language="java" import="java.util.*" pageEncoding="US-ASCII"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
  
  	<style type = "text/css">
  		body{
  			background-image:url("image/logo_screen.jpg");
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
    
<title>Signup System</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<link rel="shortcut icon" href="image/logo.png">
	<link href="css/bootstrap.css" rel="stylesheet">
	<!-- Custom Google Web Font -->
    <link href="font-awesome/css/font-awesome.min.css" rel="stylesheet">
    <link href='http://fonts.googleapis.com/css?family=Lato:100,300,400,700,900,100italic,300italic,400italic,700italic,900italic' rel='stylesheet' type='text/css'>
  	<!-- Add custom CSS here -->
    <link href="css/landing-page.css" rel="stylesheet">
    
    <!-- JavaScript -->
    <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
    <script src="js/bootstrap.js"></script>
  </head>
  
  <body >
  <nav class="navbar navbar-default navbar-fixed-top header_banner" role="navigation">
        <div class="container">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-ex1-collapse">
                    <span class="sr-only">Toggle navigation</span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <div class="download">
               <!--   <a href="http://www.binghamton.edu/"></a><img alt="binghamton" src="image/download.jpg" height="80px"></div></a>-->
                <!-- <a href="http://www.binghamton.edu/"></a><background image="image/logo.jpg" height="80px"></div></a> -->
                </div>
                
            </div>

            <!-- Collect the nav links, forms, and other content for toggling -->
            <div class="collapse navbar-collapse navbar-right navbar-ex1-collapse nav_elements text_accent_white">
                <ul class="nav navbar-nav">
                    <li><a href="#about">About</a>
                    </li>
                    <li><a href="#contact">Contact</a>
                    </li>
                </ul>
            </div>

    </nav>
    
    
    <div class="intro-header">

        <div class="container">

            <div class="row">
                <div class="col-lg-12">
                    <div class="intro-message">
                        <h1>Welcome to Binghamton University</h1>
                        <h3>Signup System</h3>
                        <a href="signup.jsp"><input type="button" value="Student signup"/></a>
  						<a href="p_signup.jsp"><input type="button" value="Professor signup"/></a>
                    </div>
                </div>
            </div>

        </div>
      </div>
   </body>
</html>
