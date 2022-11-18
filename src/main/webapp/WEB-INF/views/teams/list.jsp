<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>
<h2>List of players and teams</h2>

<table>
<tr>
    <th>Name</th>
    <th>League</th>
    <th>Players</th>
</tr>


<c:forEach items="${teams}" var="team">
    <tr>
        <td>${team.getName()}</td>
        <td>${team.getLeague()}</td>
        <td><a href="/players?team=${team.id}"> Show players </a></td>
    </tr>
</c:forEach>
</table>


</body>
</html>