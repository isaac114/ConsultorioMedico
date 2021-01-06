package jpa;

import dao.RecetaMedicaDAO;
import entidades.RecetaMedica;

public class JPARecetaMedicaDAO extends JPAGenericDAO<RecetaMedica, Integer> implements RecetaMedicaDAO {
	
		public JPARecetaMedicaDAO() {
			super(RecetaMedica.class);
		}
}
