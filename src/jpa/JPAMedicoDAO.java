package jpa;

import dao.MedicoDAO;
import entidades.Medico;
/*
 * Autor Isaac Chavez
 */
public class JPAMedicoDAO extends JPAGenericDAO<Medico, Integer> implements MedicoDAO {

	public JPAMedicoDAO() {
		super(Medico.class);
		// TODO Auto-generated constructor stub
	}

}