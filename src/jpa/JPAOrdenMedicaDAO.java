package jpa;

import javax.persistence.Query;

import dao.OrdenMedicaDAO;
import entidades.OrdenMedica;

public class JPAOrdenMedicaDAO extends JPAGenericDAO<OrdenMedica, Integer> implements OrdenMedicaDAO {

	public JPAOrdenMedicaDAO() {
		super(OrdenMedica.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int obtenerUltimaOrden(int idPaciente) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("Select max(a.codigo) FROM OrdenMedica a");
		int id = (int) query.getSingleResult();
		return id;
	}

}
