package jpa;

import dao.FacturaCabeceraDAO;
import entidades.FacturaCabecera;
public class JPAFacturaCabeceraDAO extends JPAGenericDAO<FacturaCabecera, Integer> implements FacturaCabeceraDAO{

	public JPAFacturaCabeceraDAO(Class<FacturaCabecera> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

}
