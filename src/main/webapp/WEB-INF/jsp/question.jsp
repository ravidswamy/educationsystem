<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">	
<title>Education - Questions</title>
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
			<form action="question" method="post">
					<br/>	<br/>	<br/>	<br/>	<br/>
					<b>Page under construction ................</b>
			</form>
		</div>
	</div>
	<div id="footer">
		<%@ include file="/WEB-INF/jsp/includes/footer.jsp" %>
	</div>
	<div id="bottom"></div>
</div>	
</body>
</html>
