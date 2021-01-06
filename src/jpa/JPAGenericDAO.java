package jpa;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;

import dao.GenericDAO;

public class JPAGenericDAO<T, ID> implements GenericDAO<T, ID> {
	
    private Class<T> persistentClass;
    protected EntityManager em;
    
    public JPAGenericDAO(Class<T> persistentClass) {
    	this.persistentClass = persistentClass;
    	this.em = Persistence.createEntityManagerFactory("ConsultorioMedico").createEntityManager();
    }
    
    @Override
	public void create(T entity) {
		// TODO Auto-generated method stub
		em.getTransaction().begin();
		try {
		    em.persist(entity);
		    em.getTransaction().commit();
		} catch (Exception e) {
		    System.out.println(">>>> ERROR:JPAGenericDAO:create " + e);
		    if (em.getTransaction().isActive())
			em.getTransaction().rollback();
		}
		
	}
	

}
