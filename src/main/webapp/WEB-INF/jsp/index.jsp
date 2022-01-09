<%--
  Created by IntelliJ IDEA.
  User: Lila
  Date: 08/01/2022
  Time: 12:17
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<style><%@include file="/WEB-INF/css/style.css"%></style>

<html>
<head>
    <title>Index</title>
</head>
<body>
    <h1>TP Hibernate</h1>
    <div>
        <ul>
            <li><a href="countriesList">Liste des pays</a></li>
            <li><a href="createRegion">Créer une région</a></li>
            <li><a href="goToDeleteRegion">Supprimer une région</a></li>
            <li><a href="goToEditTemperature">Modifier une température</a></li>
            <li><a href="">Affichage des pays dont une des régions à plus de 12 degrés</a></li>
        </ul>
    </div>
</body>
</html>