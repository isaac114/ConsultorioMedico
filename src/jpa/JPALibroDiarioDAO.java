package jpa;

import entidades.LibroDiario;

public class JPALibroDiarioDAO extends JPAGenericDAO<LibroDiario, Integer>{

	public JPALibroDiarioDAO(Class<LibroDiario> persistentClass) {
		super(LibroDiario.class);
	}

}
