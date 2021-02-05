package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOFactory;
import entidades.HistorialClinico;
import entidades.Medico;
import entidades.Paciente;

/**
 * Servlet implementation class AgregarHistorialClinico
 */
@WebServlet("/AgregarHistorialClinico")
public class AgregarHistorialClinico extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarHistorialClinico() {
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
		String cedula=request.getParameter("nomPac");
		Paciente pac= DAOFactory.getFactory().getPacienteDAO().buscarPorCedula(cedula);
		Medico med= (Medico) request.getSession().getAttribute("medicoLog");
		
		DAOFactory.getFactory().getHistorialClinicoDAO().create(new HistorialClinico(0, med, pac));
		response.sendRedirect("http://localhost:8080/ConsultorioMedico/Medico/agregarHistorialClinico.jsp");
	}

}
