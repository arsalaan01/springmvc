<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Employee Form</title>
</head>
<body>
<h2>Employee Form</h2>
<form action="save" method="post">
    <input type="hidden" name="id" value="${employee.id}" />
    Name: <input type="text" name="name" value="${employee.name}" /><br>
    Department: <input type="text" name="department" value="${employee.department}" /><br>
    <input type="submit" value="Save" />
</form>
<a href="list">Back to Employee List</a>
</body>
</html>
