/*
 * Autor Isaac Chavez
 */
package dao;

import entidades.OrdenMedica;


public interface OrdenMedicaDAO extends GenericDAO<OrdenMedica, Integer> {

	public abstract int obtenerUltimaOrden (int idPaciente);
}
