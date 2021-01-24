package servlets;

import java.io.IOException;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOFactory;
import entidades.CitaMedica;


/**
 * Servlet implementation class ListarCitas
 */
@WebServlet("/ListarCitas")
public class ListarCitas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListarCitas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		List<CitaMedica> ciList = DAOFactory.getFactory().getCitaMedicaDAO().read(id);
		//System.out.println("Total de Requerimientos " + reqListEmpresa.size());
		
		if(reqListEmpresa!=null) {
		for(int i=0;i<reqListEmpresa.size();i++) {
			Set<DetRequerimiento> reqListDetReq = new HashSet<DetRequerimiento>() ;
			List<DetRequerimiento> lista=DAOFactory.getFactory().getDetRequerimientoDAO().finByRequerimientoID(reqListEmpresa.get(i).getIdReq());
			reqListDetReq.addAll(lista);
			reqListEmpresa.get(i).setDetRequerimientos(reqListDetReq);
		}}
			
		session.setAttribute("listReqEmp", reqListEmpresa);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
