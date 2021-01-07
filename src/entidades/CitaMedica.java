package entidades;

import java.io.Serializable;
import java.sql.Date;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: CitaMedica
 * Autor Jessica Guncay
 */

@Entity
public class CitaMedica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id
	private int id;
	private Date fecha;
	private String nombreSala;
	private Medico medico;
	private Paciente paciente;
	@ManyToOne
	@JoinColumn
	private Paciente citaMedica;
	
	public CitaMedica() {
		super();
	}

	
	public CitaMedica(int id, Date fecha, String nombreSala, Medico medico, Paciente paciente) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.nombreSala = nombreSala;
		this.medico = medico;
		this.paciente = paciente;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Date getFecha() {
		return fecha;
	}

	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}

	public String getNombreSala() {
		return nombreSala;
	}

	public void setNombreSala(String nombreSala) {
		this.nombreSala = nombreSala;
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

	@Override
	public String toString() {
		return "CitaMedica [id=" + id + ", fecha=" + fecha + ", nombreSala=" + nombreSala + ", medico=" + medico
				+ ", paciente=" + paciente + "]";
	}
   
	
}