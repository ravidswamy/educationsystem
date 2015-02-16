<?xml version="1.0" encoding="ISO-8859-1" ?>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ page import="java.util.ArrayList" %>    
<%@ page import="java.util.Map" %>
<%@ page import="java.util.HashMap" %>  
<%@ page import="java.util.Iterator" %>;

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1" />
<link rel="stylesheet" type="text/css" href="css/style.css" />
<title>Exam Types</title>
</head>
<body>
	<%
	   	ArrayList<Map> listOfExamTypes	= new ArrayList<Map>() ;
		listOfExamTypes = ( ArrayList ) request.getAttribute("listOfExamTypes") ;
		
		String idKey = null ;
		int idVal = 0 ;
		
		String nameKey = null ;
		String nameVal = null ;

		String difficultyLevelKey = null ;
		int    difficultyLevelVal = 0 ;
		
		String noOfQuestionsKey = null ;
		int    noOfQuestionsVal = 0 ;
		
		String deviationStartKey = null ;
		int    deviationStartVal = 0 ;

		String deviationEndKey = null ;
		int    deviationEndVal = 0 ;

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
					<p><b>Select from the Exam Types below </b></p>
					<% 
			    		
						String radioButtonText = null ;
			    		
			    		for ( int i = 0 ; i < listOfExamTypes.size() ; i++ ) {
								Map examType = new HashMap() ; 
								examType = listOfExamTypes.get(i) ;
							
						    	Iterator<Map.Entry> iterator = examType.entrySet().iterator() ;
		
					    		idKey = null ;
					    		idVal = 0 ;
					    		
					    		nameKey = null ;
					    		nameVal = null ;
		
					    		difficultyLevelKey = null ;
					    		difficultyLevelVal = 0 ;
					    		
					    		noOfQuestionsKey = null ;
					    		noOfQuestionsVal = 0 ;
					    		
					    		deviationStartKey = null ;
					    		deviationStartVal = 0 ;
		
					    		deviationEndKey = null ;
					    		deviationEndVal = 0 ;
		
						    	while(iterator.hasNext()){
						    		Map.Entry me = iterator.next();
						    		
						    		if ( me.getKey().toString().equals("id")) {
						    			idKey = ( String ) me.getKey() ;
						    			idVal = ( Integer ) me.getValue() ;
						    		} else if ( me.getKey().toString().equals("name")) {
						    			nameKey = ( String ) me.getKey() ;
						    			nameVal = ( String ) me.getValue() ;
						    		} else if ( me.getKey().toString().equals("difficultyLevel")) {
						    			difficultyLevelKey = ( String ) me.getKey() ;
						    			difficultyLevelVal = ( Integer ) me.getValue() ;
						    		} else if ( me.getKey().toString().equals("noOfQuestions")) {
						    			noOfQuestionsKey = ( String ) me.getKey() ;
						    			noOfQuestionsVal = ( Integer ) me.getValue() ;
						    		} else if ( me.getKey().toString().equals("deviationStart")) {
						    			deviationStartKey = ( String ) me.getKey() ;
						    			deviationStartVal = ( Integer ) me.getValue() ;
						    		} else if ( me.getKey().toString().equals("deviationEnd")) {
						    			deviationEndKey = ( String ) me.getKey() ;
						    			deviationEndVal = ( Integer ) me.getValue() ;
						    		}
						    		
						    	 } 
		
							     if ( radioButtonText == null ) {
								    	radioButtonText = "<tr><td><input type='radio'" + " name='examTypeId'" +  " value='" + idVal  + "' /></td><td>" + nameVal + "</td></tr> \n" ;
							     } else {
							    		radioButtonText = radioButtonText + "<tr><td><input type='radio'" + " name='examTypeId'" +  " value='" + idVal  + "' /></td><td>" + nameVal + "</td></tr> \n" ;
							     }
			    			}
					%>				
					<%=radioButtonText %>
					<br/>
					<p><input type="submit" name="startExam" value="Start Exam"></p>
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
