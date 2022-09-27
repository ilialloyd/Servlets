<%@ page import="java.util.Date" %>
<%@ page import="static com.example.expressions.HelloWorld.hi" %>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <title>JSP - Test</title>
</head>
<body>
<!-- importing jsp file to another jsp file  -->
<%@ include file="header.jsp" %>


<h1>JSP Expression tag</h1>
<!-- JSP Expressions tag -->
<p>JSP Expression tags allows you to directly put Java expressions into an HTML file.
This includes math expressions, boolean expressions and calling methods that return
values to be displayed on the page.
Here is a few examples:</p>
<br>
<!-- Math method will get values and will return result and tag will convert it to String -->
<p> This is the return value of Math() method: <%= Math.addExact(2,3)%></p>
<p>Evaluating a boolean method: <%= "bob".length()<3 %></p>
<p> Math Expression: <%= (500.6*7)-50 %></p>
<p>Java Object: <%= new Date() %>  </p>

<p> In each example, they are implicitly being converted into String before being added to the HTML</p>

<%-- this is also comment tag --%>

<h1>JSP Scriptlet Tags</h1>
<p>These are you you inject multiple lines of Java code into the JSP to do
things like if statement,call methods or whatever you need</p>
<%
    double myTestScore = 100.0;
    myTestScore=myTestScore-50.0;
%>
<p>My real test score <%= myTestScore %></p>
<p>Statements</p><br>

<% if(1+1==2){ %>
        <p>One plus one indeed equal to two</p>
<% }else{  %>
<p>Nevermind, I am a dumbo!</p>
<% } %>
<br>

<ul>
    <%
        for(int i=1;i<=10;i++){ %>
    <li>Listing #<%= i %></li>
    <% } %>

</ul>
    <h1>JSP Declaration Tags </h1>
    <%-- You can declare method inside decleration tag --%>

    <%!
        int add(int num1, int num2){
            return num1+num2;
        }

        int subtract(int num1,int num2){
            return num1- num2;
        }
    %>
<br>

    <p>Result of 34+5 = <%= add(34,5)%></p>
    <p>Result of 34-12 = <%= subtract(34,12)%></p>

    <%!
        String name = "Ilham";
        int workYear = 1;
         String getWorkPlace(){
             return "\"I work for Larche Arnprior" ;
         }
    %>
<br>
<h3>My name is <%= name %> and <%=getWorkPlace() %> for <%= workYear %> now.</h3>


<h1>JSP Directive Tags</h1>
<!-- In here you need to import first in the top of the page first. then yu will able to use methods from ClassPage -->
<p> <%= hi() %></p>

<h3> How to import one JSP file to other</h3>

<%@ include file="footer.jsp" %>

</body>
</html>