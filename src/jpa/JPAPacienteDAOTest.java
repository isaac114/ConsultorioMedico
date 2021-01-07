package jpa;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dao.DAOFactory;
import dao.PacienteDAO;
import entidades.Paciente;

class JPAPacienteDAOTest {
	PacienteDAO pacienteDao = DAOFactory.getFactory().getPacienteDAO();
	
	Paciente pac = new Paciente(0, "Juan Luis", "Guerra", "0293847263", "we", "we");
	
	int tiempoLimite = 70;

	@Test
	void testTimeCreate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			pacienteDao.create(pac);
	    });
	}

	@Test
	void testTimeUpdate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			pac.setNombres("Prueba");
			pac.setApellidos("Prueba");
			pac.setCedula("Prueba");
			pac.setCorreo("Correo");
			pac.setTelefono("Prueba");
			pacienteDao.update(pac);
	    });
	}

	@Test
	void testTimeRead() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			pacienteDao.read(1);
	    });
	}

	@Test
	void testTimeDelete() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			pacienteDao.delete(pac);
	    });
	}

}
