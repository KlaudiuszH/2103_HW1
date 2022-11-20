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
    <form:input path="name"/>
    <form:errors path="name"/><br/><br/>
    <form:label path="nationality"> Enter player nationality </form:label>
    <form:input path="nationality"/>
    <form:errors path="nationality"/><br/><br/>
    <form:label path="position"> Enter player position </form:label>
    <form:input path="position"/>
    <form:errors path="position"/><br/><br/>
    <form:label path="age"> Enter player age </form:label>
    <form:input path="age"/>
    <form:errors path="age"/><br/><br/>
    <input type="hidden" name="team" value="${team}"/>

    <input type="submit"/>

</form:form>



</body>
</html>