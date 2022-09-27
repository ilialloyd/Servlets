<%--We add isErrorPage="true" into declaration  --%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<html>
<body>
Error
<%--To use exception we should add isErrorPage=true on the declaration--%>
<%= exception.getMessage() %>






</body>
</html>
