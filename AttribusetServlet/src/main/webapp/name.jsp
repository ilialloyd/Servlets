<%--@elvariable id="person" type="Person"--%>
<%--@elvariable id="age" type="NameServlet"--%>
<%--@elvariable id="error" type="NameServlet"--%>
<%--@elvariable id="lastName" type="NameServlet"--%>
<%--@elvariable id="firstName" type="NameServlet"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Name Page</title>
</head>
<body>
<!--if there will be error we wanna display that -->
<h1>Name MAster 2000</h1>

<hr>
<!--for use attribute inside your jsp file the syntax  -->
<p>${error}</p>
<!--what values we enter on the link, it will display as a html file on the page  -->
<!--//http://localhost:8080/name?firstName=Ilham&lastName=Mammadli like that -->
<!--Name and lastName will copy to page -->

<p>Hey ${person.firstName} ${person.lastName}, nice to meet you</p>
<p>You are ${person.age} years old</p>
</body>
</html>
