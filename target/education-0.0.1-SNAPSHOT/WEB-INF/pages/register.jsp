<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>    
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>Sign Up</title>
</head>
<body>
	<div id="wrapper">
		<div id="header">
		</div>
		<div id="content">
			<div id="content-left">
			</div>
			<div id="content-main">
				<form action="register"  >
						<fieldset styleClass="fieldset" >
							<legend align="top"><b>Sign Up Form</b></legend>
							<h:panelGrid id="regPanelGrid" style="margin: 0 auto; margin-top: 25px; text-align: left" cellspacing="8" columns="3">
								<p>User name : <input type="text" min="1" max="40" size="40" name="id" required/></p>
								<p>Password : <input type="text" min="1" max="25" size="25" name="password" required/></p>
								<p>First Name : <input type="text" min="1" max="50" size="50" name="firstName" required/></p>
								<p>Last Name : <input type="text" min="1" max="50" size="50" name="lastName" required/></p> 
								<p>Gender : <input type="text" min="1" max="1" size="1" name="gender" required/></p>
								<p>Age : <input type="number" min="10" max="15" size="2" name="age" value="10" required/></p>
								<p>Date of Birth : <input type="text" min="10"  max="10" name="dateOfBirth" value="10/10/2001" required/></p>
								<p>Address Line 1 : <input type="text" min="1" max="50" size="50" name="addressLine1" required/></p> 
								<p>Address Line 2 : <input type="text" min="1" max="50" size="50" name="addressLine2" required/></p>
								<p>City : <input type="text" min="1" max="50" size="50" name="city" required/></p>
								<p>County : <input type="text" min="1" max="50" size="50" name="county" required/></p>
								<p>Post Code  : <input type="text" min="1" max="10" size="10" name="postCode" required/></p>
								<p>Country : 
									 <select name="countryId" required>
										  <option value="1">UK</option>
										  <option value="2">India</option>
									</select>
								</p>
								<p>School Name : <input type="text" min="1" max="50" size="50" name="schoolName" required/></p>
								<p>Parent First Name : <input type="text" min="1" max="50" size="50" name="parentFirstName" required/></p>
								<p>Parent Last Name : <input type="text" min="1" max="50" size="50" name="parentLastName" required/></p>
								<p>Parent Contact No : <input type="text" min="1" max="12" size="12" name="parentContactNo" required/></p>
								<p>Relation To Child : <p><input type="text" min="1" max="15" size="15" name="parentRelation" required/></p></p>
								<p><input type="submit" value="Register" name="register"/></p>
							</h:panelGrid>
					</fieldset>
				</form>
			</div>
		</div>
		<div id="footer">
		</div>
		<div id="bottom"></div>
	</div>
</body>
</html>