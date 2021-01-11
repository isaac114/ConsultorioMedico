package jpa;

import dao.LibroDiarioDAO;
import entidades.LibroDiario;

public class JPALibroDiarioDAO extends JPAGenericDAO<LibroDiario, Integer> implements LibroDiarioDAO{

	public JPALibroDiarioDAO() {
		super(LibroDiario.class);
	}

}
