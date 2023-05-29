<%@taglib uri="http://struts.apache.org/tags-bean" prefix="bean"%>

<html>
<head>
</head>
<body>


	<table border="1" cellpadding="2" cellspacing="2">
		<tr>
			<th>Nome</th>
			<th>Email</th>
			<th>Telefone</th>
			<th>Experiência</th>
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