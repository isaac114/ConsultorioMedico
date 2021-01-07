package jpa;
import entidades.FacturaDetalle;
import dao.FacturaDetalleDAO;
public class JPAFacturaDetalleDAO extends JPAGenericDAO<FacturaDetalle, Integer> implements FacturaDetalleDAO{

	public JPAFacturaDetalleDAO(Class<FacturaDetalle> persistentClass) {
		super(persistentClass);
		// TODO Auto-generated constructor stub
	}

}
