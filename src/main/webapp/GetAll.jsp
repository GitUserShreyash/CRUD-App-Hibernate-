<%@ page contentType="text/html;charset=UTF-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <script src="https://cdn.tailwindcss.com"></script>
    <title>Employee Management Portal</title>
    <style>
        body {
            display: flex;
            justify-content: center; 
            margin: 0;
            flex-direction: column;
            font-family: Arial, sans-serif; 
            background-color: #f0f2f5; 
        }
        h1 {
            text-align: center;
            margin: 20px 0;
            color: #2d3748; 
        }
        .table {
            margin: 2rem 4rem 2rem;
            border-collapse: collapse;
            width: 90%;
            max-width: 1400px;
            background-color: #ffffff;
            box-shadow: 0 0 10px rgba(0, 0, 0, 0.1);
        }
        th, td {
            padding: 12px;
            text-align: left;
            border: 1px solid #e0e0e0;
        }
        th {
            background-color: #2d3748;
            color: #ffffff;
        }
        tr:nth-child(even) {
            background-color: #f9f9f9;
        }
        tr:hover {
            background-color: #e0e0e0;
        }
    </style>
</head>
<body>
<nav class="bg-[#2d3748] p-4">
    <h1 class="text-3xl font-bold text-white inline-block">Employee Management Portal</h1>
    <div class="float-right">
        <form action="Home.html" method="post" class="inline">
            <button type="submit" class="text-white px-4 py-2 hover:bg-[#4a5568] rounded bg-transparent border-none">Home</button>
        </form>

        <form action="GetAll" method="post" class="inline">
            <button type="submit" class="text-white px-4 py-2 hover:bg-[#4a5568] rounded bg-transparent border-none">All Employees</button>
        </form>

        <form action="add.html" method="post" class="inline">
            <button type="submit" class="text-white px-4 py-2 hover:bg-[#4a5568] rounded bg-transparent border-none">Add Employee</button>
        </form>
    </div>
</nav>

<h1 class="text-4xl font-bold text-center text-gray-800 mt-6">All Employees</h1>

<table class="table">
    <thead>
        <tr>
            <th>ID</th>
            <th>Name</th>
            <th>Email</th>
            <th>Phone</th>
            <th>Designation</th>
            <th>Department</th>
            <th>Salary</th>
        </tr>
    </thead>
    <tbody>
        <c:forEach var="emp" items="${employeeList}">
            <tr>
                <td>${emp.id}</td>
                <td>${emp.name}</td>
                <td>${emp.email}</td>
                <td>${emp.phone}</td>
                <td>${emp.designation}</td>
                <td>${emp.department}</td>
                <td>${emp.salary}</td>
            </tr>
        </c:forEach>
    </tbody>
</table>
</body>
</html>
