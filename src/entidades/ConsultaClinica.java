package entidades;

import java.io.Serializable;

import java.util.List;

import javax.persistence.*;

/**
 * Entity implementation class for Entity: ConsultaClinica
 * Autor Isaac Chavez
 */
@Entity

public class ConsultaClinica implements Serializable {

	
	private static final long serialVersionUID = 1L;
	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int codigo;
	private String sintoma;
	private String diagnostico;
	@ManyToOne
	@JoinColumn
	private HistorialClinico historial;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "consulta")
	private List<RecetaMedica> receta;

	public ConsultaClinica() {
		super();
	}

	public ConsultaClinica(int codigo, String sintoma, String diagnostico, HistorialClinico historial) {
		super();
		this.codigo = codigo;
		this.sintoma = sintoma;
		this.diagnostico = diagnostico;
		this.historial = historial;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getSintoma() {
		return sintoma;
	}

	public void setSintoma(String sintoma) {
		this.sintoma = sintoma;
	}

	public String getDiagnostico() {
		return diagnostico;
	}

	public void setDiagnostico(String diagnostico) {
		this.diagnostico = diagnostico;
	}

	public HistorialClinico getHistorial() {
		return historial;
	}

	public void setHistorial(HistorialClinico historial) {
		this.historial = historial;
	}
	
	
   
}
