package jpa;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dao.DAOFactory;
import dao.MedicoDAO;
import entidades.Medico;

class JPAMedicoDAOTest {
	Medico med = new Medico(0, "Eduardo", "Chavez", "0107371083", "isaac.114", "01072653", "Obstetra");
	MedicoDAO medicoDao = DAOFactory.getFactory().getMedicDAO();
	int tiempoLimite = 70;

	@Test
	void testCreate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			medicoDao.create(med);
	    });
	}

	@Test
	void testUpdate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			med.setApellidos("Prueba");
			med.setNombres("Prueba");
			med.setEspecialidad("Prueba");
			med.setCorreo("Prueba");
			med.setTelefono("Prueba");
			medicoDao.update(med);
	    });
	}

	@Test
	void testRead() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			medicoDao.read(1);
	    });
	}

	@Test
	void testDelete() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			medicoDao.delete(med);
	    });
	}

}
