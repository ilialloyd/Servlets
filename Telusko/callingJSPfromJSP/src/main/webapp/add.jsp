
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<body bgcolor="cyan">
<%
       int i = Integer.parseInt(request.getParameter("num1"));
       int j = Integer.parseInt(request.getParameter("num2"));
       int k = i + j;

       out.println("Output: "+k);

%>
</body>
</html>
