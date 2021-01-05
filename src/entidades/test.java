package entidades;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;



public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Comienza");
		EntityManagerFactory emfactory = Persistence.createEntityManagerFactory( "ConsultorioMedico" );
	      EntityManager entitymanager = emfactory.createEntityManager( );
	      entitymanager.getTransaction( ).begin( );
	      
	     Medico med = new Medico(0, "Eduardo", "Chavez", "0107371083", "isaac.114", "01072653", "Pbstetra");
	     
	     entitymanager.persist(med);
	     entitymanager.getTransaction().commit();
	      entitymanager.close();
	      emfactory.close();
	      System.out.println("termina");
	}

}
