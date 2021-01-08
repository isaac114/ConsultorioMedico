package jpa;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Test;
import entidades.Paciente;
import dao.DAOFactory;
import dao.FacturaCabeceraDAO;
import entidades.FacturaCabecera;

class JPAFacturaCabeceraDAOTest {
	FacturaCabeceraDAO facturaDAO = DAOFactory.getFactory().getFacturaCabeceraDAO();
    FacturaCabecera factura = new FacturaCabecera(10.85,15.2,8.23);
	int tiempoLimite = 100;
    //Test para la Creacion de la Factura
	@Test
	void testTimeCreate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			facturaDAO.create(factura);
	    });
		
	}

	@Test
	void testTimeUpdate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			factura.setTotalFacturaCabecera(10.55);
			factura.setIvaFacturaCabecera(16);
			
			facturaDAO.update(factura);
	    });
	}

	@Test
	void testTimeRead() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			facturaDAO.read(1);
	    });
	}

	@Test
	void testTimeDelete() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			facturaDAO.delete(factura);
	    });
	}
}
