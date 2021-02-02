package servlets;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.*;
import entidades.*;

@WebServlet("/RegistrarMedico")
public class RegistrarMedico extends HttpServlet {
	
	private static final long serialVersionUID = 1L;
       
    public RegistrarMedico() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String nombres = request.getParameter("nombres");
		String apellidos = request.getParameter("apellidos");
		String cedula = request.getParameter("cedula");
		String correo = request.getParameter("correo");
		String telefono = request.getParameter("telefono");
		String especialidad = request.getParameter("especialidad");
		
		System.out.println("Datos recuperados medico: " + nombres + " " + apellidos + " " + cedula + " " + correo + " " + telefono + " " + especialidad);
		
		try {
			
			MedicoDAO medicoDao = DAOFactory.getFactory().getMedicDAO();
			Medico medico = new Medico(0, nombres,apellidos,cedula,correo,telefono,especialidad);
			medicoDao.create(medico);
			
		}catch(Exception e) {
			
			System.out.println("Error: " + e.getStackTrace());
		
		}
		
	}

}
