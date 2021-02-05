package jpa;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dao.ConsultaClinicaDAO;
import dao.DAOFactory;
import dao.HistorialClinicoDAO;
import dao.MedicoDAO;
import dao.PacienteDAO;
import dao.RecetaMedicaDAO;
import entidades.ConsultaClinica;
import entidades.HistorialClinico;
import entidades.Medico;
import entidades.Paciente;
import entidades.RecetaMedica;

class JPARecetaMedicaDAOTest {
	RecetaMedicaDAO recetaDao = DAOFactory.getFactory().getRecetaMedicaDAO();
	MedicoDAO medicoDao = DAOFactory.getFactory().getMedicDAO();
	PacienteDAO pacienteDao = DAOFactory.getFactory().getPacienteDAO();
	ConsultaClinicaDAO consultaDao = DAOFactory.getFactory().getConsultaClinicaDAO();
	HistorialClinicoDAO historialDao = DAOFactory.getFactory().getHistorialClinicoDAO();
	
	Medico med = new Medico(0, "Eduardo", "Chavez", "0107371083", "isaac.114", "123", "01072653", "Obstetra");
    Paciente pac = new Paciente(0, "Juan Luis", "Guerra", "0293847263", "we", "123", "we");
    HistorialClinico hc = new HistorialClinico(0, med, pac);
    ConsultaClinica cc = new ConsultaClinica(0, "Tos", "Neumonia", hc);
    RecetaMedica rm = new RecetaMedica(0, "Complejo B", 10, "Cada 10 hrs", pac, cc);
	
	int tiempoLimite = 100;

	@Test
	void testTimeCreate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			 medicoDao.create(med);
			 pacienteDao.create(pac);
			 historialDao.create(hc);
			 consultaDao.create(cc);
			 recetaDao.create(rm);
	    });
	}

	@Test
	void testTimeUpdate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			rm.getPacienteReceta().setNombres("Prueba");
			rm.setCantidad(0);
			rm.setFrecuencia("Prueba");
			rm.setMedicamento("Prueba");
			recetaDao.update(rm);
	    });
	}

	@Test
	void testTimeRead() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			recetaDao.read(1);
	    });
	}

	@Test
	void testTimeDelete() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			recetaDao.delete(rm);
	    });
	}

}
