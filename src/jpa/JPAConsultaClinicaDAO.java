package jpa;

import dao.ConsultaClinicaDAO;
import entidades.ConsultaClinica;

public class JPAConsultaClinicaDAO extends JPAGenericDAO<ConsultaClinica, Integer> implements ConsultaClinicaDAO {

	public JPAConsultaClinicaDAO() {
		super(ConsultaClinica.class);
		// TODO Auto-generated constructor stub
	}

}
