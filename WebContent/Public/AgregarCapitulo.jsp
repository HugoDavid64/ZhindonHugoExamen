<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="lista" scope="request" value="${libro}" />
	<h1>Lista de Libros</h1>

	<table>
		<tr>
			<td><strong>Nombre</strong></td>
			<td><strong>ISBN</strong></td>
			<td><strong>PAGINAS</strong></td>
			<td><strong>CODIGO</strong></td>
		</tr>
		<c:forEach var="p" items="${lista}">
			<tr>
				<td>${p.nombre}</td>				
				<td>${p.ISBN}</td>
				<td>${p.paginas}</td>
				<td>${p.codigo}</td>
			</tr>
		</c:forEach>
	</table>

</body>
</html>