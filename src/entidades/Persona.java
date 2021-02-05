package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: Persona
 *Autor Isaac Chavez
 */
@Entity
@Table
@Inheritance( strategy = InheritanceType.JOINED)

public class Persona implements Serializable {

	

	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue( strategy = GenerationType.AUTO )
	private int id;
	private String nombres;
	private String apellidos;
	private String cedula;
	private String correo;
	private String telefono;
	private String rol;
	
	public Persona() {
		super();
	}


	public Persona(int id, String nombres, String apellidos, String cedula, String correo, String telefono) {
		super();
		this.id = id;
		this.nombres = nombres;
		this.apellidos = apellidos;
		this.cedula = cedula;
		this.correo = correo;
		this.telefono = telefono;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getNombres() {
		return nombres;
	}


	public void setNombres(String nombres) {
		this.nombres = nombres;
	}


	public String getApellidos() {
		return apellidos;
	}


	public void setApellidos(String apellidos) {
		this.apellidos = apellidos;
	}


	public String getCedula() {
		return cedula;
	}


	public void setCedula(String cedula) {
		this.cedula = cedula;
	}


	public String getCorreo() {
		return correo;
	}


	public void setCorreo(String correo) {
		this.correo = correo;
	}


	public String getTelefono() {
		return telefono;
	}


	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	
	public String getRol() {
		return rol;
	}


	public void setRol(String rol) {
		this.rol = rol;
	}
   
}
