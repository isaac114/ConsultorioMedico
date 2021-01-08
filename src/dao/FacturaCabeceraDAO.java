package dao;
import java.util.List;
import entidades.FacturaCabecera;
import entidades.FacturaDetalle;
public interface FacturaCabeceraDAO extends GenericDAO<FacturaCabecera, Integer> {
	
	public abstract double calcularTotalFactura(double subtotal, double iva);
	public abstract double calcularIvaFactura(double subtotal, double porcentaje);
	public abstract double calcularSubtotalFactura(List<FacturaDetalle> listaFacturaDetalle);
	
}
