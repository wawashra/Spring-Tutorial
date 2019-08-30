<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>

<!DOCTYPE html>
<html>
<head>
<title>Student Confirmation</title>
</head>
<body>
	The student is confirmed: ${student.firstName} ${student.lastName}
	<br>
	Country : ${student.country}
	<br>
	favorite Language : ${student.favoriteLanguage}
	<br>
	favorite Os : <ul>
		<c:forEach var="tmp" items="${student.favoriteOs}"><li>${tmp}</li></c:forEach>
	
	</ul>
	
</body>
</html>