<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
	<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
	<link href="<c:url value="/resources/css/style.css" />" rel="stylesheet">
	<title>Educaction : Sign Up</title>
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
					<form:form method="post" action="register.do" modelAttribute="user">
						<fieldset>
						<legend>Registration</legend>
						    <table align="center">
							    <tr>
							        <td><form:label path="userId"><spring:message code="label.userId" /></form:label></td>
							        <td><form:input path="userId" /></td> 
							    </tr>
							    <tr>
						    	    <td><form:label path="password" ><spring:message code="label.password"/></form:label></td>
						        	<td><form:password path="password" /></td> 
						    	</tr>
						    	<tr>
						        	<td><form:label path="firstName"><spring:message code="label.firstName"/></form:label></td>
							        <td><form:input path="firstName" /></td> 
						    	</tr>
						    	<tr>
						   		     <td><form:label path="lastName"><spring:message code="label.lastName"/></form:label></td>
						        <td><form:input path="lastName" /></td>
						    	</tr>
						    	<tr>
						     	   <td><form:label path="gender"><spring:message code="label.gender"/></form:label></td>
						     	   <td><form:input path="gender" /></td>
						   	 </tr>
						   	 <tr>
						        <td><form:label path="dateOfBirth"><spring:message code="label.dateOfBirth"/></form:label></td>
						        <td><form:input path="dateOfBirth" /></td>
						    </tr>
						    <tr>
						        <td><form:label path="addressLine1"><spring:message code="label.addressLine1"/></form:label></td>
						        <td><form:input path="addressLine1" /></td>
						    </tr>
						    <tr>
						        <td><form:label path="addressLine2"><spring:message code="label.addressLine2"/></form:label></td>
						        <td><form:input path="addressLine2" /></td>
						    </tr>
						    <tr>					    
						    <tr>
						        <td><form:label path="city"><spring:message code="label.city"/></form:label></td>
						        <td><form:input path="city" /></td>
						    </tr>
						    <tr>
						        <td><form:label path="county"><spring:message code="label.county"/></form:label></td>
						        <td><form:input path="county" /></td>
						    </tr>
						    <tr>
						        <td><form:label path="postCode"><spring:message code="label.postCode"/></form:label></td>
						        <td><form:input path="postCode" /></td>
						    </tr>
			    			<tr>
						        <td><form:label path="countryId"><spring:message code="label.countryId"/></form:label></td>
						        <td><form:input path="countryId" /></td>
						    </tr>
						    <tr>
						        <td><form:label path="schoolName"><spring:message code="label.schoolName"/></form:label></td>
						        <td><form:input path="schoolName" /></td>
						    </tr>
						    <tr>
						        <td><form:label path="parentFirstName"><spring:message code="label.parentFirstName"/></form:label></td>
						        <td><form:input path="parentFirstName" /></td>
						    </tr>
						    
						        <td><form:label path="parentLastName"><spring:message code="label.parentLastName"/></form:label></td>
						        <td><form:input path="parentLastName" /></td>
						    </tr>
						    <tr>
						        <td><form:label path="parentContactNo"><spring:message code="label.parentContactNo"/></form:label></td>
						        <td><form:input path="parentContactNo" /></td>
						    </tr>
						    <tr>
						        <td><form:label path="parentRelation"><spring:message code="label.parentRelation"/></form:label></td>
						        <td><form:input path="parentRelation" /></td>
						    </tr>

						   	 <tr>
								<c:if test="${sessionUser.firstName} != null}">	{								   	 
							        <td colspan="2" align="right">
							            <input type="submit" value=<spring:message code="label.update"/> name="signUp"/>
							       </td>
							    </c:if>
								<c:if test="${sessionUser.firstName} == null}">	{								   	 
							        <td colspan="2" align="right">
							            <input type="submit" value=<spring:message code="label.signUp"/> name="signUp"/>
							       </td>
							    </c:if>
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