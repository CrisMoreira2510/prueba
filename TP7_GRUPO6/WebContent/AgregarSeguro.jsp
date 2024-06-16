<%@ include file="Menu.jsp" %>
<%@page import= "dominio.Seguros" %>
<%@page import= "dominio.SegurosDao" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Agregar seguros </h1>

<%! 
	SegurosDao segDao = new SegurosDao();
	int proximoId = segDao.proximoIdSeguro();
%>

	<p>Id seguro: <%= proximoId %> </p>

<form action="servletSeguros" method="get">

	Tipo de seguro: 
	Costo de contratación: <input type="text" name="txtDescripcion"><br>
	Costo máximo asegurado: <input type="text" name="txtDescripcion"> <br>
	Costo minimo asegurado: <input type="text" name="txtDescripcion"> <br>

</form>

</body>
</html>