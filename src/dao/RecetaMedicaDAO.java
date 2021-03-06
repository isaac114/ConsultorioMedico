package dao;

import entidades.RecetaMedica;
/*
 * Autor Isaac Chavez
 */
public interface RecetaMedicaDAO extends GenericDAO<RecetaMedica, Integer> {

	public abstract RecetaMedica buscarReceta(String cedula);
}
