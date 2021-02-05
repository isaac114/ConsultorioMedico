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
		System.out.println(correo+"----"+contrasena);
		String queryFindUsuario="SELECT p FROM Persona p WHERE p.correo=:correoUsu AND p.contrasena=:contrasenaUsu";
		try{
			usuario = (Persona) em.createQuery(queryFindUsuario).setParameter("correoUsu",correo).setParameter("contrasenaUsu",contrasena).getSingleResult();
			System.out.println("El usuario"+ usuario);
			em.close();
		}catch (Exception e) {
			System.out.println("No se recupero el Usuario");
		}
		return usuario;
	}

	
	
}
