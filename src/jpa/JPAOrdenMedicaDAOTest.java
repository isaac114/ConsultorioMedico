package jpa;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dao.DAOFactory;
import dao.MedicoDAO;
import dao.OrdenMedicaDAO;
import dao.PacienteDAO;
import entidades.Medico;
import entidades.OrdenMedica;
import entidades.Paciente;

class JPAOrdenMedicaDAOTest {
	MedicoDAO medicoDao = DAOFactory.getFactory().getMedicDAO();
	PacienteDAO pacienteDao = DAOFactory.getFactory().getPacienteDAO();
	OrdenMedicaDAO ordenDao = DAOFactory.getFactory().getOrdenMedicaDAO();
	
	Medico med = new Medico(0, "Eduardo", "Chavez", "0107371083", "isaac.114", "01072653", "Pbstetra");
	Paciente pac = new Paciente(0, "Juan Luis", "Guerra", "0293847263", "we", "we");
	Medico med2 = new Medico(0, "Eduardo2", "Chavez2", "01073710832", "isaac.1142", "010726532", "Obstetra");
    Paciente pac2 = new Paciente(0, "Juan Luis2", "Guerra2", "02938472632", "we2", "we2");
	OrdenMedica om = new OrdenMedica(0, "7/1/2021", "Resonancia Magnetica", pac, med);
	 
	int tiempoLimite = 70;

	@Test
	void testCreate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			medicoDao.create(med);
			pacienteDao.create(pac);
			ordenDao.create(om);
	    });
	}

	@Test
	void testUpdate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			om.setMedicoOrdenMedica(med2);
			om.setPacienteOrdenMedica(pac2);
			om.setFecha("11/11/11");
			ordenDao.update(om);
	    });
	}

	@Test
	void testRead() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			ordenDao.read(1);
	    });
	}

	@Test
	void testDelete() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			ordenDao.delete(om);
	    });
	}

}
