package servlets;

import java.io.IOException; 
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.*;

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
		
		PersonaDAO personaDao;
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
