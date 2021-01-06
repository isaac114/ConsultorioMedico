package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: HistorialClinico
 *
 */
@Entity

public class HistorialClinico implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	@ManyToOne
	@JoinColumn
	private Medico medico;
	@ManyToOne
	@JoinColumn
	private Paciente paciente;
	

	public HistorialClinico() {
		super();
	}
	
	
   
}
