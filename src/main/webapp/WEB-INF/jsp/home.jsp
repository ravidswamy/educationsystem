<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<jsp:useBean id="user" class="com.sitename.education.entity.UserEntity" scope="session"/>
<jsp:setProperty name="user" property="*"/>

<html xmlns="http://www.w3.org/1999/xhtml">
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
		<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">	
		<title>Educaction : Login / Sign Up</title>
	</head>
<body>
	<div id="wrapper">
		<div id="header">
			<%@ include file="/WEB-INF/jsp/includes/header.jsp" %>
		</div>
		<div id="content">
			<div id="content-left">
				<%@ include file="/WEB-INF/jsp/includes/leftNav.jsp" %>
			</div>
			<div id="content-main">
				<center>
					<br/><br/>
					Welcome !! <b>${user.firstName} ${user.lastName} </b><br/><br/><br/>
					<br />     
					You can now start taking your exam.<br/> <br />
					
					Good Luck !!!<br/><br/><br/>
					
					<form action="startExam.do" method="post">
						<input type="submit" value="Click to continue" />
					</form>
				</center>
			</div>
		</div>
		<div id="footer">
			<%@ include file="/WEB-INF/jsp/includes/footer.jsp" %>
		</div>
		<div id="bottom"></div>
	</div>
		
		
		
</body>
</html>

