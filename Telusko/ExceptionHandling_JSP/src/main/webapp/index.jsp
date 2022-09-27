<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<%--Declaring error Page first --%>
<%@ page errorPage="error.jsp"%>
<!DOCTYPE html>
<html>
<body>

<%
    int k =9/0;
%>
<%--Try and catch is not good example in Jsp. Instead of that it is better
to create additional error Page and import it
--%>


<%-- How to handle exceptions in JSP
<%

    //this is not a good practise
    try {
        int k = 9 / 0; //to avoid of exception we can use try catch
        //HTTP Status 500 – Internal Server Error
    } catch (Exception e) {
        out.println("Error "+e.getMessage());

    }
%>
--%>

</body>
</html>