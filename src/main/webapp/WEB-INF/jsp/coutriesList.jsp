<%--
  Created by IntelliJ IDEA.
  User: Lila
  Date: 08/01/2022
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Liste des pays</title>
</head>
<body>
<h1>Liste des pays</h1>
<div>
    <table>
        <tr>
            <th>Nom du pays</th>
            <th>Président</th>
            <th>Temperature moyenne</th>
        </tr>
        <c:forEach items="${countries}" var="country">
            <tr>
                <td><a href="showRegion?countryName=${country.name}">${country.name}</a></td>
                <td>${country.president}</td>
                <td>${country.averageTemperature}</td>
            </tr>
        </c:forEach>
    </table>
</div>
</body>
</html>