package dao;

import entidades.ConsultaClinica;

public interface ConsultaClinicaDAO extends GenericDAO<ConsultaClinica, Integer> {

	public abstract int obtenerUltimaConsulta(int idPaciente);
	public abstract ConsultaClinica buscarPorID(int idConsulta);
}
