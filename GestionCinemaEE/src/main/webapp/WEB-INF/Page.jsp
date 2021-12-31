<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Gestion de Cinéma</title>
</head>
<body>
  <h1> Séance dans le cin�ma</h1>
 
  
  <c:forEach items="${seance}" var="seance">
		<p>${seance}</p>
	</c:forEach>
</body>
</html>