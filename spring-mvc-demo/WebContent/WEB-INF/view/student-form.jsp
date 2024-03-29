<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<title>Student registration form</title>
</head>
<body>
	<form:form action="processForm" modelAttribute="student" method="POST">
		First name : <form:input path="firstName"/>
		<form:errors path="firstName"></form:errors>
		<br><br>
		Last name : <form:input path="lastName"/>
		<br><br>
		country name : <form:select path="country">
			<form:options items="${theCountryOptions}"/>
		</form:select>
		<br><br>
		    <form:radiobuttons path="favoriteLanguage" items="${favoriteLanguageOptions}"  />
		<br><br>
		    <form:checkboxes path="favoriteOs" items="${favoriteOsOptions}"  />
		<br><br>

		<input type="submit" value="Submit"/>
	</form:form>
</body>
</html>