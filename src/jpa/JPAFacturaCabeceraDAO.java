package jpa;

import dao.FacturaCabeceraDAO;
import entidades.FacturaCabecera;
public class JPAFacturaCabeceraDAO extends JPAGenericDAO<FacturaCabecera, Integer> implements FacturaCabeceraDAO{

	public JPAFacturaCabeceraDAO(Class<FacturaCabecera> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

	
	@Override
	public double obtenerIva(double base, double porcentaje) {
        return base * porcentaje / 100;
    }
	
}
