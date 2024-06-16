<%@ include file="Menu.jsp" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1> Soy la página inicio </h1>




<form method="post" action="Inicio.jsp">

<input type="submit" name="btnAceptar" value="aceptar" />

</form>


<%

    String texto="Hola ";

    if(request.getParameter("btnAceptar")!= null)

    {

     texto += " alumnos";

%>

       <%=texto%>

<%

    }

%>

</body>
</html>