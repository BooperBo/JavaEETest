<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: User
  Date: 20.07.2022
  Time: 14:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>First JSP</title>
</head>
<body>
<h1>Testing JSP</h1>
<p>

    <%--<%String name = request.getParameter("name");%>
    <%="Hello, " + name%>--%>
    
    <%--<%@page import="java.util.Date, logic.TestClass" %>
    <%TestClass testClass = new TestClass();%>
    <%=testClass.getInfo()%>--%>

    <%--<% Object now = new Date();
        String someString = "Текущая дата : " + now;
    %>
    <%=someString%>--%>

    <%--<%
        for (int i = 0; i < 5; i++) {
            out.println("<p>" + "Test out " + i + "</p>");

        }
    %>--%>

</p>
</body>
</html>
