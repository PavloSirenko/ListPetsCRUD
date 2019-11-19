<%--
  Created by IntelliJ IDEA.
  User: Office
  Date: 26-Oct-19
  Time: 14:30
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <title>Add Pet</title>
</head>
<body>
<!-- header -->
<div align="center">
    <h1>Pets list app!</h1><br><br>
</div>

<div align="center">
    <div align="center">
        <%
            if (request.getAttribute("petName") != null) {
                out.println("Pet '" + request.getAttribute("petName") + "' added!");
            }
        %>
    </div>
    <div>
        <form method="post">
            <label>Type</label><br>
            <input type="text" name="type"/><br>
            <label>Name</label><br>
            <input type="text" name="name"/><br>
            <label>Age</label><br>
            <input type="text" name="age"/><br>
            <input type="submit" value="Add" /><br><br>
        </form>
    </div>
    <div>
        <button onclick="location.href='/index'">Back to main</button>
    </div>
</div>
</body>
</html>
