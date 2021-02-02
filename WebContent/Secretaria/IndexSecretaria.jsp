<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
				
<title>Insert title here</title>
</head>
<body style="background-color: #575757;">
<header class="container-fluid" id="cabecera">
		<div class="row">
			<div class="col-xs-11">
				<img
					src="http://localhost:8080/ConsultorioMedico/Diseno/Imagenes/logos2.png"
					id="logo">
			</div>

		</div>

	</header>
<div class="section about_section layout_padding dash_bg">
            <div class="container">
               <div class="row">
                  <div class="col-md-12">
                     <div class="full">
                        <div class="heading_main text_align_center">
                           <h2>Hola <%out.println();%>. ¿Qué quieres hacer?</h2>
                        </div>
                     </div>
                  </div>
               </div>
               <div class="row">
                  <div class="col-xs-6 col-sm-6 col-md-6 col-lg-3">
                     <div class="full feature_box">
                         <div class="full icon">
                            <a href=""><img class="default-block" src="http://localhost:8080/ConsultorioMedico/Diseno/Imagenes/empresaIC.png" alt="#" /></a>
                            <a href=""><img class="default-none" src="http://localhost:8080/ConsultorioMedico/Diseno/Imagenes/empresaIC.png" alt="#" /></a>
                         </div>
                         <div class="full">
                            <h4>Consultorio Medico</h4>
                         </div>
                         <div class="full">
                           <p>Datos importantes sobre nuestra empresa, además nuestros colaboradores.</p>
                         </div>
                     </div>
                  </div>
                  <div class="col-xs-6 col-sm-6 col-md-6 col-lg-3">
                     <div class="full feature_box">
                         <div class="full icon">
                            <a href="<%=request.getContextPath()%>/Admin/EdiDelProductos.jsp"><img class="default-block" src="http://localhost:8080/ConsultorioMedico/Diseno/Imagenes/ConsulMedicos.png" alt="#" /></a>
                            <a href="<%=request.getContextPath()%>/Admin/EdiDelProductos.jsp"><img class="default-none" src="http://localhost:8080/ConsultorioMedico/Diseno/Imagenes/ConsulMedicos.png" alt="#" /></a>
                         </div>
                         <div class="full">
                            <h4>Médicos</h4>
                         </div>
                         <div class="full">
                           <p>Puedes revisar los médicos existentes en la empresa y listarlos.</p>
                         </div>
                     </div>
                  </div>
                  <div class="col-xs-6 col-sm-6 col-md-6 col-lg-3">
                     <div class="full feature_box">
                         <div class="full icon">
                            <a href="<%=request.getContextPath()%>/Admin/ListarRequerimientos.jsp"><img class="default-block" src="http://localhost:8080/ConsultorioMedico/Diseno/Imagenes/citaMedica.jpg" alt="#" /></a>
                            <a href="<%=request.getContextPath()%>/Admin/ListarRequerimientos.jsp"><img class="default-none" src="http://localhost:8080/ConsultorioMedico/Diseno/Imagenes/citaMedica.jpg" alt="#" /></a>
                         </div>
                         <div class="full">
                            <h4>Citas Médicas</h4>
                         </div>
                         <div class="full">
                           <p>Generar citas médicas, horarios para el consultorio médico</p>
                         </div>
                     </div>
                  </div>
                  <div class="col-xs-6 col-sm-6 col-md-6 col-lg-3">
                     <div class="full feature_box">
                         <div class="full icon">
                            <a href="<%=request.getContextPath()%>/Admin/AdminPerfil.jsp"><img class="default-block" src="http://localhost:8080/ConsultorioMedico/Diseno/Imagenes/usuIC.png" alt="#" /></a>
                            <a href="<%=request.getContextPath()%>/Admin/AdminPerfil.jsp"><img class="default-none" src="http://localhost:8080/ConsultorioMedico/Diseno/Imagenes/usuIC.png" alt="#" /></a>
                         </div>
                         <div class="full">
                            <h4>Mi Perfil</h4>
                         </div>
                         <div class="full">
                           <p>Revisa tus datos personales para saber si los datos guardados son correctos.</p>
                         </div>
                     </div>
                  </div>
               </div>
            </div>
         </div>


</body>
</html>