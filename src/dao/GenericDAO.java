package dao;

import java.util.List;
/*
 * Autor Isaac Chavez
 */
public interface GenericDAO<T,ID> {

	public void create(T entity);

	public void update(T entity);

    public T read(ID id); 
    	
    public void delete(T entity);
    
    
    
}
