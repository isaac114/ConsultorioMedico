package servlets;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.*;
import entidades.*;

@WebServlet("/RegistrarPacienteJor")
public class RegistrarPacienteJor extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public RegistrarPacienteJor() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombres = request.getParameter("nombres");
		String apellidos = request.getParameter("apellidos");
		String cedula = request.getParameter("cedula");
		String correo = request.getParameter("correo");
		String contrasena = request.getParameter("contrasena");
		String telefono = request.getParameter("telefono");
		
		System.out.println("Datos recuperados del paciente: "+nombres+" "+apellidos+" "+cedula+" "+correo+" "+contrasena+" "+telefono);
		
		try {
		
			PacienteDAO pacienteDao = DAOFactory.getFactory().getPacienteDAO();
			Paciente paciente = new Paciente(0, nombres,apellidos,cedula,correo,contrasena,telefono,"P");
			pacienteDao.create(paciente);
			
		}catch(Exception e) {
			
			System.out.println("Error al registrar paciente...");
			System.out.println("Error: " + e.getStackTrace());
		
		}
		
	}

}
