package servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.CitaMedicaDAO;
import dao.DAOFactory;
import dao.MedicoDAO;
import dao.PacienteDAO;
import entidades.CitaMedica;
import entidades.Medico;
import entidades.Paciente;
import entidades.Persona;

/**
 * Servlet implementation class AgregarCitaMedica
 */
@WebServlet("/AgregarCitaMedica")
public class AgregarCitaMedica extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarCitaMedica() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		RequestDispatcher dispatcher = request.getRequestDispatcher("/Secretaria/CitasMedicas.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession sesion = request.getSession();
		String fecha = request.getParameter("fecha");
		String sala = request.getParameter("sala");
		String cedulaM = request.getParameter("cedulaMe");
		String cedulap = request.getParameter("paciente");
		doGet(request, response);
		System.out.println("Datos Cita medica> "+fecha+" | "+sala+ " | "+cedulaM+" | "+cedulap);
		
		PacienteDAO pacDao = DAOFactory.getFactory().getPacienteDAO();
		MedicoDAO medDao = DAOFactory.getFactory().getMedicDAO();
		CitaMedicaDAO ctDao = DAOFactory.getFactory().getCitaMedicaDAO();
		
		
		Medico medico = medDao.buscarPorCedula(cedulaM);
		
		Paciente paciente = pacDao.buscarPorCedula(cedulap);
		
		
		
		try {
			CitaMedica citM = new CitaMedica(0, fecha,sala);
			citM.setMedico(medico);
			citM.setPaciente(paciente);
			ctDao.create(citM);
			System.out.println("Cita Medica creada ..."+citM);
			request.getRequestDispatcher("/Secretaria/CitasMedicas.jsp").forward(request, response);
		}catch (Exception e) {
			System.out.println("Problema al crear cita Medica.. "+ e.getMessage());
		}
	}

}
