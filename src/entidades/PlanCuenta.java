package entidades;

import java.io.Serializable; 
import javax.persistence.*;

/**
 * Entity implementation class for Entity: PlanCuenta
 *
 */
@Entity

public class PlanCuenta implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private double activos;
	private double pasivos; 

	public PlanCuenta() {
		super();
	}

	public PlanCuenta(int id, double activos, double pasivos) {
		super();
		this.id = id;
		this.activos = activos;
		this.pasivos = pasivos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getActivos() {
		return activos;
	}

	public void setActivos(double activos) {
		this.activos = activos;
	}

	public double getPasivos() {
		return pasivos;
	}

	public void setPasivos(double pasivos) {
		this.pasivos = pasivos;
	}

	@Override
	public String toString() {
		return "PlanCuenta [id=" + id + ", activos=" + activos + ", pasivos=" + pasivos + "]";
	}
   
}
