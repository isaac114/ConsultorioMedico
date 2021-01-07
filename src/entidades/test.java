package entidades;

import dao.ConsultaClinicaDAO;
import dao.DAOFactory;
import dao.HistorialClinicoDAO;
import dao.MedicoDAO;
import dao.OrdenMedicaDAO;
import dao.PacienteDAO;
import dao.RecetaMedicaDAO;



public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Comienza");
		MedicoDAO medicoDao = DAOFactory.getFactory().getMedicDAO();
		PacienteDAO pacienteDao = DAOFactory.getFactory().getPacienteDAO();
		HistorialClinicoDAO historialDao = DAOFactory.getFactory().getHistorialClinicoDAO();
		ConsultaClinicaDAO consultaDao = DAOFactory.getFactory().getConsultaClinicaDAO();
		RecetaMedicaDAO recetaDao = DAOFactory.getFactory().getRecetaMedicaDAO();
		OrdenMedicaDAO ordenDao = DAOFactory.getFactory().getOrdenMedicaDAO();
	      
	    Medico med = new Medico(0, "Eduardo", "Chavez", "0107371083", "isaac.114", "01072653", "Obstetra");
	    Paciente pac = new Paciente(0, "Juan Luis", "Guerra", "0293847263", "we", "we");
	    HistorialClinico hc = new HistorialClinico(0, med, pac);
	    ConsultaClinica cc = new ConsultaClinica(0, "Tos", "Neumonia", hc);
	    RecetaMedica rm = new RecetaMedica(0, "Complejo B", 10, "Cada 10 hrs", pac, cc);
	    OrdenMedica om = new OrdenMedica(0, "7/1/2021", "Resonancia Magnetica", pac, med);
	    //Create
	    System.out.println("Creando");
	    medicoDao.create(med);
	    pacienteDao.create(pac);
	    historialDao.create(hc);
	    consultaDao.create(cc);
	    recetaDao.create(rm);
	    ordenDao.create(om);
	    
	    //Buscando
	    System.out.println("Buscando");
	    System.out.println("Medico: "+medicoDao.read(1).getNombres());
	    System.out.println("Paciente: "+pacienteDao.read(2).getCedula());
	    System.out.println("Historial: "+historialDao.read(1).getMedico().getEspecialidad());
	    System.out.println("Consulta: "+consultaDao.read(1).getDiagnostico());
	    System.out.println("Receta:" +recetaDao.read(1).getMedicamento());
	    System.out.println("Orden: "+ordenDao.read(1).getFecha());
	    
	    //Actualizando
	    System.out.println("Actualizando");
	    med.setNombres("Juan Antonio");
	    medicoDao.update(med);
	    pac.setCedula("1");
	    pacienteDao.update(pac);
	    cc.setDiagnostico("Covid19");
	    consultaDao.update(cc);
	    rm.setFrecuencia("never");
	    recetaDao.update(rm);
	    om.setFecha("11/11/11");
	    ordenDao.update(om);
	    System.out.println("Reimprimiendo");
	    System.out.println("Medico: "+medicoDao.read(1).getNombres());
	    System.out.println("Paciente: "+pacienteDao.read(2).getCedula());
	    System.out.println("Historial: "+historialDao.read(1).getMedico().getEspecialidad());
	    System.out.println("Consulta: "+consultaDao.read(1).getDiagnostico());
	    System.out.println("Receta:" +recetaDao.read(1).getMedicamento());
	    System.out.println("Orden: "+ordenDao.read(1).getFecha());
	    
	    
	    System.out.println("Termina");
	     
	}

}
