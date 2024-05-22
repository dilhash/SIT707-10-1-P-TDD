<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<body>

<h2>Welcome</h2>
Server is running...<br><br>

<form action="/selectUnit" method="get">
    <label for="unit">Select Unit:</label>
    <select id="unit" name="unit">
        <c:forEach items="${unitList}" var="unit">
            <option value="${unit}">${unit}</option>
        </c:forEach>
    </select>
    <input type="submit" value="Submit">
</form>

</body>
</html>
