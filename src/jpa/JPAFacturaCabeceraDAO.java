package jpa;

import java.util.List;

import dao.FacturaCabeceraDAO;
import entidades.FacturaCabecera;
import entidades.FacturaDetalle;
public class JPAFacturaCabeceraDAO extends JPAGenericDAO<FacturaCabecera, Integer> implements FacturaCabeceraDAO{

	public JPAFacturaCabeceraDAO(Class<FacturaCabecera> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double obtenerIva(double base, double porcentaje) {
        return base * porcentaje / 100;
    }
	
	@Override
	public double calcularTotalFactura(double subtotal, double ivaFacturaCabecera) {
		double iva=(ivaFacturaCabecera*subtotal)/100;
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

}
