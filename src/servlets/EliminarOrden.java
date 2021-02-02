package servlets;

import java.io.IOException;

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
 * Servlet implementation class EliminarOrden
 */
@WebServlet("/EliminarOrden")
public class EliminarOrden extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarOrden() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Administrador/eliminarOrden.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String CIPaciente = request.getParameter("CIpaciente");
		
		PacienteDAO pacienteDAO = DAOFactory.getFactory().getPacienteDAO();
		OrdenMedicaDAO ordenDAO = DAOFactory.getFactory().getOrdenMedicaDAO();
		
		Paciente paciente = pacienteDAO.buscarPorCedula(CIPaciente);
		int idOrden = ordenDAO.obtenerUltimaOrden(paciente.getId());
		OrdenMedica om = ordenDAO.read(idOrden);
		
		if(om != null) {
			ordenDAO.delete(om);
		}
	}

}
