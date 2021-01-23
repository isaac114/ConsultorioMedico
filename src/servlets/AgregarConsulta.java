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
import dao.MedicoDAO;
import dao.PacienteDAO;
import entidades.Medico;

/**
 * Servlet implementation class AgregarConsulta
 */
@WebServlet("/AgregarConsulta")
public class AgregarConsulta extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarConsulta() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Administrador/agregarConsulta.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String CIPaciente = request.getParameter("CIpaciente");
		String CIDoctor = request.getParameter("CIdoctor");
		String sintoma = request.getParameter("sintoma");
		String diagnostico = request.getParameter("Diagnostico");
		System.out.println(CIDoctor+CIPaciente+sintoma+diagnostico);
		doGet(request, response);
		
		PacienteDAO pacienteDAO = DAOFactory.getFactory().getPacienteDAO();
		MedicoDAO medicoDAO = DAOFactory.getFactory().getMedicDAO();
		HistorialClinicoDAO hcDAO = DAOFactory.getFactory().getHistorialClinicoDAO();
		ConsultaClinicaDAO consultaDAO = DAOFactory.getFactory().getConsultaClinicaDAO();
		
		Medico medico = medicoDAO.buscarPorCedula(CIDoctor);
		
	}

}
