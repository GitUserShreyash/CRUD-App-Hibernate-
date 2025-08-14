<%@ page import="com.shreyash.CRUDApp.Employee.Employee" %>
<%
    Employee emp = (Employee) request.getAttribute("employee");
%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>Employee Details</title>
    <style>
        body {
            display: flex;
            justify-content: center;
            align-items: center;
            height: 100vh;
            margin: 0;
            background-color: #f0f2f5;
            font-family: Arial, sans-serif;
        }
        .card {
            background-color: #ffffff;
            border-radius: 10px;
            box-shadow: 0 2px 10px rgba(0, 0, 0, 0.1);
            padding: 20px;
            width: 300px;
            text-align: center;
        }
        h2 {
            margin-bottom: 20px;
            color: #2d3748;
            font-family: 'Segoe UI', Tahoma, Geneva, Verdana, sans-serif;
        }
        .detail {
            margin: 10px 0;
            display: flex;
            justify-content: space-between;
            padding: 8px;
            border-bottom: 1px solid #e0e0e0;
        }
        .detail:last-child {
            border-bottom: none;
        }
        .label {
            font-weight: bold;
            color: #555;
        }
        .value {
            color: #333;
        }
        .not-found {
            color: #ff0000;
        }
    </style>
</head>
<body>

<nav class="bg-[#2d3748] p-4">
    <h1 class="text-3xl font-bold text-white inline-block">Employee Management Portal</h1>
    <div class="float-right">
        <form action="home.html" method="post" class="inline">
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

<div class="card">
    <h2>Employee Details</h2>

    <%
        if (emp != null) {
    %>
        <div class="detail">
            <span class="label">ID:</span>
            <span class="value"><%= emp.getId() %></span>
        </div>
        <div class="detail">
            <span class="label">Name:</span>
            <span class="value"><%= emp.getName() %></span>
        </div>
        <div class="detail">
            <span class="label">Email:</span>
            <span class="value"><%= emp.getEmail() %></span>
        </div>
        <div class="detail">
            <span class="label">Department:</span>
            <span class="value"><%= emp.getDepartment() %></span>
        </div>
        <div class="detail">
            <span class="label">Designation:</span>
            <span class="value"><%= emp.getDesignation() %></span>
        </div>
        <div class="detail">
            <span class="label">Salary:</span>
            <span class="value"><%= emp.getSalary() %></span>
        </div>
    <%
        } else {
    %>
        <p class="not-found">Employee not found.</p>
    <%
        }
    %>
</div>

</body>
</html>
