<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="java.util.List" %>
	<%@ page import="java.util.ArrayList" %>
	<%@ page import="entidades.Medico" %>
	<%@ page import="entidades.Paciente" %>
	<%@ page import="entidades.CitaMedica" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
 <div class="container-md">
    	<% CitaMedica citas = new CitaMedica(); %> 
		<% List< CitaMedica> list= (List< CitaMedica>)request.getAttribute("citas"); %>
	       
	       
	       <table class="table">
			  <thead class="thead-dark">
			    <tr>
			      <th scope="col">ID</th>
			      <th scope="col">Fecha</th>
			      <th scope="col">Salas </th>
			      <th scope="col">Paciente </th>
			      <th scope="col">Medico </th>
			    </tr>
			  </thead>
			  <tbody class="bg-light">
				  <% for(int i = 0; i < list.size(); i++) {%>
		           	  <tr>
					<% citas = list.get(i); %>
		               <th scope="row"><%out.println(citas.getId());%></td>
		               <td><%out.println(citas.getFecha());%></td>
		               <td><%out.println(citas.getNombreSala());%></td>
		               <td><%out.println(citas.getMedico().getNombres());%></td>
		               <td><%out.println(citas.getPaciente().getNombres());%></td>
		          		</tr>
		              <% } %>
			  </tbody>
			</table>
</body>
</html>