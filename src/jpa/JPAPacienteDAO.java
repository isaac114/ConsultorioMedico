package jpa;

import dao.PacienteDAO;
import entidades.Paciente;
/*
 * Autor Isaac Chavez
 */
public class JPAPacienteDAO extends JPAGenericDAO<Paciente, Integer> implements PacienteDAO {

	public JPAPacienteDAO() {
		super(Paciente.class);
		
	}
		
	
}
