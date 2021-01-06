package entidades;

import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: Paciente
 * Autor Isaac Chavez
 */
@Entity

public class Paciente extends Persona {

	
	private static final long serialVersionUID = 1L;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "paciente")
	private List<HistorialClinico> historial;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "pacienteReceta")
	private List<RecetaMedica> recetas;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "citaMedica")
	private List<CitaMedica> citaMedicas;
	public Paciente() {
		super();
	}
	
	public Paciente(int id, String nombres, String apellidos, String cedula, String correo, String telefono, String especialidad) {
		super(id, nombres, apellidos, cedula, correo, telefono);
		
	}
   
}
