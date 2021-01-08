package jpa;

import dao.CitaMedicaDAO;
import dao.ConsultaClinicaDAO;
import dao.DAOFactory;
import dao.FacturaCabeceraDAO;
import dao.FacturaDetalleDAO;
import dao.HistorialClinicoDAO;
import dao.MedicoDAO;
import dao.OrdenMedicaDAO;
import dao.PacienteDAO;
import dao.RecetaMedicaDAO;

public class JPADAOFactory extends DAOFactory{

	@Override
	public ConsultaClinicaDAO getConsultaClinicaDAO() {
		// TODO Auto-generated method stub
		return new JPAConsultaClinicaDAO();
	}

	@Override
	public HistorialClinicoDAO getHistorialClinicoDAO() {
		// TODO Auto-generated method stub
		return new JPAHistorialClinicoDAO();
	}

	@Override
	public MedicoDAO getMedicDAO() {
		// TODO Auto-generated method stub
		return new JPAMedicoDAO();
	}

	@Override
	public PacienteDAO getPacienteDAO() {
		// TODO Auto-generated method stub
		return new JPAPacienteDAO();
	}

	@Override
	public RecetaMedicaDAO getRecetaMedicaDAO() {
		// TODO Auto-generated method stub
		return new JPARecetaMedicaDAO();
	}

	@Override
	public OrdenMedicaDAO getOrdenMedicaDAO() {
		// TODO Auto-generated method stub
		return new JPAOrdenMedicaDAO();
	}

	@Override
	public CitaMedicaDAO getCitaMedicaDAO() {
		// TODO Auto-generated method stub
		return new JPACitaMedicaDAO();
	}

	@Override
	public FacturaCabeceraDAO getFacturaCabeceraDAO() {
		// TODO Auto-generated method stub
		return new JPAFacturaCabeceraDAO();
	}

	@Override
	public FacturaDetalleDAO getFacturaDetalleDAO() {
		// TODO Auto-generated method stub
		return new JPAFacturaDetalleDAO();
	}

	

}
