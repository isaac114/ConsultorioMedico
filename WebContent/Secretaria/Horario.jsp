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
	<link href="https://fonts.googleapis.com/css?family=Roboto:100,100i,300,300i,400,400i,500,500i,700,700i,900,900i" rel="stylesheet">
	<link rel="stylesheet"
					href="http://localhost:8080/ConsultorioMedico/Diseno/css/calendario.css">
<title>Calendario</title>
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
	<!------ Include the above in your HEAD tag ---------->
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
	  				<a href="http://localhost:8080/ConsultorioMedico/Secretaria/CitasMedicas.jsp" action="http://localhost:8080/ConsultorioMedico/ListarCitas" class="set-width text-center display-inline-block my-1"><i class="fa fa-sticky-note-o"></i></a>
	  				<a href="#" class="set-width text-center display-inline-block my-1"><i class="fa fa-database"></i></a>
	  			</div>
	  		</div>
	  	</div>


		<% CitaMedica cita = new CitaMedica(); %> 
		<% List<CitaMedica> list= (List<CitaMedica>)request.getAttribute("citas"); %>
	       

	<div class="container">
			
			 <div class="row">
                  <div class="col-md-12">
                     <div class="full">
                        <div class="heading_main text_align_center">
                        <br/>
                          <br/>
                           <h2></h2>
                        </div>
                     </div>
                  </div>
               </div>
               
               <div class="row">
                  <div class="col-md-12">
                     <div class="full">
                        <div class="heading_main text_align_center">
                        <br/>
                          <br/>
                           <h2></h2>
                        </div>
                     </div>
                  </div>
               </div>
               <div class="row">
			        <div class="col-md-12">
			            <h2>Calendario - Cita</h2>
			        </div>
               <div class=col-xs-4>
               	 <table class="table table-striped table-condensed">
                  <thead>
                   <tr>
                   		  <th scope="col">C�digo</th>
					      <th scope="col">Fecha</th>
					      <th scope="col">Salas </th>
					      <th scope="col">Medico-Nombres </th>
					      <th scope="col">Medico-Apellidos </th>
					      <th scope="col"> Especialidad</th>
					      <th scope="col">Acci�n</th>
			    </tr>
              </thead>   
              <tbody>
                 <tbody class="bg-light">
			  
				  <% for(int i =1 ; i < list.size(); i++) { %>
		           	  
					<% cita = list.get(i); %>
		              <tr>
		               <th scope="row"><%out.println(cita.getId());%></td>
		               <td><%out.println(cita.getFecha());%></td>
		               <td><%out.println(cita.getNombreSala());%></td>
		               <td><%out.println(cita.getMedico().getNombres());%></td>
		               <td><%out.println(cita.getMedico().getApellidos());%></td>
		               <td><%out.println(cita.getMedico().getEspecialidad());%></td>
		          		<td><a href="http://www.jquery2dotnet.com" class="btn btn-sm btn-primary btn-block" role="button">buy</a></td>
		          		</tr>
		              <% } %>
			  </tbody>
         
              </table>
               </div>
	</div>

</div>

<!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.2.1.slim.min.js"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js"></script>
    <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" ></script>
    <script type="text/javascript">
    	jQuery(document).ready(function(){
    		jQuery("#open-menu").click(function(){
    			if(jQuery('#page-container').hasClass('show-menu')){
    			jQuery("#page-container").removeClass('show-menu');
    		}
    			
    			else{
    			jQuery("#page-container").addClass('show-menu');
    			}
    		});
    	});
    </script>
    
</body>
</html>