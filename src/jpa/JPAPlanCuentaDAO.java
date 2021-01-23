package jpa;

import entidades.PlanCuenta;
import dao.GenericDAO;
import dao.PlanCuentaDAO;

public class JPAPlanCuentaDAO extends JPAGenericDAO<PlanCuenta, Integer> implements PlanCuentaDAO{

	public JPAPlanCuentaDAO() {
		super(PlanCuenta.class);
	}

}
