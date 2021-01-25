package jpa;

import javax.persistence.Query;

import dao.ConsultaClinicaDAO;
import entidades.ConsultaClinica;

public class JPAConsultaClinicaDAO extends JPAGenericDAO<ConsultaClinica, Integer> implements ConsultaClinicaDAO {

	public JPAConsultaClinicaDAO() {
		super(ConsultaClinica.class);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int obtenerUltimaConsulta(int idPaciente) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("Select max(a.codigo) FROM ConsultaClinica a");
		int id = (int) query.getSingleResult();
		return id;
	}

	@Override
	public ConsultaClinica buscarPorID(int idConsulta) {
		// TODO Auto-generated method stub
		Query query = em.createQuery("Select a FROM ConsultaClinica a WHERE a.codigo = :codigo");
		query.setParameter("codigo", idConsulta);
		ConsultaClinica cc = (ConsultaClinica) query.getSingleResult();
		return cc;
	}

}
