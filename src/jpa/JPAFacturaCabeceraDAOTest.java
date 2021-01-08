package jpa;

import static java.time.Duration.ofMillis;
import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;
import entidades.Paciente;
import dao.DAOFactory;
import dao.FacturaCabeceraDAO;
import entidades.FacturaCabecera;
import entidades.FacturaDetalle;

class JPAFacturaCabeceraDAOTest {
	FacturaCabeceraDAO facturaDAO = DAOFactory.getFactory().getFacturaCabeceraDAO();
    FacturaCabecera factura = new FacturaCabecera(10.85,15.2,8.23);
	private FacturaDetalle detalle1;
	private FacturaDetalle detalle2;
	private FacturaDetalle detalle3;
	private double subtotal;
	private double iva;
	private double total;
	private double procentaje=12;
    private List<FacturaDetalle> listaFacturaDetalle;
    int tiempoLimite = 70;
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
	
	
	public void agregarDetalle() {
		listaFacturaDetalle = new ArrayList<FacturaDetalle>();
		detalle1=new FacturaDetalle("Rayos X", 20.5);
		detalle2=new FacturaDetalle("Operacion", 150.5);
		detalle3=new FacturaDetalle("Roooo", 12.25);
		listaFacturaDetalle.add(detalle1);
		listaFacturaDetalle.add(detalle2);
		listaFacturaDetalle.add(detalle3);
	}
	
	
	@Test
	void testCalcularIvaSubtotalTotal() {
		agregarDetalle();
		subtotal=facturaDAO.calcularSubtotalFactura(listaFacturaDetalle);
		assertEquals(183.25, subtotal);
		iva=facturaDAO.calcularIvaFactura(subtotal, procentaje);
		assertEquals(21.99, iva);
		total=facturaDAO.calcularTotalFactura(subtotal, iva);
		assertEquals(205.24, total);
	}

}
