<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>Welcome</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
		</div>
		<div id="content">
			<div id="content-left">
			</div>
			<div id="content-main">
				<center>
					Hi <b><%= session.getAttribute("firstName") %> <%= session.getAttribute("lastName") %></b><br/><br/><br/>
					   
					You can now start taking your exam.<br/> <br />
					
					Good Luck !!!<br/><br/><br/>
					
					<form action="startexam" method="post">
						<input type="submit" value="Click to continue" />
					</form>
				</center>
			</div>
		</div>
		<div id="footer">
		</div>
		<div id="bottom"></div>
	</div>
		
		
		
</body>
</html>

