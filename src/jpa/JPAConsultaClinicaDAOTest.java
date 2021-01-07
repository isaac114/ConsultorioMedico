/**
 * 
 */
package jpa;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;
import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.assertTimeout;

import dao.ConsultaClinicaDAO;
import dao.DAOFactory;
import dao.HistorialClinicoDAO;
import dao.MedicoDAO;
import dao.PacienteDAO;
import entidades.ConsultaClinica;
import entidades.HistorialClinico;
import entidades.Medico;
import entidades.Paciente;

/**
 * @author Isaac Chavez
 *
 */
class JPAConsultaClinicaDAOTest {
	Medico med = new Medico(0, "Eduardo", "Chavez", "0107371083", "isaac.114", "01072653", "Obstetra");
    Paciente pac = new Paciente(0, "Juan Luis", "Guerra", "0293847263", "we", "we");
    HistorialClinico hc = new HistorialClinico(0, med, pac);
	ConsultaClinica cc = new ConsultaClinica(0, "Tos", "Neumonia", hc);
	
	MedicoDAO medicoDao = DAOFactory.getFactory().getMedicDAO();
	PacienteDAO pacienteDao = DAOFactory.getFactory().getPacienteDAO();
	ConsultaClinicaDAO consultaDao = DAOFactory.getFactory().getConsultaClinicaDAO();
	HistorialClinicoDAO historialDao = DAOFactory.getFactory().getHistorialClinicoDAO();
	
	int tiempoLimite = 70;
	
	
	/**
	 * Test method for {@link jpa.JPAGenericDAO#create(java.lang.Object)}.
	 */
	@Test
	void testTimeCreate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			medicoDao.create(med);
		    pacienteDao.create(pac);
			historialDao.create(hc);
			consultaDao.create(cc);
	    });
		 
	}

	/**
	 * Test method for {@link jpa.JPAGenericDAO#update(java.lang.Object)}.
	 */
	@Test
	void testTimeUpdate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			cc.setDiagnostico("Prueba");
			cc.setSintoma("Prueba");
			consultaDao.update(cc);
	    });
	}

	/**
	 * Test method for {@link jpa.JPAGenericDAO#read(java.lang.Object)}.
	 */
	@Test
	void testTimeRead() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			consultaDao.read(1);
	    });
	}

	/**
	 * Test method for {@link jpa.JPAGenericDAO#delete(java.lang.Object)}.
	 */
	@Test
	void testTimeDelete() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			consultaDao.delete(cc);
	    });
	}

}
