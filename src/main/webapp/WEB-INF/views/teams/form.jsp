<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
</head>
<body>
<h2>Add new team to the list </h2>

<form:form action="/addTeam" modelAttribute="team">
    <form:label path="id"> Enter team ID </form:label>
    <form:input path="id"/>
    <form:errors path="id"/><br/><br/>
    <form:label path="name"> Enter team name </form:label>
    <form:input path="name"/>
    <form:errors path="name"/><br/><br/>
    <form:label path="league"> Enter league </form:label>
    <form:input path="league"/>
    <form:errors path="league"/><br/><br/>
    <input type="submit"/>

</form:form>

</body>
</html>