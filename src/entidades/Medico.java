package entidades;

import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Medico
 *Autor Isaac Chavez
 */
@Entity
@PrimaryKeyJoinColumn(referencedColumnName="id")

public class Medico extends Persona {

	private static final long serialVersionUID = 1L;
	private String especialidad;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "medico")
	private List<HistorialClinico> historial;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "medicoOrdenMedica")
	private List<OrdenMedica> ordenMedica;

	@OneToMany(cascade = CascadeType.ALL, mappedBy = "citaMedica")
	private List<CitaMedica> citaMedicas;
	
	public Medico() {
		super();
	}
	
	
	public Medico(int id, String nombres, String apellidos, String cedula, String correo, String contrasena, String telefono, String especialidad) {
		super(id, nombres, apellidos, cedula, correo, contrasena, telefono);
		this.especialidad = especialidad;
	}
	
	

	public String getEspecialidad() {
		return especialidad;
	}



	public void setEspecialidad(String especialidad) {
		this.especialidad = especialidad;
	}




	
	
   
}
