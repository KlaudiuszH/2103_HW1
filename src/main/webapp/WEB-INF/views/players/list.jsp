<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
</head>
<body>
<h2>List of players</h2>

<table>
    <tr>
        <th>Name</th>
        <th>Nationality</th>
        <th>Position</th>
        <th>Age</th>
    </tr>


    <c:forEach items="${players}" var="player">
        <tr>
            <td>${player.getName()}</td>
            <td>${player.getNationality()}</td>
            <td>${player.getPosition()}</td>
            <td>${player.getAge()}</td>
        </tr>
    </c:forEach>
    <td><a href="/newPlayer?team=${team}"> Add player </a></td>

</table>


</body>
</html>