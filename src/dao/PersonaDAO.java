package dao;

import entidades.Persona;

public interface PersonaDAO extends GenericDAO<Persona, Integer> {
	
	public abstract Persona buscar(String correo, String contrasena);

}
