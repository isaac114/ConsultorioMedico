package jpa;

import java.util.List;

import dao.CitaMedicaDAO;

import entidades.CitaMedica;


public class JPACitaMedicaDAO extends JPAGenericDAO<CitaMedica, Integer> implements CitaMedicaDAO{

	public JPACitaMedicaDAO() {
		super(CitaMedica.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<CitaMedica> findCitasMedicas() {
		
		String query = "SELECT c FROM CitaMedica c";
		List<CitaMedica> citas = em.createQuery(query).getResultList();
		em.close();
		return citas;
	}

}
