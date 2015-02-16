<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>Login</title>
</head>
<body>
<div id="wrapper">
	<div id="header">
		<%@ include file="includes/header.jsp" %>
	</div>
	<!-- <div id="content-box1"><p>Box 1</p></div>
	<div id="content-box2"><p>Box 2</p></div>
	<div id="content-box3"><p>Box 3</p></div> -->
	<div id="content">
		<div id="content-left">
			<%@ include file="includes/leftNav.jsp" %>
		</div>
		<div id="content-main">
				<form action="main" method="post">
					<fieldset styleClass="fieldset" >
						<legend align="top"><b>Login Form</b></legend>
						<h:panelGrid id="regPanelGrid" style="margin: 0 auto; margin-top: 25px; text-align: center" cellspacing="8" columns="3">
								<p align="center">
								<% if ( request.getAttribute("errorMessage") != null ) { %>
									<font color="RED">	
										ERROR !!!  Invalid username or password.
									</font>
								<% } %>
								</p>					
								<p>User name : </p>
								<p><input type="text" name="id" /></p>
								<p>Password : </p>
								<p>
									<input type="text" name="password" />
								</p>
								<p>
									<input type="submit" value="Submit" name="login"/>  <input type="submit" value="SignUp Now !!" name="register"/>
								</p>
							</h:panelGrid>
					</fieldset>
				</form>
		</div>
	</div>
	<div id="footer">
		<%@ include file="includes/footer.jsp" %>
	</div>
	<div id="bottom"></div>
</div>
</body>
</html>