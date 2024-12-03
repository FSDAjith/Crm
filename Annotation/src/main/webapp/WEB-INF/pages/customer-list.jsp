<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Customer List</title>
    <link rel="stylesheet" href="/style-sheet/customer-list.css">
    <script type="text/javascript">
        function showProducts(customerId) {
            // Redirect to product page or fetch product details using AJAX
            window.location.href = "/product/" + customerId + "/products";
        }
        function addCustomer() { // Redirect to add customer page 
        	window.location.href = "/customer/template/form"; }
    </script>
</head>
<body>
    <div class="container">
        <h1>Customer List</h1>
        <button type="button" onclick="addCustomer()">Add Customer</button>
        <table>
            <thead>
                <tr>
                    <th>Name</th>
                    <th>Gender</th>
                    <th>Age</th>
                    <th>Mobile</th>
                    <th>Email</th>
                    <th>Products</th>
                </tr>
            </thead>
            <tbody>
                <c:forEach var="customer" items="${customers}">
                    <tr>
                        <td>${customer.name}</td>
                        <td>${customer.gender}</td>
                        <td>${customer.age}</td>
                        <td>${customer.mobile}</td>
                        <td>${customer.email}</td>
                        <td>
                            <button type="button" onclick="showProducts(${customer.id})">View Products</button>
                        </td>
                    </tr>
                </c:forEach>
            </tbody>
        </table>
    </div>
</body>
</html>
    