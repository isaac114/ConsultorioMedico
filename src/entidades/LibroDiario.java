package entidades;

import java.io.Serializable;
import java.util.List;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: LibroDiario
 *
 */
@Entity

public class LibroDiario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double costoTransaccion;
	private String fecha;
	private String cuentaInvolucrada;
	private List<PlanCuenta> planCuenta;
	
	public LibroDiario() {
		super();
	}

	public LibroDiario(int id, double costoTransaccion, String fecha, String cuentaInvolucrada,
			List<PlanCuenta> planCuenta) {
		super();
		this.id = id;
		this.costoTransaccion = costoTransaccion;
		this.fecha = fecha;
		this.cuentaInvolucrada = cuentaInvolucrada;
		this.planCuenta = planCuenta;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getCostoTransaccion() {
		return costoTransaccion;
	}

	public void setCostoTransaccion(double costoTransaccion) {
		this.costoTransaccion = costoTransaccion;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getCuentaInvolucrada() {
		return cuentaInvolucrada;
	}

	public void setCuentaInvolucrada(String cuentaInvolucrada) {
		this.cuentaInvolucrada = cuentaInvolucrada;
	}

	public List<PlanCuenta> getPlanCuenta() {
		return planCuenta;
	}

	public void setPlanCuenta(List<PlanCuenta> planCuenta) {
		this.planCuenta = planCuenta;
	}

	@Override
	public String toString() {
		return "LibroDiario [id=" + id + ", costoTransaccion=" + costoTransaccion + ", fecha=" + fecha
				+ ", cuentaInvolucrada=" + cuentaInvolucrada + ", planCuenta=" + planCuenta + "]";
	}
   
}
