<%@ page import="com.psi.service.Pet" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: Office
  Date: 25-Oct-19
  Time: 18:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<html>
<head>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
    <title>Main Pets List</title>
</head>
<body>
<!-- header -->
<div align="center">
    <h1>Pets list app!</h1><br><br>
</div>

<div align="center">
    <a href='<c:url value="/create" />'>Add new pet</a><br><br>
    <table cellpadding="15" border="1" align="center" width="30%" height="3%">
        <tr><th>Type</th><th>Name</th><th>Age</th><th>Update list</th></tr>
        <% List<Pet> names = (List<Pet>) request.getAttribute("petNames");

            if (names != null && !names.isEmpty()) {
                for (Pet s : names) {
                    out.println("<tr><td>" + s.getType() + "</td>" +
                            "<td>" + s.getName() + "</td>" +
                            "<td>" + s.getAge() + "</td>" +
                            //"<td>" + s.getId() + "</td>" +
                            "<td><form method=\"get\" action=\"/edit\" style=\"display:inline;\">" +
                            "<input type=\"hidden\" name=\"id\" value=\"" + names.indexOf(s) + "\">" +
                            "<input type=\"submit\" value=\"Edit\"></form>" + " or " +
                            "<form method=\"post\" action=\"/delete\" style=\"display:inline;\">" +
                            "<input type=\"hidden\" name=\"id\" value=\"" + names.indexOf(s) + "\">" +
                            "<input type=\"submit\" value=\"Delete\">" +
                            "</form></td></tr>");
                }
            } else out.println("<h5>There are no pets yet!</h5><br>");
        %>
        </table>
</div>
</body>
</html>
