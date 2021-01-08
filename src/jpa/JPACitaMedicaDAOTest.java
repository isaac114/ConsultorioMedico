package jpa;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.Test;

import dao.CitaMedicaDAO;
import dao.DAOFactory;
import dao.MedicoDAO;
import dao.PacienteDAO;
import entidades.CitaMedica;
import entidades.Medico;
import entidades.Paciente;

class JPACitaMedicaDAOTest {
	
	MedicoDAO medicoDao = DAOFactory.getFactory().getMedicDAO();
	PacienteDAO pacienteDao = DAOFactory.getFactory().getPacienteDAO();
	CitaMedicaDAO citaMedicaDAO = DAOFactory.getFactory().getCitaMedicaDAO();
	
	Medico med = new Medico(0, "Eduardo", "Chavez", "0107371083", "isaac.114", "01072653", "Pbstetra");
	Paciente pac = new Paciente(0, "Juan Luis", "Guerra", "0293847263", "we", "we");
	Medico med2 = new Medico(0, "Jessica", "Maribel", "0106835762", "jessica.21", "01072699", "Odontologia");
    Paciente pac2 = new Paciente(0, "Juan Luis2", "Guerra2", "02938472632", "we2", "we2");
	CitaMedica citaMedica1 = new CitaMedica(0,"7/1/2021","Sala 1",med,pac );
			
	int tiempoLimite = 70;
	
	
	@Test
	void testCreate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			medicoDao.create(med);
			pacienteDao.create(pac);
			citaMedicaDAO.create(citaMedica1);
		});
	}

	@Test
	void testUpdate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			citaMedica1.setFecha("08/01/2021");
			citaMedica1.setNombreSala("Sala 6");
			citaMedica1.setMedico(med2);
			citaMedica1.setPaciente(pac2);
	    });
	}

	@Test
	void testRead() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			citaMedicaDAO.read(1);
	    });
	}

	@Test
	void testDelete() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			citaMedicaDAO.delete(citaMedica1);
	    });
	}

}
