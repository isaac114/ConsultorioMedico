package dao;
/*
 * Autor Isaac Chavez
 */
import entidades.HistorialClinico;

public interface HistorialClinicoDAO extends GenericDAO<HistorialClinico, Integer> {

	public abstract HistorialClinico buscarPorPersona(int personaID);
}
