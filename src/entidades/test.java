package entidades;

import dao.CitaMedicaDAO;
import dao.ConsultaClinicaDAO;

import dao.DAOFactory;
import dao.FacturaCabeceraDAO;
import dao.FacturaDetalleDAO;
import dao.HistorialClinicoDAO;
import dao.MedicoDAO;
import dao.OrdenMedicaDAO;
import dao.PacienteDAO;
import dao.RecetaMedicaDAO;



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Comienza");
		MedicoDAO medicoDao = DAOFactory.getFactory().getMedicDAO();
		PacienteDAO pacienteDao = DAOFactory.getFactory().getPacienteDAO();
		HistorialClinicoDAO historialDao = DAOFactory.getFactory().getHistorialClinicoDAO();
		ConsultaClinicaDAO consultaDao = DAOFactory.getFactory().getConsultaClinicaDAO();
		RecetaMedicaDAO recetaDao = DAOFactory.getFactory().getRecetaMedicaDAO();
		OrdenMedicaDAO ordenDao = DAOFactory.getFactory().getOrdenMedicaDAO();
		CitaMedicaDAO citaMedicaDAO = DAOFactory.getFactory().getCitaMedicaDAO();
		FacturaCabeceraDAO facCabDAO = DAOFactory.getFactory().getFacturaCabeceraDAO();
		FacturaDetalleDAO facDetDAO = DAOFactory.getFactory().getFacturaDetalleDAO();
		System.out.println();  
		
	    Medico med = new Medico(0, "Eduardo", "Chavez", "12", "isaac.114", "123", "01072653", "Obstetra");
	    Paciente pac = new Paciente(0, "Juan Luis", "Guerra", "34", "we", "123", "we");
	    HistorialClinico hc = new HistorialClinico(0, med, pac);
	    ConsultaClinica cc = new ConsultaClinica(0, "Tos", "Neumonia", hc);
	    RecetaMedica rm = new RecetaMedica(0, "Complejo B", 10, "Cada 10 hrs", pac, cc);
	    OrdenMedica om = new OrdenMedica(0, "7/1/2021", "Resonancia Magnetica", pac, med);
	    CitaMedica citaMedica = new CitaMedica(0, "7/1/2021", "Sala 1");
	    citaMedica.setMedico(med);
	    citaMedica.setPaciente(pac);
	    //FacturaCabecera facCab = new FacturaCabecera(35.23, 4.23, 39.46);
	    
	    //Create
	    System.out.println("Creando");
	    medicoDao.create(med);
	    pacienteDao.create(pac);
	    historialDao.create(hc);
	    consultaDao.create(cc);
	    recetaDao.create(rm);
	    ordenDao.create(om);
	    citaMedicaDAO.create(citaMedica);
	    
	    
	     
	}

}
