package servlets;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.DAOFactory;
import dao.FacturaCabeceraDAO;
import dao.FacturaDetalleDAO;
import dao.PacienteDAO;
import entidades.FacturaCabecera;
import entidades.FacturaDetalle;
import entidades.Paciente;

/**
 * Servlet implementation class AgregarFactura
 */
@WebServlet("/AgregarFactura")
public class AgregarFactura extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AgregarFactura() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("Legga");
		double subtotal=Double.parseDouble(request.getParameter("subtotal"));
		double iva=Double.parseDouble(request.getParameter("iva"));
		double total=Double.parseDouble(request.getParameter("total"));
		System.out.println("Totales "+subtotal+ "," +iva+ ","+total);
		int catidadFactura= Integer.parseInt(request.getParameter("cantidadFactura"));
		System.out.println(catidadFactura);
		HttpSession sesion = request.getSession();
		Paciente paciente = (Paciente)sesion.getAttribute("busquedaPaciente");
		FacturaCabeceraDAO facturaCDAO= DAOFactory.getFactory().getFacturaCabeceraDAO();
		FacturaDetalleDAO facturaDDAO = DAOFactory.getFactory().getFacturaDetalleDAO();
		PacienteDAO pacDAO = DAOFactory.getFactory().getPacienteDAO();
		FacturaCabecera facturaC = new FacturaCabecera(total, subtotal ,iva);
		if(paciente==null) {
			String cedula=request.getParameter("cedula");
			String nombres=request.getParameter("nombres");
			String apellidos=request.getParameter("apellidos");
			String correo=request.getParameter("correo");
			String contrasena = request.getParameter("contrasena");
			String telefono=request.getParameter("telefono");
			Paciente pacienteNuevo=new Paciente(0,nombres,apellidos,cedula,correo,contrasena,telefono,"P");
			pacDAO.create(pacienteNuevo);
			facturaC.setPacienteFactura(pacienteNuevo);
			facturaCDAO.create(facturaC);
			for (int i = 1; i <= catidadFactura; i++) {
	    		double costo = Double.parseDouble(request.getParameter("costo"+i));
	    		String descripcion = request.getParameter("desc"+i);
	    		FacturaDetalle facturaDet = new FacturaDetalle(descripcion, costo);
	    		facturaDet.setFacturaDetalleCabecera(facturaC);
	    		facturaDDAO.create(facturaDet);
	    	}
			
		}
		else {
			facturaC.setPacienteFactura(paciente);
			facturaCDAO.create(facturaC);
			for (int i = 1; i <= catidadFactura; i++) {
	    		double costo = Double.parseDouble(request.getParameter("costo"+i));
	    		String descripcion = request.getParameter("desc"+i);
	    		FacturaDetalle facturaDet = new FacturaDetalle(descripcion, costo);
	    		facturaDet.setFacturaDetalleCabecera(facturaC);
	    		facturaDDAO.create(facturaDet);
	    	}
			
			sesion.setAttribute("busquedaPaciente", null);
		}
		response.sendRedirect("http://localhost:8080/ConsultorioMedico/Secretaria/Factura.jsp");
		
	}

}
