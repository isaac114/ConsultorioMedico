package jpa;

import javax.persistence.Query;

import dao.PersonaDAO;
import entidades.Paciente;
import entidades.Persona;

public class JPAPersonaDAO extends JPAGenericDAO<Persona, Integer> implements PersonaDAO{

	public JPAPersonaDAO() {
		super(Persona.class);
	}
	
	@Override
	public Persona buscar(String correo, String contrasena) {
		Query query = em.createQuery("SELECT p FROM Persona p WHERE p.correo = :correo AND p.contrasena = :contrasena");
		query.setParameter("contrasena", contrasena);
		Persona persona = (Persona) query.getSingleResult();
		return persona;
	}

	
	
}
