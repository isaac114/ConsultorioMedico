package dao;

import entidades.Persona;

public interface PersonaDAO {
	
	public abstract Persona buscar(String correo, String contrasena);

}
