package entidades;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: OrdenMedica
 *
 */
@Entity

public class OrdenMedica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String fecha;
	private String nombreServicio;
	@ManyToOne
	@JoinColumn
	private Paciente pacienteOrdenMedica;
	@ManyToOne
	@JoinColumn
	private Medico medicoOrdenMedica;

	public OrdenMedica() {
		super();
	}

	public OrdenMedica(int codigo, String fecha, String nombreServicio, Paciente pacienteOrdenMedica,
			Medico medicoOrdenMedica) {
		super();
		this.codigo = codigo;
		this.fecha = fecha;
		this.nombreServicio = nombreServicio;
		this.pacienteOrdenMedica = pacienteOrdenMedica;
		this.medicoOrdenMedica = medicoOrdenMedica;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public String getNombreServicio() {
		return nombreServicio;
	}

	public void setNombreServicio(String nombreServicio) {
		this.nombreServicio = nombreServicio;
	}

	public Paciente getPacienteOrdenMedica() {
		return pacienteOrdenMedica;
	}

	public void setPacienteOrdenMedica(Paciente pacienteOrdenMedica) {
		this.pacienteOrdenMedica = pacienteOrdenMedica;
	}

	public Medico getMedicoOrdenMedica() {
		return medicoOrdenMedica;
	}

	public void setMedicoOrdenMedica(Medico medicoOrdenMedica) {
		this.medicoOrdenMedica = medicoOrdenMedica;
	}
	
   
}
