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
					<form:form method="post" action="loginOrRegister.do" modelAttribute="user">
						 	<fieldset>
							 	<legend>Login</legend>
							    <table align="center">
								    <c:if test="${not empty error }">
								    	<tr><td align="center" colspan="2"><font color="red"><b>${error}</font></b></td></tr>
								    	<tr><td align="center" colspan="2"><font color="red"><b>${msg}</font></b></td></tr>
								    	
								    </c:if>
								    <tr>
								        <td><form:label path="userId"><spring:message code="label.userId" /></form:label>
								        	<form:errors path="userId">enter username</form:errors>
								        </td>
								        <td><form:input path="userId" /></td> 
								    </tr>
								    <tr>
								        <td><form:label path="password"><spring:message code="label.password"/></form:label></td>
								        <td><form:password path="password" /></td>
								    </tr>
								    <tr>
								        <td />
								        <td align>
								            <input type="submit" value=<spring:message code="label.signIn"/> name="signIn"/>
								            <input type="submit" value=<spring:message code="label.signUp"/> name ="signUp"/>
								        </td>
								    </tr>
								</table> 
						</fieldset>
					</form:form>
				</div>
			</div>
			<div id="footer">
				<%@ include file="/WEB-INF/jsp/includes/footer.jsp" %>
			</div>
			<div id="bottom"></div>
		</div> 
	</body>
</html>