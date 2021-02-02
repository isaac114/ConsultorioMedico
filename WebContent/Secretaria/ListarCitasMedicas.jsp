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
	<meta name="viewport"
				content="width=device-width,user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
			<!-- Latest compiled and minified CSS -->
			<link rel="stylesheet"
				href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
				integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
				crossorigin="anonymous">
			<link rel="stylesheet"
				href="http://localhost:8080/ConsultorioMedico/Diseno/css/diseno.css">
			<link rel="stylesheet"
				href="http://localhost:8080/ConsultorioMedico/Diseno/css/style.css">
			<link rel="stylesheet"
				href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
				integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
				crossorigin="anonymous">
			<link rel="stylesheet"
				href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap-grid.css"
				integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
				crossorigin="anonymous">
			<!-- Font Awesome -->
			<link rel="stylesheet"
				href="https://use.fontawesome.com/releases/v5.8.2/css/all.css">
			<!-- Google Fonts -->
			<link rel="stylesheet"
				href="https://fonts.googleapis.com/css?family=Roboto:300,400,500,700&display=swap">
			<!-- Bootstrap core CSS -->
			<link
				href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css"
				rel="stylesheet">
			<!-- Material Design Bootstrap -->
			<link
				href="https://cdnjs.cloudflare.com/ajax/libs/mdbootstrap/4.19.1/css/mdb.min.css"
				rel="stylesheet">
				<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.0-beta1/dist/js/bootstrap.bundle.min.js" integrity="sha384-ygbV9kiqUc6oa4msXn9868pTtWMgiQaeYH7/t7LECLbyPA2x65Kgf80OJFdroafW" crossorigin="anonymous"></script>
			<script src="https://cdnjs.cloudflare.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
	    <link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/css/bootstrap-datepicker.min.css" />
	    <script src="https://cdnjs.cloudflare.com/ajax/libs/bootstrap-datepicker/1.5.0/js/bootstrap-datepicker.min.js"></script>
    
    	<script>
        $( document ).ready(function() {
            $('#fecha').datepicker();
        });
    </script>
    
<title>Listar</title>
</head>
<body>
	<header>
        <ul class="nav mt-2 justify-content-end">
            <li class="nav-item">
              <a class="nav-link active" href="<%=request.getContextPath()%>/Admin/Administrador.jsp">Inicio</a>
            </li>
             <li class="nav-item">
                <a class="nav-link dropdown-toggle" data-toggle="dropdown" href="#" role="button" aria-haspopup="true" aria-expanded="false">Citas Medicas</a>
              <div class="dropdown-menu">
                <a class="dropdown-item" href="<%=request.getContextPath()%>/Admin/RegistrarProducto.jsp">Agregar Citas Medicas</a>
                <a class="dropdown-item" href="<%=request.getContextPath()%>/Admin/EdiDelProductos.jsp">Editar Citas Medicas</a>
                <a class="dropdown-item" href="<%=request.getContextPath()%>/Admin/EdiDelProductos.jsp">Eliminar Citas Medicas</a>
                <a class="dropdown-item" href="#">Buscar Citas Medicas</a>
                <a class="dropdown-item" href="<%=request.getContextPath()%>/Admin/EdiDelProductos.jsp">Listar Citas Medicas</a>
              </div>
            </li>
            <li class="nav-item">
              <a class="nav-link" href="#">Salir</a>
            </li>
           
          </ul>
    </header>

		<% CitaMedica cita = new CitaMedica(); %> 
		<% List<CitaMedica> list= (List<CitaMedica>)request.getAttribute("citas"); %>
	       
 <div class="container-md">
    	
	       
	       <table class="table">
			  <thead class="thead-dark">
			    <tr>
			      <th scope="col">ID</th>
			      <th scope="col">Fecha</th>
			      <th scope="col">Salas </th>
			      <th scope="col">Paciente-Nombres </th>
			      <th scope="col">Paciente-Apellidos </th>
			      <th scope="col">Medico-Nombres </th>
			      <th scope="col">Medico-Apellidos </th>
			    </tr>
			  </thead>
			  <tbody class="bg-light">
			  
				  <% for(int i =1 ; i < list.size(); i++) { %>
		           	  
					<% cita = list.get(i); %>
		              <tr>
		               <th scope="row"><%out.println(cita.getId());%></td>
		               <td><%out.println(cita.getFecha());%></td>
		               <td><%out.println(cita.getNombreSala());%></td>
		               <td><%out.println(cita.getMedico().getNombres());%></td>
		               <td><%out.println(cita.getMedico().getApellidos());%></td>
		               <td><%out.println(cita.getPaciente().getNombres());%></td>
		               <td><%out.println(cita.getPaciente().getApellidos());%></td>
		          		</tr>
		              <% } %>
			  </tbody>
			</table>
	</div>
</body>
</html>