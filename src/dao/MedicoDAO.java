package dao;
/*
 * Autor Isaac Chavez
 */
import entidades.Medico;

public interface MedicoDAO extends GenericDAO<Medico,Integer> {

	public abstract Medico buscarPorCedula(String cedula);
}
