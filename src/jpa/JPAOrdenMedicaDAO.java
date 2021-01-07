package jpa;

import dao.OrdenMedicaDAO;
import entidades.OrdenMedica;

public class JPAOrdenMedicaDAO extends JPAGenericDAO<OrdenMedica, Integer> implements OrdenMedicaDAO {

	public JPAOrdenMedicaDAO() {
		super(OrdenMedica.class);
		// TODO Auto-generated constructor stub
	}

}
