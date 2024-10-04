<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <title>Employee List</title>
</head>
<body>
<h2>Employee List</h2>
<a href="employee/showForm">Add New Employee</a>
<table border="1">
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Department</th>
        <th>Actions</th>
    </tr>
    <c:forEach var="employee" items="${employees}">
        <tr>
            <td>${employee.id}</td>
            <td>${employee.name}</td>
            <td>${employee.department}</td>
            <td>
                <a href="employee/updateForm?employeeId=${employee.id}">Update</a>
                <a href="employee/delete?employeeId=${employee.id}">Delete</a>
            </td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
