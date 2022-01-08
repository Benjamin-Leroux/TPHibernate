<%--
  Created by IntelliJ IDEA.
  User: benja
  Date: 08/01/2022
  Time: 21:38
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Regions</title>
</head>
<body>

<h1>Régions de ${countryName}</h1>

<ul>
    <c:forEach items="${regions}" var="region">
        <li>${region.name}</li>
    </c:forEach>
</ul>

</body>
</html>
