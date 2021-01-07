package jpa;

import dao.CitaMedicaDAO;
import entidades.CitaMedica;


public class JPACitaMedicaDAO extends JPAGenericDAO<CitaMedica, Integer> implements CitaMedicaDAO{

	public JPACitaMedicaDAO() {
		super(CitaMedica.class);
		// TODO Auto-generated constructor stub
	}

}
