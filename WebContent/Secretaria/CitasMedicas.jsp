<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="entidades.Medico" %>
    <%@ page import="entidades.Paciente" %>
    <%@ page import="java.util.List" %>
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
    
<title>CitasMedicas</title>
</head>
<body style="background-color: #575757;">
	<% HttpSession sesion=request.getSession(); %>
	<% Medico medico = new Medico(); %>
	<% List<Medico> list= new ArrayList(); %>
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
    
	<div class=col-xs-4>
				<div></div>
				<div>
					<h2 style="color: white; font-size: 25px">Agregar Cita Medica</h2>
				</div>
				<div style="height: 30px"></div>
				<form method="post"
					action="/ConsultorioMedico/AgregarCitaMedica">
					
					<div class="form-group">
						<label style="color: white; font-size: 22px" for="start" >Fecha</label> 
						<input style="font-size: 18px" type="text" class="form-control" id="fecha" name="fecha">
					</div>
					<div class="form-group">
					<label style="color: white; font-size: 22px" for="descripcion">Sala Nro</label>
						<select style="color: black; font-size: 18px" id="sala" name = "sala" class="form-select" aria-label="Default select example">
						  <option selected>Escoger Sala</option>
						  <option style="font-size: 18px" type="text" id="sala" name = "sala">Sala 1</option>
						  <option style="font-size: 18px" type="text" id="sala" name = "sala">Sala 2</option>
						  <option style="font-size: 18px" type="text" id="sala" name = "sala">Sala 3</option>
						</select>
					</div>
					<div class="form-group">
						<label style="color: white; font-size: 22px" for="descripcion"> Doctor</label>
						<input style="font-size: 18px" type="text" class="form-control"
							id="cedulaMe" name="cedulaMe"
							placeholder="Ingrese Medico ">
					</div>
					
					<div class="form-group">
						<label style="color: white; font-size: 22px" for="precio">Paciente</label>
						<input style="font-size: 18px" type="text" class="form-control"
							id="paciente" name="paciente" placeholder="Ingrese cedula Paciente">
					</div>

					<button style="font-size: 18px" type="Agregar"
						class="btn btn-primary">Agregar</button>
				</form>
			</div>
			<form action="http://localhost:8080/ConsultorioMedico/ListarCitas" method="get">
					<h5 class=""><INPUT type="submit" class="linkEmp" value="Listar Citas"></h5>
					
			</form>
			
</body>
</html>