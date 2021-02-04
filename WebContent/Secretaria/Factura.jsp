<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
 <%@ page import="entidades.Paciente" %>
<!DOCTYPE html>
<html>
<head>
	<meta charset="ISO-8859-1">
	<title>Factura</title>
	<link rel="stylesheet" type='text/css' href="<%=request.getContextPath()%>/Diseno/CSSW/factura.css" />     
</head>
<script>
function agregarDetalle(){
    var costo = document.getElementById("costo").value;
    var descripcion = document.getElementById("decripcion").value;   
    var subtotal  = document.getElementById("subtotal").value; 
    if (subtotal==""){
    	subtotal=0;
    }
    if (costo != "" && descripcion != ""){
    	 
    	subtotalCont= parseFloat(subtotal)+parseFloat(costo);
    	console.log(subtotalCont)
    	subtotalCont=Math.round(subtotalCont*100)/100
    	document.getElementById("subtotal").value=String(subtotalCont)
    	iva= (parseFloat(subtotalCont) *.12);
    	iva=Math.round(iva*100)/100
    	document.getElementById("iva").value=String(iva)
    	total=(parseFloat(subtotalCont)+parseFloat(iva));
    	total=Math.round(total*100)/100
    	document.getElementById("total").value=String(total)
		cantidadproductos = document.getElementById("cantidadFactura").value;
		cantidadproductos++;
		document.getElementById("cantidadFactura").value =cantidadproductos; 
		var fila="<tr><td><input name='costo"+cantidadproductos+"' id='costo"+cantidadproductos+"' value='"+costo+"' /></td><td><input name='desc"+cantidadproductos+"' value='"+descripcion+"'/></td></tr>";
	    var btn = document.createElement("TR");
	   	btn.innerHTML=fila;
	    document.getElementById("tablita").appendChild(btn);
	}else{
		alert("Ingrese el costo y descripcion");
	}
    
}

function eliminarDetalle() {
    var table = document.getElementById("tablita");
    var rowCount = table.rows.length;
    console.log(rowCount);
	var subtotal  = document.getElementById("subtotal").value; 
	if(rowCount == 1){
    	document.getElementById("subtotal").value=""; 
    	document.getElementById("iva").value="";
    	document.getElementById("total").value="";
    }
    if (rowCount < 1)
        alert('No se puede eliminar el encabezado');
    else {
    	var costoEliminado=document.getElementById("costo"+rowCount).value;
    	console.log(costoEliminado)
    	subtotalCont= parseFloat(subtotal)-parseFloat(costoEliminado);
    	console.log(subtotalCont)
    	subtotalCont=Math.round(subtotalCont*100)/100
    	document.getElementById("subtotal").value=subtotalCont
    	iva= (parseFloat(subtotalCont) *.12);
    	iva=Math.round(iva*100)/100
    	document.getElementById("iva").value=iva
    	total=(parseFloat(subtotalCont)+parseFloat(iva));
    	iva=Math.round(total*100)/100
    	document.getElementById("total").value=total
    	table.deleteRow(rowCount - 1);
	    cantidadproductos = document.getElementById("cantidadFactura").value;
	    cantidadproductos--;
	    document.getElementById("cantidadFactura").value = cantidadproductos;
    }
    
    
}
</script>

