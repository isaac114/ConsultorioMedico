package jpa;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import dao.DAOFactory;
import dao.FacturaDetalleDAO;
import entidades.FacturaDetalle;

class JPAFacturaDetalleDAOTest {

	FacturaDetalleDAO facturaDetalleDAO = DAOFactory.getFactory().getFacturaDetalleDAO();
	FacturaDetalle facturaDetalle = new FacturaDetalle("Rayos X",22.5);
	int tiempoLimite = 70;
    //Test para la Creacion de la Factura
	@Test
	void testTimeCreate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			facturaDetalleDAO.create(facturaDetalle);
	    });
		
	}

	@Test
	void testTimeUpdate() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			facturaDetalle.setDescripcionFacturaDetalle("Inyeccion");
			
			facturaDetalleDAO.update(facturaDetalle);
	    });
	}

	@Test
	void testTimeRead() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			facturaDetalleDAO.read(1);
	    });
	}

	@Test
	void testTimeDelete() {
		assertTimeout(ofMillis(tiempoLimite), () -> {
			facturaDetalleDAO.delete(facturaDetalle);
	    });
	}

}
