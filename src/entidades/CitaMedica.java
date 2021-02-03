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
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String fecha;
	private String nombreSala;
	private char estado;
	@ManyToOne
	@JoinColumn
	
	private Medico medico;
	
	@ManyToOne
	@JoinColumn
	private Paciente citaMedica;
	
	public CitaMedica() {
		super();
	}

	
	public CitaMedica(int id, String fecha, String nombreSala) {
		super();
		this.id = id;
		this.fecha = fecha;
		this.nombreSala = nombreSala;
		
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
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
		return citaMedica;
	}

	public void setPaciente(Paciente citaMedica) {
		this.citaMedica = citaMedica;
	}

	public char getEstado() {
		return estado;
	}


	public void setEstado(char estado) {
		this.estado = estado;
	}


	public Paciente getCitaMedica() {
		return citaMedica;
	}


	public void setCitaMedica(Paciente citaMedica) {
		this.citaMedica = citaMedica;
	}


	@Override
	public String toString() {
		return "CitaMedica [id=" + id + ", fecha=" + fecha + ", nombreSala=" + nombreSala + ", medico=" + medico
				+ ", citaMedica=" + citaMedica + "]";
	}
   
	
}