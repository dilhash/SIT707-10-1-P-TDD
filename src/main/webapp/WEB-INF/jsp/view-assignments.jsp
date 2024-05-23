<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<h2>Assignments for ${unit}</h2>

<form method="get" action="${pageContext.request.contextPath}/filterAssignments">
    <input type="hidden" name="unit" value="${unit}" />
    <label for="targetGrade">Target Grade:</label>
    <select id="targetGrade" name="targetGrade">
        <option value="PASS">Pass</option>
        <option value="CREDIT">Credit</option>
        <option value="DISTINCTION">Distinction</option>
        <option value="HIGH_DISTINCTION">High Distinction</option>
    </select>
    <input type="submit" value="Filter" />
</form>

<table border="1">
    <tr>
        <th>Assignment Name</th>
        <th>Due Date</th>
        <th>Completion Status</th>
        <th>Task Type</th>
    </tr>
    <c:forEach items="${assignments}" var="assignment">
        <tr>
            <td>${assignment.name}</td>
            <td>${assignment.dueDate}</td>
            <td>${assignment.completed ? 'Completed' : 'Incomplete'}</td>
            <td>${assignment.taskTypeName}</td>
        </tr>
    </c:forEach>
</table>

<a href="/">Back to Unit Selection</a>

</body>
</html>
