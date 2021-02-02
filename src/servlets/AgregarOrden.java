package servlets;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOFactory;
import dao.OrdenMedicaDAO;
import dao.PacienteDAO;
import entidades.OrdenMedica;
import entidades.Paciente;

/**
 * Servlet implementation class AgregarOrden
 */
@WebServlet("/AgregarOrden")
public class AgregarOrden extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarOrden() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Administrador/agregarOrden.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
		String fecha = sdf.format(new Date());
		String CIPaciente = request.getParameter("CIpaciente");
		String tratamiento = request.getParameter("tratamiento");
		
		PacienteDAO pacienteDAO = DAOFactory.getFactory().getPacienteDAO();
		OrdenMedicaDAO ordenDAO = DAOFactory.getFactory().getOrdenMedicaDAO();
		
		Paciente paciente = pacienteDAO.buscarPorCedula(CIPaciente);
		if(paciente != null) {
			OrdenMedica ordenMedica = new OrdenMedica(0, fecha, tratamiento, paciente, null);
			ordenDAO.create(ordenMedica);
		}
		response.sendRedirect("http://localhost:8080/ConsultorioMedico/Administrador/agregarOrden.jsp");
		
	}

}
