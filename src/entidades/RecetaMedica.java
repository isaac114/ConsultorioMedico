package entidades;

import java.io.Serializable;
import javax.persistence.*;

/**
 * Entity implementation class for Entity: RecetaMedica
 *
 */
@Entity

public class RecetaMedica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String medicamento;
	private int cantidad;
	private String frecuencia;
	@ManyToOne
	@JoinColumn
	private Paciente pacienteReceta;
	@ManyToOne
	@JoinColumn
	private ConsultaClinica consulta;
	
	

	public RecetaMedica() {
		super();
	}



	public RecetaMedica(int codigo, String medicamento, int cantidad, String frecuencia, Paciente pacienteReceta,
			ConsultaClinica consulta) {
		super();
		this.codigo = codigo;
		this.medicamento = medicamento;
		this.cantidad = cantidad;
		this.frecuencia = frecuencia;
		this.pacienteReceta = pacienteReceta;
		this.consulta = consulta;
	}



	public int getCodigo() {
		return codigo;
	}



	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}



	public String getMedicamento() {
		return medicamento;
	}



	public void setMedicamento(String medicamento) {
		this.medicamento = medicamento;
	}



	public int getCantidad() {
		return cantidad;
	}



	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}



	public String getFrecuencia() {
		return frecuencia;
	}



	public void setFrecuencia(String frecuencia) {
		this.frecuencia = frecuencia;
	}



	public Paciente getPacienteReceta() {
		return pacienteReceta;
	}



	public void setPacienteReceta(Paciente pacienteReceta) {
		this.pacienteReceta = pacienteReceta;
	}



	public ConsultaClinica getConsulta() {
		return consulta;
	}



	public void setConsulta(ConsultaClinica consulta) {
		this.consulta = consulta;
	}
	
	
   
}
