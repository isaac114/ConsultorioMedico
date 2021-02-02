package dao;

import java.util.List;

import entidades.CitaMedica;

public interface CitaMedicaDAO extends GenericDAO<CitaMedica, Integer> {
	public abstract List<CitaMedica> findCitasMedicas();
}
