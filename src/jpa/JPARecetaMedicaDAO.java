package jpa;

import javax.persistence.Query;

import dao.RecetaMedicaDAO;
import entidades.RecetaMedica;
/*
 * Autor Isaac Chavez
 */
public class JPARecetaMedicaDAO extends JPAGenericDAO<RecetaMedica, Integer> implements RecetaMedicaDAO {
	
		public JPARecetaMedicaDAO() {
			super(RecetaMedica.class);
		}

		@Override
		public RecetaMedica buscarReceta(String cedula) {
			// TODO Auto-generated method stub
			Query query = em.createQuery("SELECT r FROM RecetaMedica r WHERE r.pacienteReceta.cedula = "+cedula);
			RecetaMedica receta = (RecetaMedica) query.getSingleResult();
			query.setParameter("cedula", cedula);
			return receta;
		}
		
		
}
