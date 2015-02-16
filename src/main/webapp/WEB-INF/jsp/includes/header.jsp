
<font size="8" color="red">
<i><b><center>The Ultimate Tutorial for 11+</center></b></i>
</font>

<%
	if ( request.getAttribute("sessionUser") != null ) {
%>
		<p align="right"><b><i>Hi ${sessionUser.firstName } ${sessionUser.lastName }   ( <a href="${pageContext.request.contextPath}/edit/${sessionUser.id }">Edit Profile</a>) </i> </b></p>	
<% 	} 
%>
