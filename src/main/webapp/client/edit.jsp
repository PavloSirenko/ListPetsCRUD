<%@ page import="com.psi.service.Pet" %>
<%@ page import="java.util.List" %>
<%@ page import="com.psi.dao.ListDB" %><%--
  Created by IntelliJ IDEA.
  User: Office
  Date: 26-Oct-19
  Time: 15:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <title>Edit Pet</title>
</head>
<body>
<div align="center">
    <h1>Pets list edit!</h1><br><br>
</div>
<div align="center">
        <% Pet pet = (Pet) request.getAttribute("pet");
            out.println("<form method=\"post\">" +
                "<input type=\"hidden\" value=\"" + ListDB.list().indexOf(pet) + "\" name=\"id\" />" +
                "<label>Type</label><br>" +
                "<input name=\"type\" value=\"" + pet.getType() + "\" /><br><br>" +
                "<label>Name</label><br>" +
                "<input name=\"name\" value=\"" + pet.getName() + "\" /><br><br>" +
                "<label>Age</label><br>" +
                "<input name=\"age\" value=\"" + pet.getAge() + "\" /><br><br>" +
                "<input type=\"submit\" value=\"Edit\" />" +
            "</form>");
        %>
</div>
</body>
</html>
