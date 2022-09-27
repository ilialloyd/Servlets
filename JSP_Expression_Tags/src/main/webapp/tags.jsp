<%--
  comment
--%>

<%-- Directive tag . or imports goes here
https://www.tutorialspoint.com/jsp/jsp_directives.htm
https://www.javatpoint.com/jsp-page-directive
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.Scanner" %>

<html>
<body>

<%-- Declaration
When you declare things it will be outside of service method // become belong to class to method--%>
<%!
  int coef = 5;

%>

<%--  Expression tag
Lets say you want to print someting
inttead of writing with method you can use expression
When you have = symbol there it will fetch data from exct variable or method--%>

<%-- My Fav number is: <% out.println(coef); %>  --%>
My favorite number is <%= coef %>


      <%-- Scriptlet tag -
      Whatever you mention into this tag will be a part of service method.
      It holds methods and ect --%>
<%
     int value = Integer.parseInt(request.getParameter("num1"));

     //or you can call any method without creating its object.
  //  Because when JSP will translate to JSP file it will create their object if needed
      out.println();

%>

</body>
</html>
