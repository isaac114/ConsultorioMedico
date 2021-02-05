package servlets;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.*;
import entidades.Persona;

/**
 * Servlet implementation class RegistrarSecretaria
 */
@WebServlet("/RegistrarSecretaria")
public class RegistrarSecretaria extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public RegistrarSecretaria() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombres = request.getParameter("nombres");
		String apellidos = request.getParameter("apellidos");
		String cedula = request.getParameter("cedula");
		String correo = request.getParameter("correo");
		String contrasena = request.getParameter("contrasena");
		String telefono = request.getParameter("telefono");
		
		System.out.println("Datos recuperados de la secretaria: "+nombres+" "+apellidos+" "+cedula+" "+correo+" "+contrasena+" "+telefono);
		
		try {
			
			PersonaDAO secretariaDao = DAOFactory.getFactory().getPersonaDAO();
			Persona secretaria = new Persona(0, nombres,apellidos,cedula,correo,contrasena,telefono,"S");
			secretariaDao.create(secretaria);
			System.out.println("Secretaria creada con exito...");
			
		}catch(Exception e) {
			
			System.out.println("Error al registrar persona secretaria...");
			System.out.println("Error: " + e.getStackTrace());
		
		}
		
	}

}
