<%--
  Created by IntelliJ IDEA.
  User: benja
  Date: 08/01/2022
  Time: 22:01
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style><%@include file="/WEB-INF/css/style.css"%></style>

<html>
<head>
    <title>Supprimer une région</title>
</head>
<body>
    <h1>Supprimer des régions</h1>
    <ul>
        <c:forEach items="${regions}" var="region">
            <li>
                    ${region.country.name} - ${region.name} -> <a href="doDeleteRegion?regionName=${region.name}">Supprimer</a>
            </li>
        </c:forEach>
    </ul>
    <a class="button" href="index"> Retourner à l'index</a>
</body>
</html>
