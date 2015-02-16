<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.ArrayList" %>    

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>Insert title here</title>
</head>
<body>
	<%
	
		int questionId 				= ( Integer ) request.getAttribute("questionId") ;
	   	int questionTypeId 			= ( Integer ) request.getAttribute("questionTypeId") ;
	   	String question 			= ( String ) request.getAttribute("question") ;
	   	int difficultyLevel 		= ( Integer ) request.getAttribute("difficultyLevel") ;
	   	ArrayList<String> answers	= new ArrayList<String>() ;
	   	answers						= ( ArrayList ) request.getAttribute("answers") ;
	   	
	   	
		// from GetQuestion servlet to be set in this form as hidden field
		int 	examTypeId		= Integer.parseInt(request.getParameter("examTypeId")) ;

	%> 
<div id="wrapper">
	<div id="header">
		<%@ include file="includes/header.jsp" %>
	</div>
	<div id="content">
		<div id="content-left">
			<%@ include file="includes/leftNav.jsp" %>
		</div>
		<div id="content-main">
			<form action="question" method="post">
					<p align="right"><b>Your exam is in <b><%=examTypeId %> mode</b></p><br/>
					<p align="center">Question : <%=question%></p> 
					<p align="center"><b>Answer</b></p>
					<% 
						for ( int i = 0 ; i < answers.size() ; i++ ) { %>
							<p><input type="radio" name="ans" value="<%=i %>"/><%=answers.get(i)%></p>
					<%} %>	
					<p><input type="hidden" name="examTypeId" value="<%=examTypeId %>"/></p>
					<p><input type="submit" name="nextQuestion" value="Next >>"/></p>
				
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
