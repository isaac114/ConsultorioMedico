package jpa;

import javax.persistence.Query;

import dao.PacienteDAO;
import entidades.Paciente;
/*
 * Autor Isaac Chavez
 */
public class JPAPacienteDAO extends JPAGenericDAO<Paciente, Integer> implements PacienteDAO {

	public JPAPacienteDAO() {
		super(Paciente.class);
		
	}

	@Override
	public Paciente buscarPorCedula(String cedula) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("SELECT p FROM Paciente p WHERE p.cedula = :cedula");
		query.setParameter("cedula", cedula);
		Paciente paciente = (Paciente) query.getSingleResult();
		return paciente;
	}
		
	
}
