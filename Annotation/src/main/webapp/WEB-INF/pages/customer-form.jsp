<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>

    <meta charset="UTF-8">
    <title>User Information Form</title>
    <link rel="stylesheet" href="style-sheet/customer-form.css">
    <script type="text/javascript">
        function addProductRow() {
            var table = document.getElementById("productTable");
            var rowCount = table.rows.length;
            var row = table.insertRow(rowCount);

            var cell1 = row.insertCell(0);
            var element1 = document.createElement("input");
            element1.type = "text";
            element1.name = "prodects[" + rowCount + "].name";
            cell1.appendChild(element1);

            var cell2 = row.insertCell(1);
            var element2 = document.createElement("input");
            element2.type = "number";
            element2.name = "prodects[" + rowCount + "].price";
            cell2.appendChild(element2);
        }
    </script>
</head>
<body>
    <div class="form-container">
        <h1>User Information Form</h1>
        <form:form method="POST"  action="/customer/saveUserInfo">
            <label for="name">Name:</label>
            <input type="text" id="name" name="name" required>

            <label for="gender">Gender:</label>
            <select id="gender" name="gender" required>
                <option value="male">Male</option>
                <option value="female">Female</option>
                <option value="other">Other</option>
            </select>

            <label for="age">Age:</label>
            <input type="number" id="age" name="age" required>

            <label for="mobile">Mobile:</label>
            <input type="tel" id="mobile" name="mobile" required>

            <label for="email">Email:</label>
            <input type="email" id="email" name="email" required>

            <h2>Products</h2>
            <table id="productTable" class="table-size">
                <tr>
                    <th>Product Name</th>
                    <th>Product Price</th>
                </tr>
                <tr>
                    <td><input type="text" name="prodects[0].name" /></td>
                    <td><input type="number" name="prodects[0].price" /></td>
                </tr>
            </table>
            <input type="button" value="Add New Product" onclick="addProductRow()" />
            <button type="submit">Submit</button>
        </form:form>
    </div>
</body>
</html>