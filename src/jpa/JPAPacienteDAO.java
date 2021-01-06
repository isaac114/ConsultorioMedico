package jpa;

import entidades.Paciente;

public class JPAPacienteDAO extends JPAGenericDAO<Paciente, Integer> {

	public JPAPacienteDAO() {
		super(Paciente.class);
		
	}
		
	
}
