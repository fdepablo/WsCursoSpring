<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>Bienvenidos al alta de la persona</h1>
	<h1 style="color:red">${usuario.nombre}</h1>
	<!-- con model atribute decimos con que argumento @ModelAtribute queremos
		conectarlo
	 -->
	<f:form action="addProducto" method="POST" modelAttribute="producto">
		Nombre Producto:<f:input placeholder="Nombre" path="nombre"/>
		<br/>
	    Precio Producto:<f:input placeholder="Precio" path="precio"/>
	    <br/>	 		    
		<button type="submit" >Enviar Persona</button>
	</f:form>
	
	<table>
		<tr>
			<th>ID</th>
			<th>Nombre</th>
			<th>Precio</th>
		</tr>
		<c:forEach items="${usuario.listaProductos}" var="p">
		    <tr>      
		        <td>${p.id}</td>
		        <td>${p.nombre}</td>
		        <td>${p.precio}</td>
		    </tr>
	    </c:forEach>
    </table>	
</body>
</html> 