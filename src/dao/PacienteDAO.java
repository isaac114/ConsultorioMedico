package dao;


import java.util.List;

import entidades.Paciente;
/*
 * Autor Isaac Chavez
 */
public interface PacienteDAO extends GenericDAO<Paciente, Integer> {

	public abstract Paciente buscarPorCedula(String cedula);
	public abstract List<Paciente> listPacientes();
}
