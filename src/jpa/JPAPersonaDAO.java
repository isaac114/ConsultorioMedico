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
		Persona usuario=null;
		String queryFindUsuario="SELECT u FROM Persona u WHERE u.correo=:correoUsu AND u.contrasena=:contrasenaUsu";
		System.out.println("Correo"+correo+" passwprd"+contrasena);
		try {
			usuario = (Persona) em.createQuery(queryFindUsuario).setParameter("correoUsu",correo ).setParameter("contrasenaUsu", contrasena).getSingleResult();
			em.close();
		}catch(Exception e) {
			System.out.println("Error al buscar El usuario");
		}
		
		return usuario;
	}

	
	
}
