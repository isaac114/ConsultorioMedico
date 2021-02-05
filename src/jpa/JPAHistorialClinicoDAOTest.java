package jpa;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dao.DAOFactory;
import dao.HistorialClinicoDAO;
import dao.MedicoDAO;
import dao.PacienteDAO;
import entidades.HistorialClinico;
import entidades.Medico;
import entidades.Paciente;

class JPAHistorialClinicoDAOTest {
	Medico med = new Medico(0, "Eduardo", "Chavez", "0107371083", "isaac.114", "123", "01072653", "Obstetra","M");
    Paciente pac = new Paciente(0, "Juan Luis", "Guerra", "0293847263", "123", "we", "we","P");
    Medico med2 = new Medico(0, "Eduardo2", "Chavez2", "01073710832", "isaac.1142", "123", "010726532", "Obstetra","M");
    Paciente pac2 = new Paciente(0, "Juan Luis2", "Guerra2", "02938472632", "123", "we2", "we2","P");
    HistorialClinico hc = new HistorialClinico(0, med, pac);
    MedicoDAO medicoDao = DAOFactory.getFactory().getMedicDAO();
	PacienteDAO pacienteDao = DAOFactory.getFactory().getPacienteDAO();
	HistorialClinicoDAO historialDao = DAOFactory.getFactory().getHistorialClinicoDAO();
	int tiempoLimite = 70;

	@Test
	void testTimeCreate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			medicoDao.create(med);
		    pacienteDao.create(pac);
			historialDao.create(hc);
	    });
		
	}

	@Test
	void testTimeUpdate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			hc.setMedico(med2);
			hc.setPaciente(pac2);
			historialDao.update(hc);
	    });
	}

	@Test
	void testTimeRead() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			historialDao.read(1);
	    });
	}

	@Test
	void testTimeDelete() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			historialDao.delete(hc);
	    });
	}

}
