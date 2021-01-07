package jpa;



import javax.persistence.EntityManager;
import javax.persistence.Persistence;


import dao.GenericDAO;
/*
 * Autor Isaac Chavez
 */
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
    
    @Override
    public void update(T entity) {
	em.getTransaction().begin();
	try {
	    em.merge(entity);
	    em.getTransaction().commit();
	} catch (Exception e) {
	    System.out.println(">>>> ERROR:JPAGenericDAO:update " + e);
	    if (em.getTransaction().isActive())
		em.getTransaction().rollback();
		}
    }

    public T read(ID id) {
    	return em.find(persistentClass, id);
    	
    }

    public void delete(T entity) {
    	em.getTransaction().begin();
    	try {
    	    em.remove(entity);
    	    em.getTransaction().commit();
    	} catch (Exception e) {
    	    System.out.println(">>>> ERROR:JPAGenericDAO:delete " + e);
    	    if (em.getTransaction().isActive())
    		em.getTransaction().rollback();
    	}
        }


	
}
