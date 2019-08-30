<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>coustomer registration form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="customer">
		First name : <form:input path="firstName"/>
		<form:errors path="firstName"></form:errors>
		<br><br>
		Last name : <form:input path="lastName"/>
		<br><br>
		Age : <form:input path="age"/>
		<form:errors path="age"></form:errors>
		<br><br>
		course Name : <form:input path="courseName"/>
		<form:errors path="courseName"></form:errors>
		<br><br>
		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>