<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>liste des seances</title>
</head>
<body>
  <h1> Programme du cinéma</h1>
 
  
  <c:forEach items="${seance}" var="seance">
		<p>${seance}</p>
	</c:forEach>
</body>
</html>