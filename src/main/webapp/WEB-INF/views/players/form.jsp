<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>
<h2>Add new player to a team</h2>

<form:form action="/addPlayer" modelAttribute="player">
    <form:label path="name"> Enter player name </form:label>
    <form:input path="name"/><br/>

    <form:label path="nationality"> Enter player nationality </form:label>
    <form:input path="nationality"/><br/>

    <form:label path="position"> Enter player position </form:label>
    <form:input path="position"/><br/>

    <form:label path="age"> Enter player age </form:label>
    <form:input path="age"/><br/>

    <input type="hidden" name="team" value="${team}"/>

    <input type="submit"/>

</form:form>



</body>
</html>