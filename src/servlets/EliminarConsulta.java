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
import dao.PacienteDAO;
import entidades.ConsultaClinica;
import entidades.Paciente;

/**
 * Servlet implementation class EliminarConsulta
 */
@WebServlet("/EliminarConsulta")
public class EliminarConsulta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarConsulta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Administrador/eliminarConsulta.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String CIPaciente = request.getParameter("CIpaciente");
		
		PacienteDAO pacienteDAO = DAOFactory.getFactory().getPacienteDAO();
		ConsultaClinicaDAO consultaDAO = DAOFactory.getFactory().getConsultaClinicaDAO();
		
		Paciente paciente = pacienteDAO.buscarPorCedula(CIPaciente);
		int ccID = consultaDAO.obtenerUltimaConsulta(paciente.getId());
		ConsultaClinica cc = consultaDAO.buscarPorID(ccID);
		
		if(paciente != null && cc != null) {
			consultaDAO.delete(cc);
		}
		response.sendRedirect("http://localhost:8080/ConsultorioMedico/Administrador/eliminarConsulta.jsp");
	}

}
