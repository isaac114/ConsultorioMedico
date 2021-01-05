package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Medico
 *
 */
@Entity

public class Medico implements Serializable {

	private static final long serialVersionUID = 1L;
	@Id
	private int codigo;

	public Medico() {
		super();
	}
   
}
