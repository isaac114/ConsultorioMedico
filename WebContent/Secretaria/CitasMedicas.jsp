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
		<meta content="width=device-width, initial-scale=1.0" name="viewport"></meta>
	<meta content="" name="description"></meta>
	<meta content="" name="keywords"></meta>
	
	<meta content="width=device-width, initial-scale=1.0" name="viewport"></meta>
	<meta content="" name="description"></meta>
	<meta content="" name="keywords"></meta>
	

    <!-- Bootstrap CSS -->
      <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css">
    <link rel="stylesheet" type="text/css" href="https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css">
    <link rel="stylesheet"
				href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css"
				integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u"
				crossorigin="anonymous">
	
			<link rel="stylesheet"
				href="http://localhost:8080/ConsultorioMedico/Diseno/css/styleS.css">
	
	<link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
				integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
				crossorigin="anonymous">
	<link rel="stylesheet"
				href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap-grid.css"
				integrity="sha384-Vkoo8x4CGsO3+Hhxv8T/Q5PaXtkKtu6ug5TOeNV6gBiFeWPGFN9MuhOf23Q9Ifjh"
				crossorigin="anonymous">
	<link href="https://cdnjs.cloudflare.com/ajax/libs/twitter-bootstrap/4.5.0/css/bootstrap.min.css"
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

<style type="text/css">
  	.navbar.bg-light{
  		background-color: #000 !important;
  		transition: ease 0.5s;
  	}
  	.user-profile{
  		width: 50px;
  		height: 50px;
  		background-color: #f1f1f1;
  	}
  	.navbar .menu-bar{
  		display: inline-block;
  		width: 50px;
  		height: 50px;
  		margin-right: 10px;
  		position: relative;
  		cursor: pointer;
  	}
  	.navbar .menu-bar .bars{
  		position: relative;
  		top:50%;
  		width:30px;
  		height: 2px;
  		background-color: #fff;
  	}
  	.navbar .menu-bar .bars::after{
  		content: "";
  		position: absolute;
  		bottom: -8px;
  		width: 100%;
  		height: 2px;
  		background-color: #fff;
  	}
  	.navbar .menu-bar .bars::before{
  		content: "";
  		position: absolute;
  		top:-8px;
  		width: 100%;
  		height: 2px;
  		background-color: #fff;
  	}
  	.navbar ul.navbar-nav li.nav-item.ets-right-0 .dropdown-menu{
  		left: auto;
  		right: 0;
  		position: absolute;
  	} 
  	.side-bar{
  		position: fixed;
	  	top:81px;
  		left:0;
  		padding: 15px;
  		display: inline-block;
  		width: 100px;
  		background-color: #fff;
  		box-shadow: 0px 0px 8px #ccc;
  		height: 100vh;
  		transition: ease 0.5s; 
  		overflow-y: auto;
  	}
  	.main-body-content{
  		display: inline-block;
  		padding: 15px;
  		background-color:#eef4fb;
  		height: 100vh;
  		padding-left: 100px;
  		transition: ease 0.5s; 
  	}
  	.ets-pt{
  		padding-top: 100px;
  	}
  	.main-admin.show-menu .side-bar{
  		width: 250px;
  	}

  	.main-admin.show-menu .main-body-content{
  		padding-left: 265px;
  	}
  	.main-admin.show-menu .navbar .menu-bar .bars{
  		width: 15px;
  	}
  	.main-admin.show-menu .navbar .menu-bar .bars::after{
  		width: 10px;
  	}
  	.main-admin.show-menu .navbar .menu-bar .bars::before{
  		width: 25px;
  	}
  	.main-admin.show-menu .side-bar-links{
  		opacity: 1;
  	}
  	.main-admin.show-menu .side-bar .side-bar-icons{
  		opacity: 0;
  	}
  	/**** end effacts ****/
  	.side-bar .side-bar-links{
  		opacity: 0;
  		transition:  ease 0.5s;
  	}
  	.side-bar .side-bar-links ul.navbar-nav li a{
  		font-size: 14px;
  		color: #000;
  		font-weight: 500;
  		padding: 10px;
  	}
  	.side-bar .side-bar-links ul.navbar-nav li a i{
  		font-size:20px;
  		color: #8ac1f6;
  	}
  	.side-bar .side-bar-links ul.navbar-nav li a:hover, .side-bar-links ul.navbar-nav li a:focus{
  		text-decoration: none;
  		background-color: #8ac1f6;
  		color:#fff;
  	}
  	.side-bar .side-bar-links ul.navbar-nav li a:hover i{
  		color:#fff;
  	}
  	.side-bar .side-bar-logo img{
  		width: 100px;
  		height: 100px;
  	}
  	.side-bar .side-bar-icons{
  		position: absolute;
  		top:20px;
  		right:0;
  		width: 100px;
  		opacity: 1;
  		transition: ease 0.5s;
  	}
  	.side-bar .side-bar-icons .side-bar-logo img{
  		width: 50px;
  		height: 50px;
  		object-fit: cover;
  	}
  	.side-bar .side-bar-icons .side-bar-logo h5{
  		font-size: 14px;
  	}
  	.side-bar .side-bar-icons .set-width{
  		color: #000;
  		font-size: 32px;
  	}
  	.side-bar .side-bar-icons .set-width:hover,.side-bar .side-bar-icons .set-width:focus{
  		color: #8ac1f6;
  		text-decoration: none;
  	}
  </style>
  
