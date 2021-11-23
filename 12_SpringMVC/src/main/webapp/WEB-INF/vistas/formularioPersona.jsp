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
	<!-- con model atribute decimos con que argumento @ModelAtribute queremos
		conectarlo
	 -->
	<f:form action="doFormularioVideojuego" method="POST" modelAttribute="persona">
	
		<f:input placeholder="Nombre" path="nombre"/><!-- persona.nombre -->
		<f:input placeholder="Edad" path="edad"/>
	    <f:input placeholder="Peso" path="peso"/>
	 		    
		<button type="submit" >Enviar Persona</button>
	</f:form>
	
	<table>
		<tr>
			<th>Nombre</th>
			<th>Edad</th>
			<th>Peso</th>
		</tr>
		<c:forEach items="${lista}" var="p">
		    <tr>      
		        <td>${p.nombre}</td>
		        <td>${p.edad}</td>
		        <td>${p.peso}</td>
		    </tr>
	    </c:forEach>
    </table>	
</body>
</html>