package servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ConsultaClinicaDAO;
import dao.DAOFactory;
import dao.HistorialClinicoDAO;
import dao.PacienteDAO;
import dao.RecetaMedicaDAO;
import entidades.ConsultaClinica;
import entidades.Paciente;
import entidades.RecetaMedica;

/**
 * Servlet implementation class AgregarReceta
 */
@WebServlet("/AgregarReceta")
public class AgregarReceta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarReceta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Administrador/agregarReceta.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String medicamento = request.getParameter("medicamento");
		String cantidad = request.getParameter("cantidad");
		String frecuencia = request.getParameter("frecuencia");
		String cedulaPaciente = request.getParameter("paciente");
		System.out.println(medicamento+cantidad+frecuencia+cedulaPaciente);
		
		HistorialClinicoDAO hcDAO =DAOFactory.getFactory().getHistorialClinicoDAO(); 
		PacienteDAO pacienteDAO = DAOFactory.getFactory().getPacienteDAO();
		ConsultaClinicaDAO ccDAO = DAOFactory.getFactory().getConsultaClinicaDAO();
		RecetaMedicaDAO recetaDAO = DAOFactory.getFactory().getRecetaMedicaDAO();
		
		Paciente paciente = pacienteDAO.buscarPorCedula(cedulaPaciente);
		int idConsulta = ccDAO.obtenerUltimaConsulta(paciente.getId());
		ConsultaClinica cc = ccDAO.buscarPorID(idConsulta);
		
		if(medicamento != null && cantidad != null && frecuencia != null && cedulaPaciente != null) {
			RecetaMedica rm = new RecetaMedica(0, medicamento, Integer.parseInt(cantidad), frecuencia, paciente, cc);
			recetaDAO.create(rm);
		}
		
		response.sendRedirect("http://localhost:8080/ConsultorioMedico/Administrador/agregarReceta.jsp");
	}

}
