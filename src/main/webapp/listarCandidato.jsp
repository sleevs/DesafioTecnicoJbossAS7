<!DOCTYPE html>

<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<%@ taglib prefix="c" uri="/http://java.sun.com/jsp/jstl/cores" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>Lista</title>
</head>
<body>


	<table border="1" cellpadding="2" cellspacing="2">
		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Telefone</th>
			<th>Experi�ncia</th>
		</tr>
		<c:forEach var="candidato" items="${listar}">
		
			<tr>
				<td>${ candidato.nome}</td>
				<td>${ candidato.email}</td>
				<td>${ candidato.telefone}</td>
				<td>${ candidato.experiencia}</td>
			</tr>
			
		</c:forEach>
	
	</table>
</body>
</html>