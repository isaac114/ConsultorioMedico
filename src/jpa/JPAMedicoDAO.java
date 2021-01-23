package jpa;

import javax.persistence.Query;

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

	@Override
	public Medico buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("SELECT m FROM Medico m WHERE m.cedula = :cedula");
		query.setParameter("cedula", cedula);
		Medico medico = (Medico) query.getSingleResult();
		return medico;
	}

}
