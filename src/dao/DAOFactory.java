package dao;

import jpa.JPADAOFactory;
/*
 * Autor Isaac Chavez
 */
public abstract class DAOFactory {
	
	protected static DAOFactory factory = new JPADAOFactory();

    public static DAOFactory getFactory() {
    	return factory;
    }
    
    public abstract ConsultaClinicaDAO getConsultaClinicaDAO();
    
    public abstract HistorialClinicoDAO getHistorialClinicoDAO();
    
    public abstract MedicoDAO getMedicDAO();
    
    public abstract PacienteDAO getPacienteDAO();
    
    public abstract RecetaMedicaDAO getRecetaMedicaDAO();
    
    public abstract OrdenMedicaDAO getOrdenMedicaDAO();
    
    public abstract CitaMedicaDAO getCitaMedicaDAO();

}
