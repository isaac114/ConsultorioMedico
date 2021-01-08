package vista;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import javax.servlet.annotation.WebListener;

import dao.CitaMedicaDAO;
import dao.DAOFactory;
import entidades.CitaMedica;


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
    
    	CitaMedicaDAO citaMedicaDAO = DAOFactory.getFactory().getCitaMedicaDAO();
    	
    	
    }
    
	
}
