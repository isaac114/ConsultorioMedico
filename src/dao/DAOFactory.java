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
    
    

}
