package jpa;

import java.util.List;

import dao.FacturaCabeceraDAO;
import entidades.FacturaCabecera;
import entidades.FacturaDetalle;
public class JPAFacturaCabeceraDAO extends JPAGenericDAO<FacturaCabecera, Integer> implements FacturaCabeceraDAO{

	public JPAFacturaCabeceraDAO() {
		super(FacturaCabecera.class);
		
	}
	//Metodos adicionales de la clase Factura Cabecera

	@Override
	public double calcularTotalFactura(double subtotal, double iva) {
		return subtotal+iva;
	}

	@Override
	public double calcularSubtotalFactura(List<FacturaDetalle> listaFacturaDetalle) {
		double subtotal=0;
		for(int i=0; i<listaFacturaDetalle.size();i++) {
			subtotal= subtotal + listaFacturaDetalle.get(i).getCostoFacturaDetalle();
		}
		return subtotal;
	}

	@Override
	public double calcularIvaFactura(double subtotal, double porcentaje) {

		double iva=(porcentaje*subtotal)/100;
		return iva;
	}

}
