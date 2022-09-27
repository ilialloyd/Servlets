<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--@elvariable id="label" type="com.example.jstldemo.DemoServlet"--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body>

<%-- How to fetch data from Servlet--%>

<%
    //this is one way of doing this
    String name = request.getAttribute("label").toString();
    //it returns object, we convert it to string using toString
    out.println(name);
%>

<%--We can use also with expression language--%>
     <p> ${label} </p><br>

<c:import url="https://goodreads.com/"></c:import>



</body>
</html>
