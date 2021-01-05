package entidades;

import java.io.Serializable; 
import javax.persistence.*;

/**
 * Entity implementation class for Entity: LibroDiario
 *
 */
@Entity

public class LibroDiario implements Serializable {
	
	private static final long serialVersionUID = 1L;
	private int id;
	private double costoTransaccion;
	private String fecha;
	private String cuentaInvolucrada;

	public LibroDiario() {
		super();
	}
   
}
