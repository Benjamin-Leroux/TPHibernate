<%--
  Created by IntelliJ IDEA.
  User: benja
  Date: 08/01/2022
  Time: 22:21
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Editer des temperatures</title>
</head>
<body>

<h1>Editer une temperature</h1>

    <div class="table">
        <c:forEach items="${regions}" var="region">
        <form class="tr" method="get" action="doEditTemperature">
            <div class="td">
                    ${region.name}
                <input type="hidden" name="regionName" value="${region.name}"/>
            </div>
            <div class="td"><input type="text" name="temperature" value="${region.temperature.value}"/></div>
            <div class="td"><button type="submit">Valider</button> </div>
        </form>
        </c:forEach>
    </div>

<a class="button" href="index"> Retourner à l'index</a>
</body>
</html>

<style><%@include file="/WEB-INF/css/style.css"%></style>
