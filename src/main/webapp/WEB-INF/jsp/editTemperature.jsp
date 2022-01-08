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

    <c:forEach items="${temperatures}" var="temperature">
    <div class="table">
        <form class="tr" method="get" action="doEditTemperature">
            <span class="td">
                    ${temperature.region.name}
                <input type="hidden" name="regionName" value="${temperature.region.name}"/>
            </span>
            <span class="td"><input type="text" name="temperature" value="${temperature.value}"/></span>
            <span class="td"><button type="submit">Valider</button> </span>
        </form>
        <div>
    </c:forEach>

</body>
</html>

<style>
    DIV.table
    {
        display:table;
    }
    FORM.tr, DIV.tr
    {
        display:table-row;
    }
    SPAN.td
    {
        display:table-cell;
    }
</style>