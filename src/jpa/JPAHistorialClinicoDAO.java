package jpa;

import dao.HistorialClinicoDAO;
import entidades.HistorialClinico;
/*
 * Autor Isaac Chavez
 */
public class JPAHistorialClinicoDAO extends JPAGenericDAO<HistorialClinico, Integer> implements HistorialClinicoDAO {

	public JPAHistorialClinicoDAO() {
		super(HistorialClinico.class);
		// TODO Auto-generated constructor stub
	}

}
