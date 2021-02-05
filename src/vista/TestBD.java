package vista;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import dao.DAOFactory;
import entidades.*;
/**
 * Application Lifecycle Listener implementation class TestBD
 *
 */
@WebListener
public class TestBD implements ServletContextListener {

    /**
     * Default constructor. 
     */
    public TestBD() {
        // TODO Auto-generated constructor stub
    }

	

	/**
     * @see ServletContextListener#contextDestroyed(ServletContextEvent)
     */
    public void contextDestroyed(ServletContextEvent sce)  { 
         // TODO Auto-generated method stub
    }

	/**
     * @see ServletContextListener#contextInitialized(ServletContextEvent)
     */
    public void contextInitialized(ServletContextEvent sce)  { 
    	/*Medico med = new Medico(0, "George Jorge", "Yela Yela", "01025215625", "yela@docto.com", "12434", "23445","Medico","M");
    	DAOFactory.getFactory().getMedicDAO().create(med);
    	
    	Paciente pac1 = new Paciente(0, "William Sinchi", "Sinchi Sinchi", "0102518265", "wsinchi@paciente.com", "12523", "4111422", "P");
    	Paciente pac2 = new Paciente(0, "Jessica Marible", "Guncay", "0102251615", "jessica@paciente.com", "12523", "4111422", "P");
    	Paciente pac3 = new Paciente(0, "Isaac George", "Chavez", "010526365", "issac@paciente.com", "12523", "4111422", "P");
    	DAOFactory.getFactory().getPacienteDAO().create(pac1);
    	DAOFactory.getFactory().getPacienteDAO().create(pac2);
    	DAOFactory.getFactory().getPacienteDAO().create(pac3);*/
    	
       /*
        **************EJEMPLO****************}
        TipoTelfExamenDAO tipoDAO = DAOFactory.getFactory().getTipoTelfExamenDAO();
    	OperadoraExamenDAO operadoraDAO = DAOFactory.getFactory().getOperadoraExamenDAO();
    	
    	TipoTelfExamen tipo1=new TipoTelfExamen("Convencional");
    	tipoDAO.create(tipo1);
    	
    	TipoTelfExamen tipo2=new TipoTelfExamen("Celular");
    	tipoDAO.create(tipo2);
    	
    	
    	OperadoraExamen ope1=new OperadoraExamen("Claro");
    	OperadoraExamen ope2=new OperadoraExamen("Movistar");
    	OperadoraExamen ope3=new OperadoraExamen("Tuenti");
    	OperadoraExamen ope4=new OperadoraExamen("CNT");
    	operadoraDAO.create(ope1);
    	operadoraDAO.create(ope2);
    	operadoraDAO.create(ope3);
    	operadoraDAO.create(ope4); 
      */
    

    	
    	
    }
    
	
}
