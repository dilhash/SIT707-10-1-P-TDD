<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<h2>Assignments for ${unit}</h2>

<table border="1">
    <tr>
        <th>Assignment Name</th>
        <th>Due Date</th>
        <th>Completion Status</th>
    </tr>
    <c:forEach items="${assignments}" var="assignment">
        <tr>
            <td>${assignment.name}</td>
            <td>${assignment.dueDate}</td>
            <td>${assignment.completed ? 'Completed' : 'Incomplete'}</td>
        </tr>
    </c:forEach>
</table>

<a href="/">Back to Unit Selection</a>

</body>
</html>
