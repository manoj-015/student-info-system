<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Student Management</title>
<style>
    body {
        font-family: Arial, sans-serif;
        background-color: #f4f4f4;
        margin: 0;
        padding: 0;
        display: flex;
        justify-content: center;
        align-items: center;
        height: 100vh;
    }
    #table-container {
        background: #fff;
        padding: 20px;
        border-radius: 8px;
        box-shadow: 0 0 10px rgba(0,0,0,0.1);
        width: 80%;
        max-width: 800px;
        overflow-x: auto; /* Allows horizontal scrolling for wide tables */
    }
    table {
        width: 100%;
        border-collapse: collapse;
    }
    th, td {
        border: 2px solid #ddd; /* Light border for cells */
        padding: 12px;
        text-align: left;
    }
    th {
        background-color: #007BFF;
        color: white;
        font-weight: bold;
    }
    tr:nth-child(even) {
        background-color: #f9f9f9; /* Alternating row colors for better readability */
    }
    tr:hover {
        background-color: #f1f1f1; /* Highlight row on hover */
    }
    .message {
        font-size: 18px;
        color: #555;
        margin-bottom: 20px;
    }
</style>
</head>
<body>

<div id="table-container">
    <div class="message">Students are coming soon... 😊</div>
    <table>
        <thead>
            <tr>
                <th>ID</th>
                <th>Name</th>
                <th>City</th>
            </tr>
        </thead>
        <tbody>
            <c:forEach var="student" items="${students}">
                <tr>
                    <td>${student.id}</td>
                    <td>${student.name}</td>
                    <td>${student.city}</td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
</div>

</body>
</html>
