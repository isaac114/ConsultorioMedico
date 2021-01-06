package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: FacturaCabecera
 *
 */
@Entity

public class FacturaCabecera implements Serializable {

	//Atributos de Factura Cabecera
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int idFacturaCabecera;
	
	private double totalFacturaCabecera;
	private double subtotalFacturaCabecera;
	private double ivaFacturaCabecera;
	
	@ManyToOne
	private Paciente pacienteFactura;
	
	@OneToMany
	private List<FacturaDetalle> listaFacturaDetalle;
	
	
	
	public FacturaCabecera() {
		super();
	}

	public FacturaCabecera(double totalFacturaCabecera, double subtotalFacturaCabecera, double ivaFacturaCabecera,
			Paciente pacienteFactura, List<FacturaDetalle> listaFacturaDetalle) {
		super();
		this.totalFacturaCabecera = totalFacturaCabecera;
		this.subtotalFacturaCabecera = subtotalFacturaCabecera;
		this.ivaFacturaCabecera = ivaFacturaCabecera;
		this.pacienteFactura = pacienteFactura;
		this.listaFacturaDetalle = listaFacturaDetalle;
	}

	public int getIdFacturaCabecera() {
		return idFacturaCabecera;
	}



	public void setIdFacturaCabecera(int idFacturaCabecera) {
		this.idFacturaCabecera = idFacturaCabecera;
	}



	public double getTotalFacturaCabecera() {
		return totalFacturaCabecera;
	}



	public void setTotalFacturaCabecera(double totalFacturaCabecera) {
		this.totalFacturaCabecera = totalFacturaCabecera;
	}



	public double getSubtotalFacturaCabecera() {
		return subtotalFacturaCabecera;
	}



	public void setSubtotalFacturaCabecera(double subtotalFacturaCabecera) {
		this.subtotalFacturaCabecera = subtotalFacturaCabecera;
	}



	public double getIvaFacturaCabecera() {
		return ivaFacturaCabecera;
	}



	public void setIvaFacturaCabecera(double ivaFacturaCabecera) {
		this.ivaFacturaCabecera = ivaFacturaCabecera;
	}



	public Paciente getPacienteFactura() {
		return pacienteFactura;
	}



	public void setPacienteFactura(Paciente pacienteFactura) {
		this.pacienteFactura = pacienteFactura;
	}

	
	public List<FacturaDetalle> getListaFacturaDetalle() {
		return listaFacturaDetalle;
	}

	public void setListaFacturaDetalle(List<FacturaDetalle> listaFacturaDetalle) {
		this.listaFacturaDetalle = listaFacturaDetalle;
	}

	@Override
	public String toString() {
		return "FacturaCabecera [idFacturaCabecera=" + idFacturaCabecera + ", totalFacturaCabecera="
				+ totalFacturaCabecera + ", subtotalFacturaCabecera=" + subtotalFacturaCabecera
				+ ", ivaFacturaCabecera=" + ivaFacturaCabecera + ", pacienteFactura=" + pacienteFactura
				+ ", listaFacturaDetalle=" + listaFacturaDetalle + "]";
	}
	
	
	
   
}
