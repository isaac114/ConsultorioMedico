package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAOFactory;
import dao.PacienteDAO;
import entidades.CitaMedica;
import entidades.Paciente;

/**
 * Servlet implementation class BuscarPersona
 */
@WebServlet("/BuscarPacienteFac")
public class BuscarPacienteFac extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BuscarPacienteFac() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PacienteDAO pacDAO = DAOFactory.getFactory().getPacienteDAO();
		HttpSession sesion = request.getSession();
		String cedula = request.getParameter("cedula");
		System.out.println("la cedula es"+cedula);
		Paciente busquedaPaciente=null;
		sesion.setAttribute("busquedaPaciente", busquedaPaciente);
		try {
			busquedaPaciente=pacDAO.buscarPorCedula(cedula);
		}catch (Exception e) {
			
		} 
		if (busquedaPaciente==null) {
			sesion.setAttribute("busquedaPaciente", null);
			request.getRequestDispatcher("/Secretaria/Factura.jsp").forward(request, response);
		}
		else if (busquedaPaciente!=null) {
			sesion.setAttribute("busquedaPaciente", busquedaPaciente);
			request.getRequestDispatcher("/Secretaria/Factura.jsp").forward(request, response);
		}

		
	}

}
