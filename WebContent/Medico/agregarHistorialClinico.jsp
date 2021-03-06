<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="java.util.List"%>
<%@ page import="entidades.Paciente"%>
<%@ page import="entidades.Medico"%>
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
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/css/bootstrap.min.css"
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
<title>Document</title>

</head>
<body style="background-color: #575757;">
	<header class="container-fluid" id="cabecera">
		<div class="row">
			<div class="col-xs-11">
				<img
					src="http://localhost:8080/ConsultorioMedico/Diseno/Imagenes/l1.png"
					id="logo">
			</div>

		</div>

	</header>

	<!-- Default dropright button -->
	<div class="container-fluid">
		<div class="row">
		<div class=col-xs-4>
			<form method="post" action="/ConsultorioMedico/AgregarHistorialClinico">
				<div class="form-group">
				<% Medico med= (Medico) request.getSession().getAttribute("medicoLog");%>
					<label>Doctor: <%out.println(med.getNombres());%> </label>
				</div>
				<div class="form-group">
					<label>Escoja el Paciente:</label>
					<select  id="nomPac" name="nomPac" class="form-control"required >
	                   <option> </option>  
	                   <%
	                   	List<Paciente> listPaciente = (List<Paciente>) request.getSession().getAttribute("listaPaciente");
	                       for (Paciente pac : listPaciente) {
	                           out.println("<option value=" + pac.getCedula() + ">" + pac.getNombres() + "</option>");
	                       } %>
	                  </select>	
				</div>
				<button type="submit" style="font-size: 18px" type="Agregar"
						class="btn btn-primary"><small style="font-size: 15px">Agregar Historial</button>
			</form>
		</div>
		</div>
	</div>

	<div style="height: 465px">
		<h2></h2>
	</div>
	
	
	





	<!-- Footer -->
<footer class="page-footer font-small  darken-3 s"
	style="background-color: #393939; padding-top: 1opx;">

	<!-- Footer Elements -->
	<div class="container">

		<!-- Grid row-->
		<div class="row">

			<!-- Grid column -->
			<div class="col-md-12 py-5">
				<div class="mb-5 flex-center">

					<!-- Facebook -->
					<a class="fb-ic"> <i
						class="fab fa-facebook-f fa-lg white-text mr-md-5 mr-3 fa-2x">
					</i>
					</a>
					<!-- Twitter -->
					<a class="tw-ic"> <i
						class="fab fa-twitter fa-lg white-text mr-md-5 mr-3 fa-2x"> </i>
					</a>
					<!-- Google +-->
					<a class="gplus-ic"> <i
						class="fab fa-google-plus-g fa-lg white-text mr-md-5 mr-3 fa-2x">
					</i>
					</a>
					<!--Linkedin -->
					<a class="li-ic"> <i
						class="fab fa-linkedin-in fa-lg white-text mr-md-5 mr-3 fa-2x">
					</i>
					</a>
					<!--Instagram-->
					<a class="ins-ic"> <i
						class="fab fa-instagram fa-lg white-text mr-md-5 mr-3 fa-2x">
					</i>
					</a>
					<!--Pinterest-->
					<a class="pin-ic"> <i
						class="fab fa-pinterest fa-lg white-text fa-2x"> </i>
					</a>
				</div>
			</div>
			<!-- Grid column -->

		</div>
		<!-- Grid row-->

	</div>
	<!-- Footer Elements -->

	<!-- Copyright -->
	<div class="footer-copyright text-center py-3"
		style="background-color: #1E1E1E;">
		� 2020 Copyright: <a href="https://www.ups.edu.ec/"> ups.edu.ec</a>
	</div>
	<!-- Copyright -->

</footer>
	

	<!-- Latest compiled and minified JavaScript -->
	<script
		src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"
		integrity="sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa"
		crossorigin="anonymous"></script>
	<script src="https://code.jquery.com/jquery-3.5.1.min.js"></script>
	<script src="https://code.jquery.com/jquery-3.4.1.slim.min.js"
		integrity="sha384-J6qa4849blE2+poT4WnyKhv5vZF5SrPo0iEjwBvKU7imGFAV0wwj1yYfoRSJoZ+n"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.16.0/dist/umd/popper.min.js"
		integrity="sha384-Q6E9RHvbIyZFJoft+2mJbHaEWldlvI9IOYy5n3zV9zzTtmI3UksdQRVvoxMfooAo"
		crossorigin="anonymous"></script>
	<script
		src="https://stackpath.bootstrapcdn.com/bootstrap/4.4.1/js/bootstrap.min.js"
		integrity="sha384-wfSDF2E50Y2D1uUdj0O3uMBJnjuUD4Ih7YwaYd1iqfktj0Uod8GCExl3Og8ifwB6"
		crossorigin="anonymous"></script>
	<script type="text/javascript" src="diseno/js/ControladorAdmin.js"></script>

	


</body>
</html>