<body>
	 <% HttpSession sesion=request.getSession(); %>
	<%Paciente pacienteBusqueda=(Paciente)sesion.getAttribute("busquedaPaciente");%>

	 <div class="modal">
	 <div class="modalCont">
	   	<div class="buscarPaciente">

	   		<h1 >Buscar Usuario</h1>
	   		<br>
	  		<form action="/ConsultorioMedico/BuscarPacienteFac" method="post">
			<input style="width: 50%" type="text" name="cedula" id="cedula" placeholder="Ingrese Cedula" />
			<button class="button" id="buscarPaciente">Buscar</button>
			</form>
		</div>
		<br>
		<div class="agregarDetalle">
			<h1>Agregar Detalle</h1>
			<br>
			<input style="width: 20%" type="text" name=costo id="costo" placeholder="Ingrese Costo" />
			<input style="width: 70%" type="text" name="decripcion" id="decripcion" placeholder="Ingrese Descripcion" />
			<br>
			<br>
			<button style="margin-left: 10%" class="button" id="agregarDetalle" onclick="agregarDetalle()" >Agregar</button>
			<button style="margin-left: 3%" class="button" id="eliminarDetalle" onclick="eliminarDetalle()">Eliminar</button>
		</div>
		
	  </div>
	  
    <div class="modal__container">
      <div class="modal__featured">
      <div class="modal__circle"></div>
      </div>
      <div class="modal__content">
      
        <h1 style="text-align: center; font-size: 30px; color: #939393;">Factura </h1>
        <br>
         <form name="formFac" id="formFac" action="/ConsultorioMedico/AgregarFactura" method="post">
        <% if (pacienteBusqueda==null){
        	out.println("<li class='form-list__row form-list__row--inline'>");
			out.println("<div>");
			out.println("<label>Cedula</label>");
			out.println("<input type='text' name='cedula' id='cedula' />");
			out.println("</div>");
            out.println("</li>");
            out.println("<li class='form-list__row form-list__row--inline'>");
            out.println("<div>");
            out.println("<label>Nombres</label>");
            out.println("<input type='text' name='nombres' id='nombres'/>");
            out.println("</div>");
            out.println("</li>");
            out.println("<li class='form-list__row form-list__row--inline'>");
            out.println("<div>");
            out.println("<label>Apellidos</label>");
            out.println("<input type='text' name='apellidos' id='apellidos'/>");
            out.println("</div>");
            out.println("</li>");
            out.println("<li class='form-list__row form-list__row--inline'>");
            out.println("<div>");
            out.println("<label>Correo</label>");
            out.println("<input type='text' name='correo' id='correo' />");
            out.println("</div>");
            out.println("<div>");
            out.println("<label>Telefono</label>");
            out.println("<input type='text' name='telefono' id='telefono'/>");
            out.println("</div>");
            out.println("</li>");        	
        }else if (pacienteBusqueda!=null){
        	out.println("<li class='form-list__row form-list__row--inline'>");
			out.println("<div>");
			out.println("<label>Cedula</label>");
			out.println("<input type='text' name='cedula' id='cedula' value="+pacienteBusqueda.getCedula()+" disabled='true' />");
			out.println("</div>");
            out.println("</li>");
            out.println("<li class='form-list__row form-list__row--inline'>");
            out.println("<div>");
            out.println("<label>Nombres</label>");
            out.println("<input type='text' name='nombres' id='nombres' value="+pacienteBusqueda.getNombres()+" disabled='true'/>");
            out.println("</div>");
            out.println("</li>");
            out.println("<li class='form-list__row form-list__row--inline'>");
            out.println("<div>");
            out.println("<label>Apellidos</label>");
            out.println("<input type='text' name='apellidos' id='apellidos' value="+pacienteBusqueda.getApellidos()+" disabled='true'/>");
            out.println("</div>");
            out.println("</li>");
            out.println("<li class='form-list__row form-list__row--inline'>");
            out.println("<div>");
            out.println("<label>Correo</label>");
            out.println("<input type='text' name='correo' id='correo' value="+pacienteBusqueda.getCorreo()+" disabled='true' />");
            out.println("</div>");
            out.println("<div>");
            out.println("<label>Telefono</label>");
            out.println("<input type='text' name='telefono' id='telefono' value="+pacienteBusqueda.getTelefono()+" disabled='true'/>");
            out.println("</div>");
            out.println("</li>");
        	
        } %>
		 <input type='hidden' id='cantidadFactura'  name="cantidadFactura" value='0'>
		 
            <li class="form-list__row form-list__row--inline">
            <div>
              <table class="tableFac">
                <thead class="">
                  <tr>
                    <th width="20%" scope="col">Costo</th>
                    <th scope="col">Descripcion</th>
                  </tr>
                </thead>
                <tbody class="bg-light" id="tablita">
                </tbody>
              </table>
			</div>
            </li>


            <li class="form-list__row form-list__row--inline"  style="width: 20%; font-size: 20px;">
              <div >
                <label   style="font-size: 15px">Subtotal: </label>
                <input type='text' name='subtotal' id='subtotal'  />
               
              </div>
              </li>
              <li class="form-list__row form-list__row--inline"  style="width: 20%; font-size: 20px;">
              <div>
                <label style="font-size: 15px;"> Iva:</label>
                <input type='text' name='iva' id='iva'  />
               
              </div>
               </li>
              <li class="form-list__row form-list__row--inline"  style="width: 20%; font-size: 20px;">
              <div>
                <label style="font-size: 15px;">Total:</label>
                <input type='text' name='total' id='total' />
               
              </div>
               </li>
            
            <br>
            <li class="form-list__row " style="text-align: center;" >
                <button class="button" >Generar Factura</button>
            </li>
          </ul>
          </form>
      </div> <!-- END: .modal__content -->
    </div> <!-- END: .modal__container -->
  </div> <!-- END: .modal -->

</body>
</html>