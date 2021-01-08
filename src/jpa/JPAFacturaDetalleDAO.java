package jpa;
import entidades.FacturaDetalle;
import dao.FacturaDetalleDAO;
public class JPAFacturaDetalleDAO extends JPAGenericDAO<FacturaDetalle, Integer> implements FacturaDetalleDAO{

	public JPAFacturaDetalleDAO() {
		super(FacturaDetalle.class);
		// TODO Auto-generated constructor stub
	}

}
