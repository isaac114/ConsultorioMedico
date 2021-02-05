package servlets;

import java.io.IOException;  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.*;
import entidades.*;

/**
 * Servlet implementation class ComprobarUsuario
 */
@WebServlet("/ComprobarUsuario")
public class ComprobarUsuario extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
 
	//CONSTRUCTOR OBLIGATORIO. 
    public ComprobarUsuario() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String correo = request.getParameter("correo");
		String contrasena = request.getParameter("contrasena");
		System.out.println("Servlet: ComprobarUsuario.java - Datos: "+correo+" "+contrasena);
		
		PersonaDAO personaDao = DAOFactory.getFactory().getPersonaDAO();
		Persona persona = personaDao.buscar(correo, contrasena);
		
		if(persona != null) {
			
			System.out.println("Persona: "+persona.getCorreo()+", recuperado satisfactoriamente...");
			String rol = persona.getRol();
			int codigo = persona.getId();
			
			if(rol.equals("A")) {
				
				System.out.println("El usuario es Administracion...");
				
				String nombre_administrador = persona.getNombres();
				String apellido_administrador = persona.getApellidos();
				String cedula_administrador = persona.getCedula();
				String correo_administrador = persona.getCorreo();
				String telefono_administrador = persona.getTelefono();
				
				request.getSession().setAttribute("SesionAdministrador", "Logeado-Administrador");
				response.sendRedirect("http://localhost:8080/ConsultorioMedico/Administrador/IndexAdmin.jsp?nombre="+nombre_administrador
									  +"&apellido="+apellido_administrador+"&cedula="+cedula_administrador+"&correo="+correo_administrador
									  +"&telefono="+telefono_administrador);
				
				
			} else if(rol.equals("M")) {
				
				System.out.println("El usuario es Medico...");
				
				MedicoDAO medicoDao = DAOFactory.getFactory().getMedicDAO();
				Medico medico = medicoDao.read(codigo);
				
				String nombre_medico = medico.getNombres();
				String apellido_medico = medico.getApellidos();
				String cedula_medico = medico.getCedula();
				String correo_medico = medico.getCorreo();
				String telefono_medico = medico.getTelefono();
				String especialidad_medico = medico.getEspecialidad();
				
				request.getSession().setAttribute("SesionMedico", "Logeado-Medico");
				//response.sendRedirect("http://localhost:8080/ConsultorioMedico/JPSs/VentanaUsuario.jsp?correo="+email);
				
			} else if(rol.equals("P")) {
				
				System.out.println("El usuario es Paciente...");
				
			} else if(rol.equals("S")) {
				
				System.out.println("El usuario es Secretaria...");
				String nombre_secre = persona.getNombres();
				String apellido_secre = persona.getApellidos();
				String cedula_secre = persona.getCedula();
				String correo_secre = persona.getCorreo();
				String telefono_secre = persona.getTelefono();
				
				request.getSession().setAttribute("SesionSecretaria", "Logeado-Secretaria");
				response.sendRedirect("http://localhost:8080/ConsultorioMedico/Secretaria/IndexSecretaria.jsp?nombre="+nombre_secre
									  +"&apellido="+apellido_secre+"&cedula="+cedula_secre+"&correo="+correo_secre
									  +"&telefono="+telefono_secre);
								
			} else {
				
				System.out.println("Error usuario anormal...");
				
			}
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
