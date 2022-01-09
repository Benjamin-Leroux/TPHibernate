<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<style><%@include file="/WEB-INF/css/style.css"%></style>

<html>
<head>
    <title>Créer une région</title>
</head>
<body>
<h1>Création d'une nouvelle région</h1>
<div>
   <form method="get" action="saveNewRegion">
       <div class="form-example">
           <label for="name">Enter le nom: </label>
           <input type="text" name="name" id="name" required>
       </div>
       <div class="form-example">
           <label for="name">Enter la temperature </label>
           <input type="text" name="temperature" id="temperature" required>
       </div>
       <label for="country" >Pays: </label>
           <select id="country" name ="countryName">
               <c:forEach items="${countries}" var="country">
                   <option value="${country.name}">${country.name}</option>
               </c:forEach>
           </select>

       <button type="submit">Créer</button>
   </form>
    <a class="button" href="index"> Retourner à l'index</a>
</div>
</body>
</html>