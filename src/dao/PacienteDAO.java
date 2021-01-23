package dao;


import entidades.Paciente;
/*
 * Autor Isaac Chavez
 */
public interface PacienteDAO extends GenericDAO<Paciente, Integer> {

	public abstract Paciente buscarPorCedula(String cedula);
}
