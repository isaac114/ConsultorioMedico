package jpa;

import javax.persistence.Query;

import dao.HistorialClinicoDAO;
import entidades.HistorialClinico;
import entidades.Paciente;
/*
 * Autor Isaac Chavez
 */
public class JPAHistorialClinicoDAO extends JPAGenericDAO<HistorialClinico, Integer> implements HistorialClinicoDAO {

	public JPAHistorialClinicoDAO() {
		super(HistorialClinico.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public HistorialClinico buscarPorPersona(int personaID) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("SELECT c FROM HistorialClinico c WHERE c.paciente.id= :ppersonaID");
		query.setParameter("ppersonaID", personaID);
		HistorialClinico historialClinico = (HistorialClinico) query.getSingleResult();
		return historialClinico;
	}

}
