package entidades;

import java.io.Serializable;
import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: HistorialClinico
 *
 */
@Entity
@Table(name="HistorialClinico")
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
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "historial" )
	private List<ConsultaClinica> consultaCliList;
	
	public HistorialClinico() {
		super();
	}

	public HistorialClinico(int id, Medico medico, Paciente paciente) {
		super();
		this.id = id;
		this.medico = medico;
		this.paciente = paciente;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Medico getMedico() {
		return medico;
	}

	public void setMedico(Medico medico) {
		this.medico = medico;
	}

	public Paciente getPaciente() {
		return paciente;
	}

	public void setPaciente(Paciente paciente) {
		this.paciente = paciente;
	}
	
	
   
}