</head>
<body>
	<% HttpSession sesion=request.getSession(); %>
	<% Medico medico = new Medico(); %>
	<% List<Medico> list= new ArrayList(); %>
	<div id="page-container" class="main-admin">
	  	<nav class="navbar navbar-expand-lg navbar-light bg-light position-fixed w-100">
		  <a class="navbar-brand" href="#"></a>
		  <div id="open-menu" class="menu-bar">
		  	<div class="bars"></div>
		  </div>
		    <ul class="navbar-nav ml-auto">
		      <li class="nav-item dropdown ets-right-0">
		        <a class="nav-link dropdown-toggle" href="#" id="navbarDropdown" role="button" data-toggle="dropdown" aria-haspopup="true" aria-expanded="false">
		          <img src="http://localhost:8080/ConsultorioMedico/Diseno/Imagenes/fbss.png" class="img-fluid rounded-circle border user-profile">
		        </a>
		        <div class="dropdown-menu" aria-labelledby="navbarDropdown">
		          <a class="dropdown-item" href="#">Action</a>
		          <a class="dropdown-item" href="#">Another action</a>
		          <div class="dropdown-divider"></div>
		          <a class="dropdown-item" href="#">Something else here</a>
		        </div>
		      </li>
		    </ul>
		</nav>
	  	<div class="side-bar">
	  		<div class="side-bar-links">
	  			<div class="side-bar-logo text-center py-3">
	  				<img src="http://localhost:8080/ConsultorioMedico/Diseno/Imagenes/LogEm.png" class="img-fluid rounded-circle border bg-secoundry mb-3">
	  				<h5>Consultorio Medico</h5>
	  			</div>
	  			<ul class="navbar-nav">
	  				<li class="nav-item">
	  					<a href="#" class="nav-links d-block"><i class="fa fa-home pr-2"></i> Inicio</a>
	  				</li>
	  				<li class="nav-item">
	  					<a href="#" class="nav-links d-block"><i class="fa fa-home pr-2"></i> Contacto</a>
	  				</li>
	  				<li class="nav-item">
	  					<a href="#" class="nav-links d-block"><i class="fa fa-home pr-2"></i> Registrate</a>
	  				</li>
	  				<li class="nav-item">
	  					<a href="#" class="nav-links d-block"><i class="fa fa-home pr-2"></i> HOME</a>
	  				</li>
	  				<li class="nav-item">
	  					<a href="#" class="nav-links d-block"><i class="fa fa-home pr-2"></i> HOME</a>
	  				</li>
	  			</ul>
	  		</div>
	  		<div class="side-bar-icons">
	  			<!-- <div class="side-bar-logo text-center py-3">
	  				<img src="" class="img-fluid rounded-circle border bg-secoundry mb-3">
	  				<h5>Company Name</h5>
	  			</div> -->
	  			<div class="icons d-flex flex-column align-items-center">
	  				<a href="http://localhost:8080/ConsultorioMedico/Secretaria/IndexSecretaria.jsp" class="set-width text-center display-inline-block my-1"><i class="fa fa-home"></i></a>
	  				<a href="#" class="set-width text-center display-inline-block my-1"><i class="fa fa-users"></i></a>
	  				<a href="http://localhost:8080/ConsultorioMedico/Secretaria/ListarCitasMedicas.jsp" class="set-width text-center display-inline-block my-1"><i class="fa fa-list"></i></a>
	  				<a href="#" class="set-width text-center display-inline-block my-1"><i class="fa fa-sticky-note-o"></i></a>
	  				<a href="#" class="set-width text-center display-inline-block my-1"><i class="fa fa-file-text"></i></a>
	  				<a href="http://localhost:8080/ConsultorioMedico/Secretaria/CitasMedicas.jsp" class="set-width text-center display-inline-block my-1"><i class="fa fa-sticky-note-o"></i></a>
	  				<a href="#" class="set-width text-center display-inline-block my-1"><i class="fa fa-database"></i></a>
	  			</div>
	  		</div>
	  	</div>

    
 <div class="container">
	<div class=col-xs-4>
				<div></div>
				<div>
					<h2 style="color: white; font-size: 25px">Agregar Cita Medica</h2>
				</div>
				<div style="height: 50px"></div>
				<form method="post"
					action="/ConsultorioMedico/AgregarCitaMedica">
					
					<div class="form-group">
						<label style="color: black; font-size: 22px" for="start" >Fecha</label> 
						<input style="font-size: 18px" type="text" class="form-control" id="fecha" name="fecha">
						
					</div>
					<div class="form-group">
							<label style="color: black; font-size: 22px" for="start" >Hora</label> 
							<span class="input-group-addon" id="basic-addon1"><span class="glyphicon glyphicon-time" aria-hidden="true"></span></span>
            				<input class="form-control" name="registration-time" id="registration-time" type="time">
					
					</div>
					<div class="form-group">
					<label style="color: black; font-size: 22px" for="descripcion">Sala Nro</label>
						<select style="color: black; font-size: 18px" id="sala" name = "sala" class="form-select" aria-label="Default select example">
						  <option selected>Escoger Sala</option>
						  <option style="font-size: 18px" type="text" id="sala" name = "sala">Sala 1</option>
						  <option style="font-size: 18px" type="text" id="sala" name = "sala">Sala 2</option>
						  <option style="font-size: 18px" type="text" id="sala" name = "sala">Sala 3</option>
						</select>
					</div>
					<div class="form-group">
						<label style="color: black; font-size: 22px" for="descripcion"> Doctor</label>
						<input style="font-size: 18px" type="text" class="form-control"
							id="cedulaMe" name="cedulaMe"
							placeholder="Ingrese Medico ">
					</div>
					
					<div class="form-group">
						<label style="color: black; font-size: 22px" for="precio">Paciente</label>
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
			<form action="http://localhost:8080/ConsultorioMedico/Calendario" method="get">
					
					<h5 class=""><INPUT type="submit" class="linkEmp" value="Horario"></h5>
			</form>
			</div>
	</div>		
</body>
</html>