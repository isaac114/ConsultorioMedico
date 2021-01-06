package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FacturaDetalle
 *
 */
@Entity

public class FacturaDetalle implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFacturaDetalle;
	private String descripcionFacturaDetalle;
	
	@ManyToOne
	private FacturaCabecera facturaDetalleCabecera;
	
	
	public FacturaDetalle() {
		super();
	}


	public FacturaDetalle(String descripcionFacturaDetalle, FacturaCabecera facturaDetalleCabecera) {
		super();
		this.descripcionFacturaDetalle = descripcionFacturaDetalle;
		this.facturaDetalleCabecera = facturaDetalleCabecera;
	}


	public int getIdFacturaDetalle() {
		return idFacturaDetalle;
	}


	public void setIdFacturaDetalle(int idFacturaDetalle) {
		this.idFacturaDetalle = idFacturaDetalle;
	}


	public String getDescripcionFacturaDetalle() {
		return descripcionFacturaDetalle;
	}


	public void setDescripcionFacturaDetalle(String descripcionFacturaDetalle) {
		this.descripcionFacturaDetalle = descripcionFacturaDetalle;
	}

	
	public FacturaCabecera getFacturaDetalleCabecera() {
		return facturaDetalleCabecera;
	}


	public void setFacturaDetalleCabecera(FacturaCabecera facturaDetalleCabecera) {
		this.facturaDetalleCabecera = facturaDetalleCabecera;
	}


	@Override
	public String toString() {
		return "FacturaDetalle [idFacturaDetalle=" + idFacturaDetalle + ", descripcionFacturaDetalle="
				+ descripcionFacturaDetalle + ", facturaDetalleCabecera=" + facturaDetalleCabecera + "]";
	}
	
   
}
