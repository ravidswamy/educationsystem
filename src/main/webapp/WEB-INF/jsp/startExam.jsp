<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
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
			<form action="question.do" method="post" >
			
				<p><b>Select from the Exam Types below </b></p>
				<input type="radio" name="examType" value="1" checked>Practice <br/>
				<input type="radio" name="examType" value="2" >Simple <br/>
				<input type="radio" name="examType" value="3" >Intermediate <br/>
				<input type="radio" name="examType" value="4" >Advanced <br/>
				<input type="radio" name="examType" value="5" >Expert <br/>
				<input type="submit" name="submitExamType" value="Next" >
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
